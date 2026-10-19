package D6;

import androidx.compose.runtime.I;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.i;
import p259v1.j;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2803b;

    public /* synthetic */ a(int i10) {
        this.f2803b = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2803b) {
            case 0:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 1:
                return i.g(((I) obj).f12850b, ((I) obj2).f12850b);
            default:
                return ((j.a) Collections.max((List) obj)).compareTo((j.a) Collections.max((List) obj2));
        }
    }
}
