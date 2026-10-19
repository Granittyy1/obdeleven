package p190p4;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        i.d(name, "name");
        return new Regex(String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3))).e(name);
    }
}
