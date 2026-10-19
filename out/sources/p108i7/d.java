package p108i7;

import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.a;
import p191p5.h;

/* JADX INFO: compiled from: GetAuthTokenListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f36763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h<f> f36764b;

    public d(i iVar, h<f> hVar) {
        this.f36763a = iVar;
        this.f36764b = hVar;
    }

    @Override // p108i7.h
    public final boolean a(a aVar) {
        if (aVar.f() != PersistedInstallation.RegistrationStatus.f28219e || this.f36763a.a(aVar)) {
            return false;
        }
        String str = aVar.f28224d;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f36764b.b(new a(str, aVar.f28226f, aVar.f28227g));
        return true;
    }

    @Override // p108i7.h
    public final boolean b(Exception exc) {
        this.f36764b.c(exc);
        return true;
    }
}
