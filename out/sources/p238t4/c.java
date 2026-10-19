package p238t4;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        i.d(name, "name");
        return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1))).e(name);
    }
}
