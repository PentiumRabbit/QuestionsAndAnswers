package com.robot.answers;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.popup.ComponentPopupBuilder;
import com.intellij.openapi.ui.popup.JBPopup;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.wm.WindowManager;
import com.intellij.ui.awt.RelativePoint;
import com.intellij.util.ui.JBUI;
import com.intellij.util.ui.UIUtil;
import com.robot.answers.net.NetRunnable;
import com.robot.answers.ui.ResultListPopup;
import com.robot.answers.ui.SearchPop;

import java.awt.Component;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;

public class InputQuestions extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {

        new Thread(new NetRunnable()).start();

        List<String> popList = new ArrayList<String>();
        popList.add("1");
        popList.add("2");
        popList.add("3");
        popList.add("4");
        popList.add("5");
        popList.add("6");

//        Editor editor = e.getData(PlatformDataKeys.EDITOR);
//        if (editor==null){
//            return;
//        }

//        SelectionModel selectionModel = editor.getSelectionModel();
//        VisualPosition selectionStartPosition = selectionModel.getSelectionStartPosition();
        ResultListPopup resultListPopup = new ResultListPopup(popList);
//        ApplicationManager.getApplication().invokeLater()

//        ListPopup listPopup = JBPopupFactory.getInstance().createListPopup(resultListPopup);
//        listPopup.show(new RelativePoint(new Point(300,300)));

        SearchPop searchPop = new SearchPop();
        ComponentPopupBuilder componentPopupBuilder = JBPopupFactory.getInstance().createComponentPopupBuilder(searchPop, null);

        JBPopup myBalloon = componentPopupBuilder
                .setCancelOnClickOutside(true)
                .setModalContext(false)
                .setRequestFocus(true)
                .createPopup();
        myBalloon.getContent().setBorder(JBUI.Borders.empty());

        Project project = e.getProject();
        Window window = WindowManager.getInstance().suggestParentWindow(project);

        Component parent = UIUtil.findUltimateParent(window);

        RelativePoint showPoint = JBPopupFactory.getInstance().guessBestPopupLocation(e.getDataContext());
        myBalloon.show(showPoint);
    }

}
