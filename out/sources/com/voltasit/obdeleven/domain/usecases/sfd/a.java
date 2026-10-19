package com.voltasit.obdeleven.domain.usecases.sfd;

import D9.o;
import G8.C0703e;
import G8.w;
import J8.p;
import J8.x;
import com.voltasit.obdeleven.domain.exceptions.SfdAlreadyUnlockedException;
import com.voltasit.obdeleven.domain.models.AccessAuthorizationType;
import com.voltasit.obdeleven.domain.models.Feature;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.l;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p255u9.D;
import p255u9.E;
import p255u9.F;

/* JADX INFO: compiled from: GetAccessAuthorizationTypeUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f30919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f f30920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f30921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f30922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J8.a f30923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f30924f;

    public a(p pVar, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f fVar, b bVar, d dVar, J8.a aVar, x xVar) {
        this.f30919a = pVar;
        this.f30920b = fVar;
        this.f30921c = bVar;
        this.f30922d = dVar;
        this.f30923e = aVar;
        this.f30924f = xVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01af  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:57:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x011f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    /* JADX WARN: Code duplicated, block: B:61:0x0124  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0130  */
    /* JADX WARN: Code duplicated, block: B:67:0x0133  */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145  */
    /* JADX WARN: Code duplicated, block: B:78:0x0150  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x016a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0179  */
    /* JADX WARN: Code duplicated, block: B:83:0x017e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0181  */
    /* JADX WARN: Code duplicated, block: B:86:0x0183  */
    /* JADX WARN: Code duplicated, block: B:89:0x018a  */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0192  */
    /* JADX WARN: Code duplicated, block: B:93:0x0194  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(short s10, Feature feature, ContinuationImpl continuationImpl) throws Throwable {
        GetAccessAuthorizationTypeUC$invoke$1 getAccessAuthorizationTypeUC$invoke$1;
        Feature feature2;
        a aVar;
        a aVar2;
        C8.a aVar3;
        Feature feature3;
        a aVar4;
        C8.a aVar5;
        D dI;
        String objectId;
        String str;
        F fJ;
        String string;
        String str2;
        D dI2;
        String str3;
        String string2;
        D dI3;
        String objectId2;
        String str4;
        F fJ2;
        String string3;
        String str5;
        D dI4;
        String str6;
        String string4;
        short s11 = s10;
        if (continuationImpl instanceof GetAccessAuthorizationTypeUC$invoke$1) {
            getAccessAuthorizationTypeUC$invoke$1 = (GetAccessAuthorizationTypeUC$invoke$1) continuationImpl;
            int i10 = getAccessAuthorizationTypeUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getAccessAuthorizationTypeUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getAccessAuthorizationTypeUC$invoke$1 = new GetAccessAuthorizationTypeUC$invoke$1(this, continuationImpl);
            }
        } else {
            getAccessAuthorizationTypeUC$invoke$1 = new GetAccessAuthorizationTypeUC$invoke$1(this, continuationImpl);
        }
        Object objA = getAccessAuthorizationTypeUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getAccessAuthorizationTypeUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s11 = getAccessAuthorizationTypeUC$invoke$1.S$0;
                feature2 = (Feature) getAccessAuthorizationTypeUC$invoke$1.L$1;
                aVar = (a) getAccessAuthorizationTypeUC$invoke$1.L$0;
                kotlin.b.b(objA);
            } else if (i11 == 2) {
                s11 = getAccessAuthorizationTypeUC$invoke$1.S$0;
                feature2 = (Feature) getAccessAuthorizationTypeUC$invoke$1.L$1;
                aVar2 = (a) getAccessAuthorizationTypeUC$invoke$1.L$0;
                kotlin.b.b(objA);
                aVar3 = (C8.a) objA;
                if (aVar3 instanceof C8.a.C0024a) {
                    return aVar3;
                }
                if (!(aVar3 instanceof C8.a.b) && !((Boolean) ((C8.a.b) aVar3).f2463a).booleanValue()) {
                    return new C8.a.b(AccessAuthorizationType.f30439b);
                }
                getAccessAuthorizationTypeUC$invoke$1.L$0 = aVar2;
                getAccessAuthorizationTypeUC$invoke$1.L$1 = feature2;
                getAccessAuthorizationTypeUC$invoke$1.S$0 = s11;
                getAccessAuthorizationTypeUC$invoke$1.label = 3;
                objA = aVar2.f30922d.a(s11, getAccessAuthorizationTypeUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                feature3 = feature2;
                aVar4 = aVar2;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s11 = getAccessAuthorizationTypeUC$invoke$1.S$0;
                feature3 = (Feature) getAccessAuthorizationTypeUC$invoke$1.L$1;
                aVar4 = (a) getAccessAuthorizationTypeUC$invoke$1.L$0;
                kotlin.b.b(objA);
            }
            aVar5 = (C8.a) objA;
            if (aVar5 instanceof C8.a.C0024a) {
                return aVar5;
            }
            if (aVar5 instanceof C8.a.b) {
                throw new NoWhenBranchMatchedException();
            }
            if (((w) ((C8.a.b) aVar5).f2463a).f3553a) {
                short s12 = s11;
                E e10 = aVar4.f30924f.k().f42726c;
                dI = e10.i();
                if (dI != null) {
                    objectId = dI.getObjectId();
                } else {
                    objectId = null;
                }
                if (objectId == null) {
                    str = "";
                } else {
                    str = objectId;
                }
                fJ = e10.j();
                if (fJ != null) {
                    string = fJ.getString("model");
                } else {
                    string = null;
                }
                if (string == null) {
                    str2 = "";
                } else {
                    str2 = string;
                }
                dI2 = e10.i();
                if (dI2 != null || (string2 = dI2.getString("platform")) == null) {
                    str3 = "";
                } else {
                    str3 = string2;
                }
                String strK = e10.k();
                String string5 = e10.getString("year");
                aVar4.f30923e.e(str, str2, str3, strK, string5 != null ? l.A(string5) : null, o.u(s12), feature3.a());
                return new C8.a.b(AccessAuthorizationType.f30440c);
            }
            p pVar = aVar4.f30919a;
            SfdAlreadyUnlockedException sfdAlreadyUnlockedException = SfdAlreadyUnlockedException.f30424b;
            pVar.d(sfdAlreadyUnlockedException, true);
            short s13 = s11;
            E e11 = aVar4.f30924f.k().f42726c;
            dI3 = e11.i();
            if (dI3 != null) {
                objectId2 = dI3.getObjectId();
            } else {
                objectId2 = null;
            }
            if (objectId2 == null) {
                str4 = "";
            } else {
                str4 = objectId2;
            }
            fJ2 = e11.j();
            if (fJ2 != null) {
                string3 = fJ2.getString("model");
            } else {
                string3 = null;
            }
            if (string3 == null) {
                str5 = "";
            } else {
                str5 = string3;
            }
            dI4 = e11.i();
            if (dI4 != null || (string4 = dI4.getString("platform")) == null) {
                str6 = "";
            } else {
                str6 = string4;
            }
            String strK2 = e11.k();
            String string6 = e11.getString("year");
            aVar4.f30923e.t(str4, str5, str6, strK2, string6 != null ? l.A(string6) : null, o.u(s13), feature3.a());
            return new C8.a.C0024a(sfdAlreadyUnlockedException);
        }
        kotlin.b.b(objA);
        getAccessAuthorizationTypeUC$invoke$1.L$0 = this;
        feature2 = feature;
        getAccessAuthorizationTypeUC$invoke$1.L$1 = feature2;
        getAccessAuthorizationTypeUC$invoke$1.S$0 = s11;
        getAccessAuthorizationTypeUC$invoke$1.label = 1;
        objA = this.f30920b.a(s11, getAccessAuthorizationTypeUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = this;
        C8.a aVar6 = (C8.a) objA;
        if (aVar6 instanceof C8.a.C0024a) {
            return aVar6;
        }
        if ((aVar6 instanceof C8.a.b) && ((C0703e) ((C8.a.b) aVar6).f2463a).f3453C != ProtocolType.CAN_UDS) {
            return new C8.a.b(AccessAuthorizationType.f30439b);
        }
        getAccessAuthorizationTypeUC$invoke$1.L$0 = aVar;
        getAccessAuthorizationTypeUC$invoke$1.L$1 = feature2;
        getAccessAuthorizationTypeUC$invoke$1.S$0 = s11;
        getAccessAuthorizationTypeUC$invoke$1.label = 2;
        objA = C2680e.f(N.f43198a, new GetIsSfdSupportedUC$invoke$2(aVar.f30921c, s11, null), getAccessAuthorizationTypeUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar2 = aVar;
        aVar3 = (C8.a) objA;
        if (aVar3 instanceof C8.a.C0024a) {
            return aVar3;
        }
        if (!(aVar3 instanceof C8.a.b)) {
        }
        getAccessAuthorizationTypeUC$invoke$1.L$0 = aVar2;
        getAccessAuthorizationTypeUC$invoke$1.L$1 = feature2;
        getAccessAuthorizationTypeUC$invoke$1.S$0 = s11;
        getAccessAuthorizationTypeUC$invoke$1.label = 3;
        objA = aVar2.f30922d.a(s11, getAccessAuthorizationTypeUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        feature3 = feature2;
        aVar4 = aVar2;
        aVar5 = (C8.a) objA;
        if (aVar5 instanceof C8.a.C0024a) {
            return aVar5;
        }
        if (aVar5 instanceof C8.a.b) {
            throw new NoWhenBranchMatchedException();
        }
        if (((w) ((C8.a.b) aVar5).f2463a).f3553a) {
            short s14 = s11;
            E e12 = aVar4.f30924f.k().f42726c;
            dI = e12.i();
            if (dI != null) {
                objectId = dI.getObjectId();
            } else {
                objectId = null;
            }
            if (objectId == null) {
                str = "";
            } else {
                str = objectId;
            }
            fJ = e12.j();
            if (fJ != null) {
                string = fJ.getString("model");
            } else {
                string = null;
            }
            if (string == null) {
                str2 = "";
            } else {
                str2 = string;
            }
            dI2 = e12.i();
            if (dI2 != null) {
                str3 = "";
            } else {
                str3 = "";
            }
            String strK3 = e12.k();
            String string7 = e12.getString("year");
            aVar4.f30923e.e(str, str2, str3, strK3, string7 != null ? l.A(string7) : null, o.u(s14), feature3.a());
            return new C8.a.b(AccessAuthorizationType.f30440c);
        }
        p pVar2 = aVar4.f30919a;
        SfdAlreadyUnlockedException sfdAlreadyUnlockedException2 = SfdAlreadyUnlockedException.f30424b;
        pVar2.d(sfdAlreadyUnlockedException2, true);
        short s15 = s11;
        E e13 = aVar4.f30924f.k().f42726c;
        dI3 = e13.i();
        if (dI3 != null) {
            objectId2 = dI3.getObjectId();
        } else {
            objectId2 = null;
        }
        if (objectId2 == null) {
            str4 = "";
        } else {
            str4 = objectId2;
        }
        fJ2 = e13.j();
        if (fJ2 != null) {
            string3 = fJ2.getString("model");
        } else {
            string3 = null;
        }
        if (string3 == null) {
            str5 = "";
        } else {
            str5 = string3;
        }
        dI4 = e13.i();
        if (dI4 != null) {
            str6 = "";
        } else {
            str6 = "";
        }
        String strK4 = e13.k();
        String string8 = e13.getString("year");
        aVar4.f30923e.t(str4, str5, str6, strK4, string8 != null ? l.A(string8) : null, o.u(s15), feature3.a());
        return new C8.a.C0024a(sfdAlreadyUnlockedException2);
    }
}
