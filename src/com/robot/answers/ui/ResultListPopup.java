package com.robot.answers.ui;

import com.intellij.openapi.ui.popup.ListPopupStep;
import com.intellij.openapi.ui.popup.ListSeparator;
import com.intellij.openapi.ui.popup.MnemonicNavigationFilter;
import com.intellij.openapi.ui.popup.PopupStep;
import com.intellij.openapi.ui.popup.SpeedSearchFilter;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import javax.swing.Icon;

/**
 * Created by zhaoruyang on 6/6/16.
 */
public class ResultListPopup implements ListPopupStep {

    private List<String> list;

    public ResultListPopup(List<String> list) {
        this.list = list;
    }

    @NotNull
    @Override
    public List getValues() {
        return list;
    }

    @Override
    public boolean isSelectable(Object o) {
        return true;
    }

    @Nullable
    @Override
    public Icon getIconFor(Object o) {
        return null;
    }

    @NotNull
    @Override
    public String getTextFor(Object o) {
        return (String) o;
    }

    @Nullable
    @Override
    public ListSeparator getSeparatorAbove(Object o) {
        return null;
    }

    @Override
    public int getDefaultOptionIndex() {
        return 0;
    }

    @Nullable
    @Override
    public String getTitle() {
        return "getTitle";
    }

    @Nullable
    @Override
    public PopupStep onChosen(Object o, boolean b) {
        return null;
    }

    @Override
    public boolean hasSubstep(Object o) {
        return false;
    }

    @Override
    public void canceled() {

    }

    @Override
    public boolean isMnemonicsNavigationEnabled() {
        return false;
    }

    @Nullable
    @Override
    public MnemonicNavigationFilter getMnemonicNavigationFilter() {
        return null;
    }

    @Override
    public boolean isSpeedSearchEnabled() {
        return false;
    }

    @Nullable
    @Override
    public SpeedSearchFilter getSpeedSearchFilter() {
        return null;
    }

    @Override
    public boolean isAutoSelectionEnabled() {
        return false;
    }

    @Nullable
    @Override
    public Runnable getFinalRunnable() {
        return null;
    }
}
