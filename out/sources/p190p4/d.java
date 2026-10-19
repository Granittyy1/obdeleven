package p190p4;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45803a;

    public /* synthetic */ d(int i10) {
        this.f45803a = i10;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        switch (this.f45803a) {
            case 0:
                i.d(name, "name");
                return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1))).e(name);
            default:
                return name.startsWith("aqs.");
        }
    }
}
