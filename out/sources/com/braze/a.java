package com.braze;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return Braze.Companion.wipeData$lambda$9(file, str);
    }
}
