package com.voltasit.obdeleven.domain.usecases.sfd;

import D9.o;
import J8.p;
import J8.x;
import K8.r;
import androidx.compose.foundation.C0936h;
import com.obdeleven.service.exception.CommandException;
import com.voltasit.obdeleven.domain.exceptions.InvalidSfdTokenException;
import com.voltasit.obdeleven.domain.exceptions.NegativeResponseCodeException;
import com.voltasit.obdeleven.domain.exceptions.SfdRateLimitException;
import com.voltasit.obdeleven.domain.models.Feature;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.l;
import p255u9.D;
import p255u9.E;
import p255u9.F;

/* JADX INFO: compiled from: UnlockSfdCommandUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f30945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f30946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f30947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f30948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J8.a f30949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f30950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final J8.f f30951g;

    public h(c cVar, i iVar, r rVar, x xVar, J8.a aVar, p pVar, J8.f fVar) {
        this.f30945a = cVar;
        this.f30946b = iVar;
        this.f30947c = rVar;
        this.f30948d = xVar;
        this.f30949e = aVar;
        this.f30950f = pVar;
        this.f30951g = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:22:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a5 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(short r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.voltasit.obdeleven.domain.usecases.sfd.UnlockSfdCommandUC$getSfdActivationData$1
            if (r0 == 0) goto L13
            r0 = r15
            com.voltasit.obdeleven.domain.usecases.sfd.UnlockSfdCommandUC$getSfdActivationData$1 r0 = (com.voltasit.obdeleven.domain.usecases.sfd.UnlockSfdCommandUC$getSfdActivationData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.voltasit.obdeleven.domain.usecases.sfd.UnlockSfdCommandUC$getSfdActivationData$1 r0 = new com.voltasit.obdeleven.domain.usecases.sfd.UnlockSfdCommandUC$getSfdActivationData$1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r2 = r0.label
            java.lang.String r3 = "UnlockSfdCommandUC"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L3e
            if (r2 != r4) goto L36
            long r6 = r0.J$0
            short r14 = r0.S$0
            java.lang.Object r2 = r0.L$0
            com.voltasit.obdeleven.domain.usecases.sfd.h r2 = (com.voltasit.obdeleven.domain.usecases.sfd.h) r2
            kotlin.b.b(r15)
        L33:
            r15 = r2
            goto La8
        L36:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3e:
            long r6 = r0.J$0
            short r14 = r0.S$0
            java.lang.Object r2 = r0.L$0
            com.voltasit.obdeleven.domain.usecases.sfd.h r2 = (com.voltasit.obdeleven.domain.usecases.sfd.h) r2
            kotlin.b.b(r15)
            goto L71
        L4a:
            kotlin.b.b(r15)
            J8.f r15 = r13.f30951g
            long r6 = r15.b()
            r8 = 0
            r15 = r13
        L56:
            r10 = 500(0x1f4, double:2.47E-321)
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 >= 0) goto Lb1
            short r2 = (short) r14
            r0.L$0 = r15
            r0.S$0 = r14
            r0.J$0 = r6
            r0.label = r5
            com.voltasit.obdeleven.domain.usecases.sfd.c r8 = r15.f30945a
            java.lang.Object r2 = r8.a(r2, r0)
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r12 = r2
            r2 = r15
            r15 = r12
        L71:
            C8.a r15 = (C8.a) r15
            boolean r8 = r15 instanceof C8.a.C0024a
            if (r8 == 0) goto Lb0
            r8 = r15
            C8.a$a r8 = (C8.a.C0024a) r8
            java.lang.Throwable r8 = r8.f2462a
            boolean r9 = r8 instanceof com.voltasit.obdeleven.domain.exceptions.ModuleDisruptedException
            if (r9 == 0) goto Lb0
            J8.p r15 = r2.f30950f
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Retrying on ModuleDisruptedException: "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r15.e(r3, r8)
            r0.L$0 = r2
            r0.S$0 = r14
            r0.J$0 = r6
            r0.label = r4
            r8 = 16
            java.lang.Object r15 = kotlinx.coroutines.I.b(r8, r0)
            if (r15 != r1) goto L33
            return r1
        La8:
            J8.f r2 = r15.f30951g
            long r8 = r2.b()
            long r8 = r8 - r6
            goto L56
        Lb0:
            return r15
        Lb1:
            J8.p r14 = r15.f30950f
            java.lang.String r15 = "Unable to get sfd activation data. Retry duration exceeded"
            r14.b(r3, r15)
            C8.a$a r14 = new C8.a$a
            java.lang.Exception r15 = new java.lang.Exception
            java.lang.String r0 = "Retry duration exceeded. Get sfd activation data failed"
            r15.<init>(r0)
            r14.<init>(r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.domain.usecases.sfd.h.a(short, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(String str, short s10, Feature feature, ContinuationImpl continuationImpl) {
        UnlockSfdCommandUC$invoke$1 unlockSfdCommandUC$invoke$1;
        h hVar;
        if (continuationImpl instanceof UnlockSfdCommandUC$invoke$1) {
            unlockSfdCommandUC$invoke$1 = (UnlockSfdCommandUC$invoke$1) continuationImpl;
            int i10 = unlockSfdCommandUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                unlockSfdCommandUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                unlockSfdCommandUC$invoke$1 = new UnlockSfdCommandUC$invoke$1(this, continuationImpl);
            }
        } else {
            unlockSfdCommandUC$invoke$1 = new UnlockSfdCommandUC$invoke$1(this, continuationImpl);
        }
        UnlockSfdCommandUC$invoke$1 unlockSfdCommandUC$invoke$2 = unlockSfdCommandUC$invoke$1;
        Object objA = unlockSfdCommandUC$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = unlockSfdCommandUC$invoke$2.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s10 = unlockSfdCommandUC$invoke$2.S$0;
                feature = (Feature) unlockSfdCommandUC$invoke$2.L$2;
                str = (String) unlockSfdCommandUC$invoke$2.L$1;
                hVar = (h) unlockSfdCommandUC$invoke$2.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
        }
        kotlin.b.b(objA);
        short s11 = s10;
        this.f30950f.f("UnlockSfdCommandUC", C0936h.d("UnlockSfdUC(cuBaseId=", str, ", klineId=", o.u(s11), ")"));
        unlockSfdCommandUC$invoke$2.L$0 = this;
        unlockSfdCommandUC$invoke$2.L$1 = str;
        unlockSfdCommandUC$invoke$2.L$2 = feature;
        unlockSfdCommandUC$invoke$2.S$0 = s10;
        unlockSfdCommandUC$invoke$2.label = 1;
        objA = a(s11, unlockSfdCommandUC$invoke$2);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        hVar = this;
        String str2 = str;
        Feature feature2 = feature;
        C8.a aVar = (C8.a) objA;
        if (!(aVar instanceof C8.a.b)) {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            hVar.f30950f.d(((C8.a.C0024a) aVar).f2462a, false);
            return aVar;
        }
        String str3 = (String) ((C8.a.b) aVar).f2463a;
        hVar.f30950f.e("UnlockSfdCommandUC", "Activation data received: " + str3);
        unlockSfdCommandUC$invoke$2.L$0 = null;
        unlockSfdCommandUC$invoke$2.L$1 = null;
        unlockSfdCommandUC$invoke$2.L$2 = null;
        unlockSfdCommandUC$invoke$2.label = 2;
        objA = hVar.c(str3, str2, s10, feature2, unlockSfdCommandUC$invoke$2);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0149  */
    /* JADX WARN: Code duplicated, block: B:46:0x0152  */
    /* JADX WARN: Code duplicated, block: B:47:0x015a  */
    /* JADX WARN: Code duplicated, block: B:49:0x015e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0160  */
    /* JADX WARN: Code duplicated, block: B:52:0x0164  */
    /* JADX WARN: Code duplicated, block: B:55:0x016f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0172  */
    /* JADX WARN: Code duplicated, block: B:62:0x0185  */
    /* JADX WARN: Code duplicated, block: B:63:0x018a  */
    /* JADX WARN: Code duplicated, block: B:66:0x018f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0191  */
    /* JADX WARN: Code duplicated, block: B:70:0x0198  */
    /* JADX WARN: Code duplicated, block: B:71:0x019f  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d9  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(String str, String str2, short s10, Feature feature, ContinuationImpl continuationImpl) {
        UnlockSfdCommandUC$requestSfdToken$1 unlockSfdCommandUC$requestSfdToken$1;
        String str3;
        Feature feature2;
        h hVar;
        Object c0024a;
        short s11;
        h hVar2;
        Feature feature3;
        C8.a aVar;
        D dI;
        String objectId;
        String str4;
        F fJ;
        String string;
        String str5;
        D dI2;
        String str6;
        String string2;
        Throwable th;
        String str7 = str2;
        short s12 = s10;
        if (continuationImpl instanceof UnlockSfdCommandUC$requestSfdToken$1) {
            unlockSfdCommandUC$requestSfdToken$1 = (UnlockSfdCommandUC$requestSfdToken$1) continuationImpl;
            int i10 = unlockSfdCommandUC$requestSfdToken$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                unlockSfdCommandUC$requestSfdToken$1.label = i10 - Integer.MIN_VALUE;
            } else {
                unlockSfdCommandUC$requestSfdToken$1 = new UnlockSfdCommandUC$requestSfdToken$1(this, continuationImpl);
            }
        } else {
            unlockSfdCommandUC$requestSfdToken$1 = new UnlockSfdCommandUC$requestSfdToken$1(this, continuationImpl);
        }
        Object objA = unlockSfdCommandUC$requestSfdToken$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = unlockSfdCommandUC$requestSfdToken$1.label;
        int iA = 0;
        if (i11 == 0) {
            kotlin.b.b(objA);
            int length = str.length();
            String strA = p293xa.p.a(s12);
            StringBuilder sb2 = new StringBuilder("requestSfdToken(activationData.length=");
            sb2.append(length);
            sb2.append(", cuBaseId=");
            sb2.append(str7);
            sb2.append(", klineId=");
            this.f30950f.f("UnlockSfdCommandUC", Q8.d.a(sb2, strA, ")"));
            String objectId2 = this.f30948d.k().f42726c.getObjectId();
            kotlin.jvm.internal.i.d(objectId2, "getObjectId(...)");
            byte[] bArrB = E8.a.b(str);
            unlockSfdCommandUC$requestSfdToken$1.L$0 = this;
            str3 = str;
            unlockSfdCommandUC$requestSfdToken$1.L$1 = str3;
            unlockSfdCommandUC$requestSfdToken$1.L$2 = str7;
            feature2 = feature;
            unlockSfdCommandUC$requestSfdToken$1.L$3 = feature2;
            unlockSfdCommandUC$requestSfdToken$1.S$0 = s12;
            unlockSfdCommandUC$requestSfdToken$1.label = 1;
            objA = this.f30947c.a(objectId2, str7, bArrB, unlockSfdCommandUC$requestSfdToken$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            hVar = this;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    s11 = unlockSfdCommandUC$requestSfdToken$1.S$0;
                    feature3 = (Feature) unlockSfdCommandUC$requestSfdToken$1.L$1;
                    hVar2 = (h) unlockSfdCommandUC$requestSfdToken$1.L$0;
                    kotlin.b.b(objA);
                    aVar = (C8.a) objA;
                    short s13 = s11;
                    hVar2.getClass();
                    if (aVar instanceof C8.a.C0024a) {
                        th = ((C8.a.C0024a) aVar).f2462a;
                        if (th instanceof NegativeResponseCodeException) {
                            iA = ((NegativeResponseCodeException) th).a();
                        } else if (th instanceof InvalidSfdTokenException) {
                            iA = 1;
                        } else if (th instanceof CommandException) {
                            iA = 3;
                        } else {
                            iA = 3;
                        }
                    } else if (!(aVar instanceof C8.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i12 = iA;
                    E e10 = hVar2.f30948d.k().f42726c;
                    dI = e10.i();
                    if (dI != null) {
                        objectId = dI.getObjectId();
                    } else {
                        objectId = null;
                    }
                    if (objectId == null) {
                        str4 = "";
                    } else {
                        str4 = objectId;
                    }
                    fJ = e10.j();
                    if (fJ != null) {
                        string = fJ.getString("model");
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        str5 = "";
                    } else {
                        str5 = string;
                    }
                    dI2 = e10.i();
                    if (dI2 != null) {
                        str6 = "";
                    } else {
                        str6 = "";
                    }
                    String strK = e10.k();
                    String string3 = e10.getString("year");
                    if (string3 != null) {
                    }
                    hVar2.f30949e.V(i12, str4, str5, str6, strK, string3 != null ? l.A(string3) : null, o.u(s13), feature3.a());
                    return aVar;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s11 = unlockSfdCommandUC$requestSfdToken$1.S$0;
                feature3 = (Feature) unlockSfdCommandUC$requestSfdToken$1.L$1;
                hVar2 = (h) unlockSfdCommandUC$requestSfdToken$1.L$0;
                kotlin.b.b(objA);
                aVar = (C8.a) objA;
                short s14 = s11;
                hVar2.getClass();
                if (aVar instanceof C8.a.C0024a) {
                    th = ((C8.a.C0024a) aVar).f2462a;
                    if (th instanceof NegativeResponseCodeException) {
                        iA = ((NegativeResponseCodeException) th).a();
                    } else if (th instanceof InvalidSfdTokenException) {
                        iA = 1;
                    } else if ((th instanceof CommandException) || ((CommandException) th).a() != -1) {
                        iA = 3;
                    } else {
                        iA = 2;
                    }
                } else if (!(aVar instanceof C8.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i13 = iA;
                E e11 = hVar2.f30948d.k().f42726c;
                dI = e11.i();
                if (dI != null) {
                    objectId = dI.getObjectId();
                } else {
                    objectId = null;
                }
                if (objectId == null) {
                    str4 = "";
                } else {
                    str4 = objectId;
                }
                fJ = e11.j();
                if (fJ != null) {
                    string = fJ.getString("model");
                } else {
                    string = null;
                }
                if (string == null) {
                    str5 = "";
                } else {
                    str5 = string;
                }
                dI2 = e11.i();
                if (dI2 != null || (string2 = dI2.getString("platform")) == null) {
                    str6 = "";
                } else {
                    str6 = string2;
                }
                String strK2 = e11.k();
                String string4 = e11.getString("year");
                hVar2.f30949e.V(i13, str4, str5, str6, strK2, string4 != null ? l.A(string4) : null, o.u(s14), feature3.a());
                return aVar;
            }
            short s15 = unlockSfdCommandUC$requestSfdToken$1.S$0;
            Feature feature4 = (Feature) unlockSfdCommandUC$requestSfdToken$1.L$3;
            String str8 = (String) unlockSfdCommandUC$requestSfdToken$1.L$2;
            str3 = (String) unlockSfdCommandUC$requestSfdToken$1.L$1;
            h hVar3 = (h) unlockSfdCommandUC$requestSfdToken$1.L$0;
            kotlin.b.b(objA);
            s12 = s15;
            str7 = str8;
            hVar = hVar3;
            feature2 = feature4;
        }
        C8.a aVar2 = (C8.a) objA;
        if (aVar2 instanceof C8.a.b) {
            String strG = E8.a.g((byte[]) ((C8.a.b) aVar2).f2463a);
            unlockSfdCommandUC$requestSfdToken$1.L$0 = hVar;
            unlockSfdCommandUC$requestSfdToken$1.L$1 = feature2;
            unlockSfdCommandUC$requestSfdToken$1.L$2 = null;
            unlockSfdCommandUC$requestSfdToken$1.L$3 = null;
            unlockSfdCommandUC$requestSfdToken$1.S$0 = s12;
            unlockSfdCommandUC$requestSfdToken$1.label = 2;
            objA = hVar.f30946b.a(strG, unlockSfdCommandUC$requestSfdToken$1, s12);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            s11 = s12;
            hVar2 = hVar;
            feature3 = feature2;
            aVar = (C8.a) objA;
            short s16 = s11;
            hVar2.getClass();
            if (aVar instanceof C8.a.C0024a) {
                th = ((C8.a.C0024a) aVar).f2462a;
                if (th instanceof NegativeResponseCodeException) {
                    iA = ((NegativeResponseCodeException) th).a();
                } else if (th instanceof InvalidSfdTokenException) {
                    iA = 1;
                } else if (th instanceof CommandException) {
                    iA = 3;
                } else {
                    iA = 3;
                }
            } else if (!(aVar instanceof C8.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            int i14 = iA;
            E e12 = hVar2.f30948d.k().f42726c;
            dI = e12.i();
            if (dI != null) {
                objectId = dI.getObjectId();
            } else {
                objectId = null;
            }
            if (objectId == null) {
                str4 = "";
            } else {
                str4 = objectId;
            }
            fJ = e12.j();
            if (fJ != null) {
                string = fJ.getString("model");
            } else {
                string = null;
            }
            if (string == null) {
                str5 = "";
            } else {
                str5 = string;
            }
            dI2 = e12.i();
            if (dI2 != null) {
                str6 = "";
            } else {
                str6 = "";
            }
            String strK3 = e12.k();
            String string5 = e12.getString("year");
            if (string5 != null) {
            }
            hVar2.f30949e.V(i14, str4, str5, str6, strK3, string5 != null ? l.A(string5) : null, o.u(s16), feature3.a());
            return aVar;
        }
        if (!(aVar2 instanceof C8.a.C0024a)) {
            throw new NoWhenBranchMatchedException();
        }
        Throwable th2 = ((C8.a.C0024a) aVar2).f2462a;
        short s17 = s12;
        unlockSfdCommandUC$requestSfdToken$1.L$0 = hVar;
        unlockSfdCommandUC$requestSfdToken$1.L$1 = feature2;
        unlockSfdCommandUC$requestSfdToken$1.L$2 = null;
        unlockSfdCommandUC$requestSfdToken$1.L$3 = null;
        unlockSfdCommandUC$requestSfdToken$1.S$0 = s12;
        unlockSfdCommandUC$requestSfdToken$1.label = 3;
        hVar.getClass();
        if ((th2 instanceof SfdRateLimitException) && ((SfdRateLimitException) th2).b() == SfdRateLimitException.Type.f30430e) {
            c0024a = hVar.d(str3, str7, s17, unlockSfdCommandUC$requestSfdToken$1);
        } else {
            hVar.f30950f.d(th2, false);
            c0024a = new C8.a.C0024a(th2);
        }
        objA = c0024a;
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        s11 = s12;
        hVar2 = hVar;
        feature3 = feature2;
        aVar = (C8.a) objA;
        short s18 = s11;
        hVar2.getClass();
        if (aVar instanceof C8.a.C0024a) {
            th = ((C8.a.C0024a) aVar).f2462a;
            if (th instanceof NegativeResponseCodeException) {
                iA = ((NegativeResponseCodeException) th).a();
            } else if (th instanceof InvalidSfdTokenException) {
                iA = 1;
            } else if (th instanceof CommandException) {
                iA = 3;
            } else {
                iA = 3;
            }
        } else if (!(aVar instanceof C8.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        int i15 = iA;
        E e13 = hVar2.f30948d.k().f42726c;
        dI = e13.i();
        if (dI != null) {
            objectId = dI.getObjectId();
        } else {
            objectId = null;
        }
        if (objectId == null) {
            str4 = "";
        } else {
            str4 = objectId;
        }
        fJ = e13.j();
        if (fJ != null) {
            string = fJ.getString("model");
        } else {
            string = null;
        }
        if (string == null) {
            str5 = "";
        } else {
            str5 = string;
        }
        dI2 = e13.i();
        if (dI2 != null) {
            str6 = "";
        } else {
            str6 = "";
        }
        String strK4 = e13.k();
        String string6 = e13.getString("year");
        if (string6 != null) {
        }
        hVar2.f30949e.V(i15, str4, str5, str6, strK4, string6 != null ? l.A(string6) : null, o.u(s18), feature3.a());
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(String str, String str2, short s10, ContinuationImpl continuationImpl) {
        UnlockSfdCommandUC$retryRequestSfdToken$1 unlockSfdCommandUC$retryRequestSfdToken$1;
        h hVar;
        if (continuationImpl instanceof UnlockSfdCommandUC$retryRequestSfdToken$1) {
            unlockSfdCommandUC$retryRequestSfdToken$1 = (UnlockSfdCommandUC$retryRequestSfdToken$1) continuationImpl;
            int i10 = unlockSfdCommandUC$retryRequestSfdToken$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                unlockSfdCommandUC$retryRequestSfdToken$1.label = i10 - Integer.MIN_VALUE;
            } else {
                unlockSfdCommandUC$retryRequestSfdToken$1 = new UnlockSfdCommandUC$retryRequestSfdToken$1(this, continuationImpl);
            }
        } else {
            unlockSfdCommandUC$retryRequestSfdToken$1 = new UnlockSfdCommandUC$retryRequestSfdToken$1(this, continuationImpl);
        }
        Object objA = unlockSfdCommandUC$retryRequestSfdToken$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = unlockSfdCommandUC$retryRequestSfdToken$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s10 = unlockSfdCommandUC$retryRequestSfdToken$1.S$0;
                hVar = (h) unlockSfdCommandUC$retryRequestSfdToken$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
        }
        kotlin.b.b(objA);
        int length = str.length();
        String strA = p293xa.p.a(s10);
        StringBuilder sb2 = new StringBuilder("retryRequestSfdToken(activationData.length=");
        sb2.append(length);
        sb2.append(", cuBaseId=");
        sb2.append(str2);
        sb2.append(", klineId=");
        this.f30950f.f("UnlockSfdCommandUC", Q8.d.a(sb2, strA, ")"));
        String objectId = this.f30948d.k().f42726c.getObjectId();
        kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
        byte[] bArrB = E8.a.b(str);
        unlockSfdCommandUC$retryRequestSfdToken$1.L$0 = this;
        unlockSfdCommandUC$retryRequestSfdToken$1.S$0 = s10;
        unlockSfdCommandUC$retryRequestSfdToken$1.label = 1;
        objA = this.f30947c.a(objectId, str2, bArrB, unlockSfdCommandUC$retryRequestSfdToken$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        hVar = this;
        C8.a aVar = (C8.a) objA;
        if (!(aVar instanceof C8.a.b)) {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            hVar.f30950f.d(((C8.a.C0024a) aVar).f2462a, false);
            return aVar;
        }
        i iVar = hVar.f30946b;
        short s11 = s10;
        String strG = E8.a.g((byte[]) ((C8.a.b) aVar).f2463a);
        unlockSfdCommandUC$retryRequestSfdToken$1.L$0 = null;
        unlockSfdCommandUC$retryRequestSfdToken$1.label = 2;
        objA = iVar.a(strG, unlockSfdCommandUC$retryRequestSfdToken$1, s11);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
