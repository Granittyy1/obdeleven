package p235t1;

import androidx.media3.exoplayer.source.i;
import java.io.IOException;
import p114j1.f;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i.a f47034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f47035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f47036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ IOException f47037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f47038f;

    public /* synthetic */ m(i.a aVar, j jVar, k kVar, IOException iOException, boolean z10) {
        this.f47034b = aVar;
        this.f47035c = jVar;
        this.f47036d = kVar;
        this.f47037e = iOException;
        this.f47038f = z10;
    }

    @Override // p114j1.f
    public final void a(Object obj) {
        i iVar = (i) obj;
        i.a aVar = this.f47034b;
        iVar.H(aVar.f18703a, aVar.f18704b, this.f47035c, this.f47036d, this.f47037e, this.f47038f);
    }
}
