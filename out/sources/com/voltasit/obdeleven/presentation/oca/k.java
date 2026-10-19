package com.voltasit.obdeleven.presentation.oca;

import G8.C0706h;
import J8.x;
import K8.o;
import K8.p;
import K8.y;
import androidx.fragment.app.ActivityC1347l;
import androidx.lifecycle.C;
import androidx.lifecycle.K;
import androidx.lifecycle.Z;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.Texttabe;
import com.parse.ParseFile;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.AbstractC2107w;
import com.voltasit.obdeleven.core.app.C2090e;
import com.voltasit.obdeleven.core.app.C2092g;
import com.voltasit.obdeleven.core.app.C2098m;
import com.voltasit.obdeleven.domain.exceptions.AppException;
import com.voltasit.obdeleven.domain.exceptions.VehicleNotConnectedException;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import com.voltasit.obdeleven.domain.usecases.C2113b;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.r;
import kotlinx.coroutines.flow.s;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.flow.w;
import p255u9.D;
import p255u9.E;

/* JADX INFO: compiled from: OcaViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.oca.j f32703A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final v f32704A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final o f32705B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final r f32706B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final J8.a f32707C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final U7.a<p293xa.r> f32708C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final GetUserDetailsUC f32709D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final U7.a f32710D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.user.v f32711E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final StateFlowImpl f32712E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.oca.f f32713F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final s f32714F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.oca.a f32715G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final StateFlowImpl f32716G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.oca.h f32717H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final s f32718H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C2113b f32719I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final U7.a<Integer> f32720I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final K.a f32721J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final U7.a f32722J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final K.a f32723K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final U7.a<p293xa.r> f32724K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C<I8.a> f32725L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final U7.a f32726L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C f32727M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final U7.a<List<C0706h>> f32728M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C<List<I8.b>> f32729N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final U7.a f32730N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final C f32731O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final C<Boolean> f32732P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final C f32733Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C2098m f32734R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f32735S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public m f32736T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final U7.a<Integer> f32737U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final U7.a f32738V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final U7.a<String> f32739W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final U7.a f32740X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final U7.a<a> f32741Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final U7.a f32742Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final U7.a<List<C0706h>> f32743a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final U7.a f32744b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final U7.a<p293xa.r> f32745c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final U7.a f32746d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final U7.a<p293xa.r> f32747e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final U7.a f32748f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final U7.a<p293xa.r> f32749g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final U7.a f32750h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final U7.a<p293xa.r> f32751i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final U7.a f32752j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final U7.a<Integer> f32753k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final U7.a f32754l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final U7.a<p293xa.r> f32755m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final U7.a f32756n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final PurchaseProvider f32757o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final U7.a<p293xa.r> f32758o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f32759p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final U7.a f32760p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final K8.v f32761q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final v f32762q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final J8.p f32763r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final r f32764r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f32765s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final v f32766s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.vehicle.l f32767t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final r f32768t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.oca.e f32769u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final v f32770u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final J8.d f32771v;
    public final r v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.oca.b f32772w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final v f32773w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x f32774x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final r f32775x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.oca.g f32776y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final v f32777y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.oca.k f32778z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final r f32779z0;

    /* JADX INFO: compiled from: OcaViewModel.kt */
    public static abstract class a {

        /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.oca.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: OcaViewModel.kt */
        public static final class C0339a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f32780a;

            public C0339a(String message) {
                kotlin.jvm.internal.i.e(message, "message");
                this.f32780a = message;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0339a) && kotlin.jvm.internal.i.a(this.f32780a, ((C0339a) obj).f32780a);
            }

            public final int hashCode() {
                return this.f32780a.hashCode();
            }

            public final String toString() {
                return Q8.d.a(new StringBuilder("Message(message="), this.f32780a, ")");
            }
        }

        /* JADX INFO: compiled from: OcaViewModel.kt */
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f32781a = new b();
        }
    }

    /* JADX INFO: compiled from: OcaViewModel.kt */
    public static final class b<TTaskResult, TContinuationResult> implements Continuation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ P8.e f32783b;

        public b(P8.e eVar) {
            this.f32783b = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.parse.boltsinternal.Continuation
        public final Object then(Task task) {
            int iIntValue;
            kotlin.jvm.internal.i.e(task, "task");
            k kVar = k.this;
            kVar.f32763r.e("OcaViewModel", "getCurrentValueTask.isFaulted() = " + task.isFaulted());
            boolean zIsFaulted = task.isFaulted();
            v vVar = kVar.f32773w0;
            P8.e eVar = this.f32783b;
            J8.p pVar = kVar.f32763r;
            if (zIsFaulted) {
                if (task.getError() instanceof AppException) {
                    Exception error = task.getError();
                    kotlin.jvm.internal.i.c(error, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.exceptions.AppException");
                    iIntValue = ((AppException) error).a();
                } else {
                    iIntValue = -6;
                }
                Exception error2 = task.getError();
                kotlin.jvm.internal.i.d(error2, "getError(...)");
                pVar.d(error2, false);
                pVar.b("OcaViewModel", "Result: " + iIntValue);
                switch (iIntValue) {
                    case -7:
                        pVar.b("OcaViewModel", "APP_ERROR_SHOW_SELECTION_TEXT");
                        vVar.f(new Pair(0, Boolean.TRUE));
                        kVar.f32777y0.f(p293xa.r.f47939a);
                        kVar.i(2);
                        break;
                    case -6:
                        pVar.b("OcaViewModel", "APP_ERROR_UNKNOWN");
                        kVar.i(3);
                        break;
                    case -5:
                        pVar.b("OcaViewModel", "APP_ERROR_UNABLE_TO_SAVE_ORIGINAL");
                        kVar.f32762q0.f(new l(R.string.view_app_unable_to_save_original, "tag_unable_to_save"));
                        kVar.i(3);
                        break;
                    case -4:
                    case H2.a.POSITION_NONE /* -2 */:
                        pVar.b("OcaViewModel", "APP_ERROR_NOT_SUPPORTED, APP_ERROR_SOMETHING_WRONG");
                        kVar.f32119h.j(Integer.valueOf(R.string.view_app_app_not_supported));
                        kVar.i(3);
                        break;
                    case -3:
                        pVar.b("OcaViewModel", "APP_ERROR_CHECK_IGNITION");
                        kVar.f32755m0.j(p293xa.r.f47939a);
                        break;
                    case -1:
                        pVar.b("OcaViewModel", "APP_ERROR_UNKNOWN_VALUE");
                        kVar.i(3);
                        break;
                    default:
                        String strA = Texttabe.a(iIntValue);
                        pVar.b("OcaViewModel", "Unknown result: " + iIntValue);
                        kVar.j.j(strA);
                        kVar.i(3);
                        break;
                }
                byte[] byteArray = eVar.f4965b.toByteArray();
                kotlin.jvm.internal.i.d(byteArray, "getLogData(...)");
                E e10 = kVar.f32774x.k().f42726c;
                C2098m c2098m = kVar.f32734R;
                AbstractC2107w abstractC2107w = c2098m != null ? c2098m.f30124i : null;
                I8.a aVar = (I8.a) kVar.f32727M.d();
                if (aVar != null) {
                    ParseFile parseFile = new ParseFile("log.txt", byteArray);
                    parseFile.saveInBackground().onSuccessTask(new j(aVar, e10, iIntValue, "", parseFile, abstractC2107w));
                }
            } else {
                pVar.e("OcaViewModel", "Current value read successfully");
                Object result = task.getResult();
                kotlin.jvm.internal.i.d(result, "getResult(...)");
                iIntValue = ((Number) result).intValue();
                vVar.f(new Pair(Integer.valueOf(iIntValue), Boolean.FALSE));
                kVar.i(2);
                kVar.f32735S = iIntValue;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = P8.c.f4964a;
            if (copyOnWriteArrayList.contains(eVar)) {
                copyOnWriteArrayList.remove(eVar);
                eVar.d();
            }
            pVar.e("OcaViewModel", "getCurrentValueIndex(" + iIntValue + ")");
            return null;
        }
    }

    public k(K k10, String ocaId, String vehicleId, PurchaseProvider purchaseProvider, p pVar, K8.v vVar, J8.p pVar2, y yVar, com.voltasit.obdeleven.domain.usecases.vehicle.l lVar, com.voltasit.obdeleven.domain.usecases.oca.e eVar, J8.d dVar, com.voltasit.obdeleven.domain.usecases.oca.b bVar, x xVar, com.voltasit.obdeleven.domain.usecases.oca.g gVar, com.voltasit.obdeleven.domain.usecases.oca.k kVar, com.voltasit.obdeleven.domain.usecases.oca.j jVar, o oVar, J8.a aVar, GetUserDetailsUC getUserDetailsUC, com.voltasit.obdeleven.domain.usecases.user.v vVar2, com.voltasit.obdeleven.domain.usecases.oca.f fVar, com.voltasit.obdeleven.domain.usecases.oca.a aVar2, com.voltasit.obdeleven.domain.usecases.oca.h hVar, C2113b c2113b) {
        kotlin.jvm.internal.i.e(ocaId, "ocaId");
        kotlin.jvm.internal.i.e(vehicleId, "vehicleId");
        this.f32757o = purchaseProvider;
        this.f32759p = pVar;
        this.f32761q = vVar;
        this.f32763r = pVar2;
        this.f32765s = yVar;
        this.f32767t = lVar;
        this.f32769u = eVar;
        this.f32771v = dVar;
        this.f32772w = bVar;
        this.f32774x = xVar;
        this.f32776y = gVar;
        this.f32778z = kVar;
        this.f32703A = jVar;
        this.f32705B = oVar;
        this.f32707C = aVar;
        this.f32709D = getUserDetailsUC;
        this.f32711E = vVar2;
        this.f32713F = fVar;
        this.f32715G = aVar2;
        this.f32717H = hVar;
        this.f32719I = c2113b;
        this.f32721J = k10.a(ocaId, "key_app_id");
        this.f32723K = k10.a(vehicleId, "key_vehicle_id");
        C<I8.a> c10 = new C<>();
        this.f32725L = c10;
        this.f32727M = c10;
        C<List<I8.b>> c11 = new C<>();
        this.f32729N = c11;
        this.f32731O = c11;
        Boolean bool = Boolean.FALSE;
        C<Boolean> c12 = new C<>(bool);
        this.f32732P = c12;
        this.f32733Q = c12;
        U7.a<Integer> aVar3 = new U7.a<>();
        this.f32737U = aVar3;
        this.f32738V = aVar3;
        U7.a<String> aVar4 = new U7.a<>();
        this.f32739W = aVar4;
        this.f32740X = aVar4;
        U7.a<a> aVar5 = new U7.a<>();
        this.f32741Y = aVar5;
        this.f32742Z = aVar5;
        U7.a<List<C0706h>> aVar6 = new U7.a<>();
        this.f32743a0 = aVar6;
        this.f32744b0 = aVar6;
        U7.a<p293xa.r> aVar7 = new U7.a<>();
        this.f32745c0 = aVar7;
        this.f32746d0 = aVar7;
        U7.a<p293xa.r> aVar8 = new U7.a<>();
        this.f32747e0 = aVar8;
        this.f32748f0 = aVar8;
        U7.a<p293xa.r> aVar9 = new U7.a<>();
        this.f32749g0 = aVar9;
        this.f32750h0 = aVar9;
        U7.a<p293xa.r> aVar10 = new U7.a<>();
        this.f32751i0 = aVar10;
        this.f32752j0 = aVar10;
        U7.a<Integer> aVar11 = new U7.a<>();
        this.f32753k0 = aVar11;
        this.f32754l0 = aVar11;
        U7.a<p293xa.r> aVar12 = new U7.a<>();
        this.f32755m0 = aVar12;
        this.f32756n0 = aVar12;
        U7.a<p293xa.r> aVar13 = new U7.a<>();
        this.f32758o0 = aVar13;
        this.f32760p0 = aVar13;
        BufferOverflow bufferOverflow = BufferOverflow.f43244c;
        v vVarB = w.b(0, 1, bufferOverflow, 1);
        this.f32762q0 = vVarB;
        this.f32764r0 = C2688e.a(vVarB);
        v vVarB2 = w.b(0, 1, bufferOverflow, 1);
        this.f32766s0 = vVarB2;
        this.f32768t0 = C2688e.a(vVarB2);
        v vVarB3 = w.b(0, 1, bufferOverflow, 1);
        this.f32770u0 = vVarB3;
        this.v0 = C2688e.a(vVarB3);
        v vVarB4 = w.b(0, 1, bufferOverflow, 1);
        this.f32773w0 = vVarB4;
        this.f32775x0 = C2688e.a(vVarB4);
        v vVarB5 = w.b(0, 1, bufferOverflow, 1);
        this.f32777y0 = vVarB5;
        this.f32779z0 = C2688e.a(vVarB5);
        v vVarB6 = w.b(0, 1, bufferOverflow, 1);
        this.f32704A0 = vVarB6;
        this.f32706B0 = C2688e.a(vVarB6);
        U7.a<p293xa.r> aVar14 = new U7.a<>();
        this.f32708C0 = aVar14;
        this.f32710D0 = aVar14;
        StateFlowImpl stateFlowImplA = B.a(bool);
        this.f32712E0 = stateFlowImplA;
        this.f32714F0 = C2688e.b(stateFlowImplA);
        StateFlowImpl stateFlowImplA2 = B.a(bool);
        this.f32716G0 = stateFlowImplA2;
        this.f32718H0 = C2688e.b(stateFlowImplA2);
        U7.a<Integer> aVar15 = new U7.a<>();
        this.f32720I0 = aVar15;
        this.f32722J0 = aVar15;
        U7.a<p293xa.r> aVar16 = new U7.a<>();
        this.f32724K0 = aVar16;
        this.f32726L0 = aVar16;
        U7.a<List<C0706h>> aVar17 = new U7.a<>();
        this.f32728M0 = aVar17;
        this.f32730N0 = aVar17;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object b(k kVar, ContinuationImpl continuationImpl) {
        OcaViewModel$getOcaCommandList$1 ocaViewModel$getOcaCommandList$1;
        String str;
        D dI;
        kVar.getClass();
        if (continuationImpl instanceof OcaViewModel$getOcaCommandList$1) {
            ocaViewModel$getOcaCommandList$1 = (OcaViewModel$getOcaCommandList$1) continuationImpl;
            int i10 = ocaViewModel$getOcaCommandList$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ocaViewModel$getOcaCommandList$1.label = i10 - Integer.MIN_VALUE;
            } else {
                ocaViewModel$getOcaCommandList$1 = new OcaViewModel$getOcaCommandList$1(kVar, continuationImpl);
            }
        } else {
            ocaViewModel$getOcaCommandList$1 = new OcaViewModel$getOcaCommandList$1(kVar, continuationImpl);
        }
        Object objF = ocaViewModel$getOcaCommandList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = ocaViewModel$getOcaCommandList$1.label;
        if (i11 == 0) {
            kotlin.b.b(objF);
            E e10 = kVar.f32774x.k().f42726c;
            String objectId = (e10 == null || (dI = e10.i()) == null) ? null : dI.getObjectId();
            String str2 = "";
            if (objectId == null) {
                objectId = "";
            }
            I8.a aVarD = kVar.f32725L.d();
            if (aVarD != null && (str = aVarD.f3901a) != null) {
                str2 = str;
            }
            ocaViewModel$getOcaCommandList$1.L$0 = kVar;
            ocaViewModel$getOcaCommandList$1.label = 1;
            com.voltasit.obdeleven.domain.usecases.oca.b bVar = kVar.f32772w;
            objF = bVar.f30873b.b() ? bVar.f30872a.f(objectId, str2, ocaViewModel$getOcaCommandList$1) : new C8.a.C0024a(new VehicleNotConnectedException());
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (k) ocaViewModel$getOcaCommandList$1.L$0;
            kotlin.b.b(objF);
        }
        C8.a aVar = (C8.a) objF;
        if (aVar instanceof C8.a.b) {
            kVar.f32729N.j(((C8.a.b) aVar).f2463a);
        } else if (aVar instanceof C8.a.C0024a) {
            Throwable th = ((C8.a.C0024a) aVar).f2462a;
            if (th instanceof VehicleNotConnectedException) {
                kVar.f32763r.b("OcaViewModel", "Vehicle not connected");
            } else {
                kVar.f32763r.d(th, false);
                kVar.j.j(kVar.f32771v.a(R.string.common_something_went_wrong, new Object[0]));
                kVar.f32115d.j(Boolean.TRUE);
            }
            kVar.f32113b.j(PreloaderState.d.f32643a);
        }
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(k kVar, ContinuationImpl continuationImpl) {
        OcaViewModel$isPopTheHoodDialogRequired$1 ocaViewModel$isPopTheHoodDialogRequired$1;
        boolean zBooleanValue;
        kVar.getClass();
        if (continuationImpl instanceof OcaViewModel$isPopTheHoodDialogRequired$1) {
            ocaViewModel$isPopTheHoodDialogRequired$1 = (OcaViewModel$isPopTheHoodDialogRequired$1) continuationImpl;
            int i10 = ocaViewModel$isPopTheHoodDialogRequired$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ocaViewModel$isPopTheHoodDialogRequired$1.label = i10 - Integer.MIN_VALUE;
            } else {
                ocaViewModel$isPopTheHoodDialogRequired$1 = new OcaViewModel$isPopTheHoodDialogRequired$1(kVar, continuationImpl);
            }
        } else {
            ocaViewModel$isPopTheHoodDialogRequired$1 = new OcaViewModel$isPopTheHoodDialogRequired$1(kVar, continuationImpl);
        }
        Object objA = ocaViewModel$isPopTheHoodDialogRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = ocaViewModel$isPopTheHoodDialogRequired$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            ocaViewModel$isPopTheHoodDialogRequired$1.L$0 = kVar;
            ocaViewModel$isPopTheHoodDialogRequired$1.label = 1;
            objA = kVar.f32767t.a(ocaViewModel$isPopTheHoodDialogRequired$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (k) ocaViewModel$isPopTheHoodDialogRequired$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            zBooleanValue = ((Boolean) ((C8.a.b) aVar).f2463a).booleanValue();
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            kVar.f32763r.d(((C8.a.C0024a) aVar).f2462a, false);
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object d(k kVar, ArrayList arrayList, C2098m c2098m, int i10, int i11, E e10, ContinuationImpl continuationImpl) {
        OcaViewModel$isSfdWizardNeeded$1 ocaViewModel$isSfdWizardNeeded$1;
        kVar.getClass();
        if (continuationImpl instanceof OcaViewModel$isSfdWizardNeeded$1) {
            ocaViewModel$isSfdWizardNeeded$1 = (OcaViewModel$isSfdWizardNeeded$1) continuationImpl;
            int i12 = ocaViewModel$isSfdWizardNeeded$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                ocaViewModel$isSfdWizardNeeded$1.label = i12 - Integer.MIN_VALUE;
            } else {
                ocaViewModel$isSfdWizardNeeded$1 = new OcaViewModel$isSfdWizardNeeded$1(kVar, continuationImpl);
            }
        } else {
            ocaViewModel$isSfdWizardNeeded$1 = new OcaViewModel$isSfdWizardNeeded$1(kVar, continuationImpl);
        }
        Object objA = ocaViewModel$isSfdWizardNeeded$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i13 = ocaViewModel$isSfdWizardNeeded$1.label;
        boolean z10 = true;
        if (i13 == 0) {
            kotlin.b.b(objA);
            ocaViewModel$isSfdWizardNeeded$1.L$0 = kVar;
            ocaViewModel$isSfdWizardNeeded$1.L$1 = c2098m;
            ocaViewModel$isSfdWizardNeeded$1.L$2 = e10;
            ocaViewModel$isSfdWizardNeeded$1.I$0 = i10;
            ocaViewModel$isSfdWizardNeeded$1.I$1 = i11;
            ocaViewModel$isSfdWizardNeeded$1.label = 1;
            objA = kVar.f32717H.a(arrayList, ocaViewModel$isSfdWizardNeeded$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = ocaViewModel$isSfdWizardNeeded$1.I$1;
            i10 = ocaViewModel$isSfdWizardNeeded$1.I$0;
            e10 = (E) ocaViewModel$isSfdWizardNeeded$1.L$2;
            c2098m = (C2098m) ocaViewModel$isSfdWizardNeeded$1.L$1;
            kVar = (k) ocaViewModel$isSfdWizardNeeded$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            if (((Boolean) ((C8.a.b) aVar).f2463a).booleanValue()) {
                kVar.f32704A0.f(p293xa.r.f47939a);
                kVar.f32736T = new m(c2098m, i10, i11, e10);
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
        if (!(aVar instanceof C8.a.C0024a)) {
            throw new NoWhenBranchMatchedException();
        }
        kVar.f32763r.b("OcaViewModel", "Oca is not SFD ready: " + ((C8.a.C0024a) aVar).f2462a.getMessage());
        kVar.f32119h.j(new Integer(R.string.common_check_network_connection));
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object e(k kVar, ContinuationImpl continuationImpl) {
        OcaViewModel$showAddCreditsDialog$1 ocaViewModel$showAddCreditsDialog$1;
        kVar.getClass();
        if (continuationImpl instanceof OcaViewModel$showAddCreditsDialog$1) {
            ocaViewModel$showAddCreditsDialog$1 = (OcaViewModel$showAddCreditsDialog$1) continuationImpl;
            int i10 = ocaViewModel$showAddCreditsDialog$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ocaViewModel$showAddCreditsDialog$1.label = i10 - Integer.MIN_VALUE;
            } else {
                ocaViewModel$showAddCreditsDialog$1 = new OcaViewModel$showAddCreditsDialog$1(kVar, continuationImpl);
            }
        } else {
            ocaViewModel$showAddCreditsDialog$1 = new OcaViewModel$showAddCreditsDialog$1(kVar, continuationImpl);
        }
        Object objA = ocaViewModel$showAddCreditsDialog$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = ocaViewModel$showAddCreditsDialog$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            ocaViewModel$showAddCreditsDialog$1.L$0 = kVar;
            ocaViewModel$showAddCreditsDialog$1.label = 1;
            objA = kVar.f32759p.a(ocaViewModel$showAddCreditsDialog$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (k) ocaViewModel$showAddCreditsDialog$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            kVar.f32743a0.j(((C8.a.b) aVar).f2463a);
        } else if (aVar instanceof C8.a.C0024a) {
            kVar.f32763r.c("OcaViewModel", "Unable to get credit products: " + ((C8.a.C0024a) aVar).f2462a.getMessage());
        }
        return p293xa.r.f47939a;
    }

    public final void f(ActivityC1347l activityC1347l, C0706h product) {
        kotlin.jvm.internal.i.e(product, "product");
        C2680e.c(Z.a(this), this.f32112a, null, new OcaViewModel$buyCredits$1(this, activityC1347l, product, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        K8.v vVar = this.f32761q;
        if (vVar.z()) {
            String objectId = vVar.L().getObjectId();
            T tD = this.f32727M.d();
            kotlin.jvm.internal.i.b(tD);
            if (kotlin.jvm.internal.i.a(objectId, ((I8.a) tD).f3913n)) {
                return true;
            }
        }
        return false;
    }

    public final void h() {
        J8.p pVar = this.f32763r;
        pVar.f("OcaViewModel", "readValue()");
        P8.e eVar = new P8.e();
        P8.c.c(eVar);
        int i10 = 0;
        i(0);
        pVar.e("OcaViewModel", "starting getCurrentValueTask");
        final C2098m c2098m = this.f32734R;
        kotlin.jvm.internal.i.b(c2098m);
        final J8.a analyticsProvider = this.f32707C;
        kotlin.jvm.internal.i.e(analyticsProvider, "analyticsProvider");
        J8.p pVar2 = c2098m.f30121f;
        pVar2.f("AppWorker", "getCurrentValueIndex()");
        c2098m.f30124i = null;
        analyticsProvider.E("OCA_READ_CURRENT_VALUE");
        HashMap<String, String> map = AbstractC2107w.f30174g;
        p279w9.b bVar = Application.f29634b;
        P8.c.a(3, "DeviceCommand", "reset()", Arrays.copyOf(new Object[0], 0));
        AbstractC2107w.f30174g.clear();
        AbstractC2107w.f30176i = null;
        AbstractC2107w.f30175h = null;
        pVar2.f("AppWorker", "checkCuExistence()");
        Task taskForResult = Task.forResult(Boolean.TRUE);
        Iterator<AbstractC2107w> it = c2098m.f30122g.iterator();
        while (it.hasNext()) {
            taskForResult = taskForResult.continueWithTask(new C2092g(i10, it.next()));
        }
        kotlin.jvm.internal.i.b(taskForResult);
        Task taskContinueWith = taskForResult.continueWithTask(new C2090e(c2098m, i10, analyticsProvider)).continueWith(new Continuation() { // from class: com.voltasit.obdeleven.core.app.f
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) throws Throwable {
                int iIntValue;
                J8.a analyticsProvider2 = analyticsProvider;
                kotlin.jvm.internal.i.e(analyticsProvider2, "$analyticsProvider");
                C2098m this$0 = c2098m;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task, "task");
                I8.a aVar = this$0.f30116a;
                analyticsProvider2.S("OCA_READ_CURRENT_VALUE", "app_group_id", String.valueOf(aVar.f3902b));
                if (task.isFaulted()) {
                    iIntValue = -3;
                } else {
                    Object result = task.getResult();
                    kotlin.jvm.internal.i.b(result);
                    iIntValue = ((Number) result).intValue();
                }
                analyticsProvider2.S("OCA_READ_CURRENT_VALUE", "result", iIntValue == 0 ? "Success" : String.valueOf(iIntValue));
                ControlUnit controlUnit = AbstractC2107w.f30176i;
                if (controlUnit != null) {
                    controlUnit.a();
                }
                J8.p pVar3 = this$0.f30121f;
                if (iIntValue != 0) {
                    if (iIntValue > 128) {
                        pVar3.b("AppWorker", "result > 0x80");
                        throw new AppException(iIntValue);
                    }
                    if (iIntValue == -3 || iIntValue == -1) {
                        pVar3.b("AppWorker", "result == Command.CMD_ERR_GEN || result == Command.CMD_ERR_NRC");
                        throw new AppException(-4);
                    }
                    if (iIntValue != -4) {
                        throw new AppException(-3);
                    }
                    pVar3.b("AppWorker", "result == Command.CMD_ERR_NO_CU");
                    throw new AppException(-2);
                }
                ArrayList<AbstractC2107w> arrayList = this$0.f30122g;
                Iterator<AbstractC2107w> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (it2.next().d()) {
                        int size = this$0.c().size();
                        int i11 = 0;
                        loop1: while (true) {
                            if (i11 >= size) {
                                i11 = -1;
                                break;
                            }
                            Iterator<AbstractC2107w> it3 = arrayList.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    break loop1;
                                }
                                try {
                                } catch (Exception e10) {
                                    pVar3.d(new Exception("ocaId: " + aVar.f3901a, e10), true);
                                    i11 = -2;
                                }
                            } while (it3.next().e(i11));
                            i11++;
                        }
                        boolean z10 = aVar.f3914o;
                        if (z10 && i11 == -1) {
                            pVar3.b("AppWorker", "application.isSkipOriginalValue() && valueIndex == APP_ERROR_UNKNOWN_VALUE");
                            throw new AppException(-7);
                        }
                        if (z10 || i11 != -1) {
                            if (i11 != -1 && i11 != -2) {
                                return Integer.valueOf(i11);
                            }
                            pVar3.b("AppWorker", "throwing APP_ERROR_NOT_SUPPORTED");
                            throw new AppException(-2);
                        }
                        pVar3.b("AppWorker", "!application.isSkipOriginalValue() && valueIndex == APP_ERROR_UNKNOWN_VALUE");
                        if (this$0.f30123h) {
                            throw new AppException(-7);
                        }
                        pVar3.e("AppWorker", "isOriginalValueAvailable=false");
                        C8.a aVar2 = (C8.a) C2680e.d(EmptyCoroutineContext.f43032b, new AppWorker$createOriginalAppValue$output$1(this$0, null));
                        if (aVar2 instanceof C8.a.b) {
                            this$0.f30118c.addAll((Collection) ((C8.a.b) aVar2).f2463a);
                            this$0.f30123h = true;
                            this$0.b(this$0.f30117b);
                        } else if (aVar2 instanceof C8.a.C0024a) {
                            Throwable th = ((C8.a.C0024a) aVar2).f2462a;
                            if (!(th instanceof VehicleNotConnectedException)) {
                                throw th;
                            }
                            pVar3.b("AppWorker", "Vehicle is not connected");
                        }
                        return 0;
                    }
                }
                pVar3.b("AppWorker", "unreadableApp");
                throw new AppException(-7);
            }
        });
        kotlin.jvm.internal.i.d(taskContinueWith, "continueWith(...)");
        taskContinueWith.continueWith(new b(eVar), Task.UI_THREAD_EXECUTOR);
    }

    public final void i(int i10) {
        C<PreloaderState> c10 = this.f32113b;
        StateFlowImpl stateFlowImpl = this.f32712E0;
        y yVar = this.f32765s;
        if (i10 == 0) {
            yVar.b();
            c10.j(new PreloaderState.a(R.string.common_loading));
            Boolean bool = Boolean.FALSE;
            stateFlowImpl.getClass();
            stateFlowImpl.k(null, bool);
            return;
        }
        if (i10 == 1) {
            yVar.b();
            c10.j(new PreloaderState.a(R.string.view_app_working));
            Boolean bool2 = Boolean.FALSE;
            stateFlowImpl.getClass();
            stateFlowImpl.k(null, bool2);
            return;
        }
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                yVar.a();
                c10.j(PreloaderState.d.f32643a);
                Boolean bool3 = Boolean.FALSE;
                stateFlowImpl.getClass();
                stateFlowImpl.k(null, bool3);
                return;
            }
            return;
        }
        yVar.a();
        c10.j(PreloaderState.d.f32643a);
        Boolean bool4 = Boolean.TRUE;
        stateFlowImpl.getClass();
        stateFlowImpl.k(null, bool4);
        StateFlowImpl stateFlowImpl2 = this.f32716G0;
        stateFlowImpl2.getClass();
        stateFlowImpl2.k(null, bool4);
    }
}
