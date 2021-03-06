package io.github.lizhangqu.intellij.android.bundle;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.vfs.VirtualFile;
import icons.AndroidIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SoBundleFileType implements FileType {
    public static final SoBundleFileType INSTANCE = new SoBundleFileType();

    @NotNull
    @Override
    public String getName() {
        return "so";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Android Plugin Bundle";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "so";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AndroidIcons.AndroidFile;
    }

    @Override
    public boolean isBinary() {
        return true;
    }

    @Override
    public boolean isReadOnly() {
        return true;
    }

    @Nullable
    @Override
    public String getCharset(@NotNull VirtualFile file, @NotNull byte[] content) {
        return null;
    }
}
