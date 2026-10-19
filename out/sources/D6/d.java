package D6;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2804b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2804b) {
            case 0:
                String name = ((File) obj).getName();
                int i10 = e.f2806f;
                return name.substring(0, i10).compareTo(((File) obj2).getName().substring(0, i10));
            default:
                return Integer.compare(((g2.e.a) obj).f35527a.f35530b, ((g2.e.a) obj2).f35527a.f35530b);
        }
    }
}
