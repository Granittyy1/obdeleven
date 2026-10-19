package com.voltasit.obdeleven.domain.usecases.sfd;

import J8.x;
import kotlin.text.l;
import p255u9.D;
import p255u9.E;
import p255u9.F;
import p293xa.p;
import p293xa.r;

/* JADX INFO: compiled from: TrackSfdWizardCompletionUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TrackSfdWizardCompletionUC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.a f30912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f30913b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: TrackSfdWizardCompletionUC.kt */
    public static final class SfdWizardScreen {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final SfdWizardScreen f30914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SfdWizardScreen f30915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final SfdWizardScreen f30916d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final SfdWizardScreen f30917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ SfdWizardScreen[] f30918f;

        static {
            SfdWizardScreen sfdWizardScreen = new SfdWizardScreen("Summary", 0);
            f30914b = sfdWizardScreen;
            SfdWizardScreen sfdWizardScreen2 = new SfdWizardScreen("TwoFactorStarted", 1);
            f30915c = sfdWizardScreen2;
            SfdWizardScreen sfdWizardScreen3 = new SfdWizardScreen("TwoFactorFinished", 2);
            f30916d = sfdWizardScreen3;
            SfdWizardScreen sfdWizardScreen4 = new SfdWizardScreen("PersonalInfoStarted", 3);
            f30917e = sfdWizardScreen4;
            SfdWizardScreen[] sfdWizardScreenArr = {sfdWizardScreen, sfdWizardScreen2, sfdWizardScreen3, sfdWizardScreen4, new SfdWizardScreen("PersonalInfoFinished", 4), new SfdWizardScreen("EmailVerificationStarted", 5), new SfdWizardScreen("EmailVerificationFinished", 6)};
            f30918f = sfdWizardScreenArr;
            kotlin.enums.a.a(sfdWizardScreenArr);
        }

        public SfdWizardScreen() {
            throw null;
        }

        public static SfdWizardScreen valueOf(String str) {
            return (SfdWizardScreen) Enum.valueOf(SfdWizardScreen.class, str);
        }

        public static SfdWizardScreen[] values() {
            return (SfdWizardScreen[]) f30918f.clone();
        }
    }

    public TrackSfdWizardCompletionUC(J8.a aVar, x xVar) {
        this.f30912a = aVar;
        this.f30913b = xVar;
    }

    public final void a(p pVar, SfdWizardScreen sfdWizardScreen) {
        G8.x xVar;
        x xVar2 = this.f30913b;
        if (xVar2.b()) {
            E e10 = xVar2.k().f42726c;
            D dI = e10.i();
            String objectId = dI != null ? dI.getObjectId() : null;
            F fJ = e10.j();
            String string = fJ != null ? fJ.getString("model") : null;
            D dI2 = e10.i();
            String string2 = dI2 != null ? dI2.getString("platform") : null;
            String strK = e10.k();
            String string3 = e10.getString("year");
            xVar = new G8.x(objectId, string, string2, strK, string3 != null ? l.A(string3) : null, pVar != null ? F8.a.l(pVar.f47935b) : null);
        } else {
            xVar = new G8.x(null, null, null, null, null, null);
        }
        int iOrdinal = sfdWizardScreen.ordinal();
        J8.a aVar = this.f30912a;
        if (iOrdinal == 0) {
            aVar.d(xVar);
            r rVar = r.f47939a;
        } else if (iOrdinal == 1) {
            aVar.P(xVar);
            r rVar2 = r.f47939a;
        } else if (iOrdinal == 2) {
            aVar.o(xVar);
            r rVar3 = r.f47939a;
        } else if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                aVar.r(xVar);
            }
            r rVar4 = r.f47939a;
        } else {
            aVar.h(xVar);
            r rVar5 = r.f47939a;
        }
        Na.i iVar = E8.a.f3126a;
    }
}
