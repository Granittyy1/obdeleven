package p108i7;

import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.a;
import p191p5.h;

/* JADX INFO: compiled from: GetIdListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h<String> f36765a;

    public e(h<String> hVar) {
        this.f36765a = hVar;
    }

    @Override // p108i7.h
    public final boolean a(a aVar) {
        if (aVar.f() != PersistedInstallation.RegistrationStatus.f28218d && aVar.f() != PersistedInstallation.RegistrationStatus.f28219e && aVar.f() != PersistedInstallation.RegistrationStatus.f28220f) {
            return false;
        }
        this.f36765a.d(aVar.f28222b);
        return true;
    }

    @Override // p108i7.h
    public final boolean b(Exception exc) {
        return false;
    }
}
