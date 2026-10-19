package p259v1;

import android.media.AudioFormat;
import android.media.Spatializer;
import com.google.common.base.e;
import java.util.Objects;
import p078g1.C2198d;
import p078g1.n;
import p114j1.A;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f47528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j.d f47529c;

    public /* synthetic */ i(j jVar, j.d dVar) {
        this.f47528b = jVar;
        this.f47529c = dVar;
    }

    @Override // com.google.common.base.e
    public final boolean apply(Object obj) {
        int i10;
        j.f fVar;
        boolean zCanBeSpatialized;
        j.f fVar2;
        n nVar = (n) obj;
        j jVar = this.f47528b;
        if (!this.f47529c.f47569z || (i10 = nVar.f35279D) == -1 || i10 <= 2) {
            return true;
        }
        String str = nVar.f35302n;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac3":
                case "audio/ac4":
                case "audio/eac3":
                    if (A.f40996a < 32 || (fVar2 = jVar.f47535g) == null || !fVar2.f47580b) {
                        return true;
                    }
                    break;
            }
        }
        if (A.f40996a >= 32 && (fVar = jVar.f47535g) != null && fVar.f47580b) {
            Spatializer spatializer = fVar.f47579a;
            spatializer.getClass();
            if (o.a(spatializer).isAvailable()) {
                Spatializer spatializer2 = jVar.f47535g.f47579a;
                spatializer2.getClass();
                if (o.a(spatializer2).isEnabled()) {
                    j.f fVar3 = jVar.f47535g;
                    C2198d c2198d = jVar.f47536h;
                    fVar3.getClass();
                    boolean zEquals = Objects.equals(str, "audio/eac3-joc");
                    int i11 = nVar.f35279D;
                    if (zEquals) {
                        if (i11 == 16) {
                            i11 = 12;
                        }
                    } else if (Objects.equals(str, "audio/iamf")) {
                        if (i11 == -1) {
                            i11 = 6;
                        }
                    } else if (Objects.equals(str, "audio/ac4") && (i11 == 18 || i11 == 21)) {
                        i11 = 24;
                    }
                    int iO = A.o(i11);
                    if (iO == 0) {
                        zCanBeSpatialized = false;
                    } else {
                        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iO);
                        int i12 = nVar.f35280E;
                        if (i12 != -1) {
                            channelMask.setSampleRate(i12);
                        }
                        Spatializer spatializer3 = fVar3.f47579a;
                        spatializer3.getClass();
                        zCanBeSpatialized = o.a(spatializer3).canBeSpatialized(c2198d.a().f35246a, channelMask.build());
                    }
                    if (zCanBeSpatialized) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
