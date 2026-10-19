package X8;

import N7.e;
import Q3.k;
import R2.z;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.animation.D;
import androidx.compose.foundation.C0936h;
import androidx.compose.ui.graphics.colorspace.n;
import androidx.core.view.C1293h;
import androidx.fragment.app.E;
import androidx.media3.exoplayer.C1401t;
import androidx.media3.exoplayer.C1402u;
import androidx.media3.exoplayer.C1406y;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.firebase.inappmessaging.MessagesProto$Content;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.gson.JsonIOException;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.protobuf.C2078u;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import io.reactivex.internal.operators.flowable.FlowableFlattenIterable;
import io.reactivex.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.internal.operators.flowable.g;
import io.reactivex.internal.operators.flowable.i;
import io.reactivex.internal.operators.maybe.MaybeCreate;
import io.reactivex.internal.operators.maybe.MaybeFlatten;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.internal.operators.maybe.MaybeOnErrorNext;
import io.reactivex.internal.operators.maybe.MaybeToFlowable;
import io.reactivex.internal.operators.maybe.MaybeZipArray;
import io.reactivex.internal.operators.maybe.c;
import io.reactivex.internal.operators.maybe.d;
import io.reactivex.internal.operators.maybe.j;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.internal.operators.single.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p005a4.o;
import p005a4.p;
import p005a4.q;
import p033c7.C1493f;
import p033c7.C1494g;
import p033c7.H;
import p033c7.e0;
import p033c7.j0;
import p083g7.f;
import p083g7.m;
import p123ja.h;
import p191p5.B;
import qa.a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements E, p183oa.c, p183oa.b, com.google.gson.internal.f, MaterialDialog.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7401b;

    public /* synthetic */ n(Object obj) {
        this.f7401b = obj;
    }

    @Override // p183oa.b
    public void a(Object obj) {
        e0 e0Var = (e0) this.f7401b;
        e0Var.getClass();
        e0Var.f22442c = io.reactivex.internal.operators.maybe.b.f40795b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [c7.F] */
    @Override // p183oa.c, p311z4.f
    public Object apply(Object obj) {
        final String str = (String) obj;
        final H h8 = (H) this.f7401b;
        final C1494g c1494g = h8.f22355c;
        c1494g.getClass();
        io.reactivex.internal.operators.maybe.e eVar = new io.reactivex.internal.operators.maybe.e(new Callable() { // from class: c7.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c1494g.f22450d;
            }
        });
        io.reactivex.internal.operators.maybe.e eVarA = c1494g.f22447a.a(N7.e.M());
        C1401t c1401t = new C1401t(c1494g);
        qa.a.c cVar = qa.a.f46191d;
        io.reactivex.internal.operators.maybe.k kVar = new io.reactivex.internal.operators.maybe.k(new io.reactivex.internal.operators.maybe.k(new io.reactivex.internal.operators.maybe.k(new io.reactivex.internal.operators.maybe.c(eVar.e(new io.reactivex.internal.operators.maybe.k(eVarA, c1401t, cVar)), new C7.d(c1494g)), cVar, new C1402u(c1494g)), new J4.i(6), cVar), cVar, new C0936h(3));
        io.reactivex.internal.operators.maybe.b bVar = io.reactivex.internal.operators.maybe.b.f40795b;
        Q3.d.I(bVar, "next is null");
        MaybeOnErrorNext maybeOnErrorNext = new MaybeOnErrorNext(kVar, new qa.a.g(bVar));
        androidx.compose.ui.graphics.colorspace.q qVar = new androidx.compose.ui.graphics.colorspace.q(2, h8);
        final F1.a aVar = new F1.a(3, h8);
        final ?? r10 = new p183oa.c() { // from class: c7.F
            @Override // p183oa.c, p311z4.f
            public final Object apply(Object obj2) {
                CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj2;
                H h10 = h8;
                h10.getClass();
                if (campaignProto$ThickContent.J() || !str.equals("ON_FOREGROUND")) {
                    return h.b(campaignProto$ThickContent);
                }
                final e0 e0Var = h10.f22360h;
                h hVarE = e0Var.a().e(h.b(Z.I()));
                final m mVar = h10.f22361i;
                return new j(new d(new SingleResumeNext(new b(new io.reactivex.internal.operators.maybe.h(new c(new j(hVarE, new p183oa.c() { // from class: c7.c0
                    @Override // p183oa.c, p311z4.f
                    public final Object apply(Object obj3) {
                        e0 e0Var2 = e0Var;
                        e0Var2.getClass();
                        return ((Z) obj3).J(mVar.b(), e0Var2.b());
                    }
                }), new d0(e0Var, mVar))), new o()), new a.g(new io.reactivex.internal.operators.single.c())), new p(4)), new C1402u(campaignProto$ThickContent));
            }
        };
        final C4.b bVar2 = new C4.b(6);
        p183oa.c cVar2 = new p183oa.c() { // from class: c7.G
            @Override // p183oa.c, p311z4.f
            public final Object apply(Object obj2) {
                final H h10 = h8;
                h10.getClass();
                C2078u.d dVarK = ((e) obj2).K();
                int i10 = p123ja.d.f41194b;
                Q3.d.I(dVarK, "source is null");
                io.reactivex.internal.operators.flowable.e eVar2 = new io.reactivex.internal.operators.flowable.e(new FlowableFromIterable(dVarK), new Y1.d(3, h10));
                final String str2 = str;
                g gVar = new g(new i(new io.reactivex.internal.operators.flowable.e(eVar2, new n(str2)).b(aVar).b(r10).b(bVar2)).d(), new a.h(new D()));
                int i11 = p123ja.d.f41194b;
                Q3.d.L(i11, "bufferSize");
                return new MaybeFlatten(new io.reactivex.internal.operators.flowable.c(new FlowableFlattenIterable(gVar, i11)), new p183oa.c() { // from class: c7.E
                    @Override // p183oa.c, p311z4.f
                    public final Object apply(Object obj3) {
                        String strH;
                        String strI;
                        f fVar;
                        p083g7.a aVar2;
                        p083g7.h cVar3;
                        f fVar2;
                        f fVar3;
                        p083g7.h eVar3;
                        f fVar4;
                        f fVar5;
                        CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj3;
                        H h11 = h10;
                        h11.getClass();
                        if (campaignProto$ThickContent.K().equals(CampaignProto$ThickContent.PayloadCase.VANILLA_PAYLOAD)) {
                            strH = campaignProto$ThickContent.N().H();
                            strI = campaignProto$ThickContent.N().I();
                        } else {
                            if (!campaignProto$ThickContent.K().equals(CampaignProto$ThickContent.PayloadCase.EXPERIMENTAL_PAYLOAD)) {
                                return io.reactivex.internal.operators.maybe.b.f40795b;
                            }
                            String strH2 = campaignProto$ThickContent.I().H();
                            String strI2 = campaignProto$ThickContent.I().I();
                            if (!campaignProto$ThickContent.J()) {
                                S6.h hVarL = campaignProto$ThickContent.I().L();
                                C1488a c1488a = h11.f22363l;
                                c1488a.getClass();
                                c1488a.f22420b.execute(new z(c1488a, 1, hVarL));
                            }
                            strH = strH2;
                            strI = strI2;
                        }
                        MessagesProto$Content messagesProto$ContentG = campaignProto$ThickContent.G();
                        boolean zJ = campaignProto$ThickContent.J();
                        Map<String, String> mapH = campaignProto$ThickContent.H();
                        A8.p.j(messagesProto$ContentG, "FirebaseInAppMessaging content cannot be null.");
                        A8.p.j(strH, "FirebaseInAppMessaging campaign id cannot be null.");
                        A8.p.j(strI, "FirebaseInAppMessaging campaign name cannot be null.");
                        messagesProto$ContentG.toString();
                        Q3.d.B();
                        k kVar2 = new k(strH, strI, zJ);
                        int iOrdinal = messagesProto$ContentG.K().ordinal();
                        p083g7.a aVar3 = null;
                        if (iOrdinal == 0) {
                            com.google.firebase.inappmessaging.b bVarG = messagesProto$ContentG.G();
                            String strH3 = !TextUtils.isEmpty(bVarG.H()) ? bVarG.H() : null;
                            if (TextUtils.isEmpty(bVarG.K())) {
                                fVar = null;
                            } else {
                                String strK = bVarG.K();
                                if (TextUtils.isEmpty(strK)) {
                                    strK = null;
                                }
                                if (TextUtils.isEmpty(strK)) {
                                    throw new IllegalArgumentException("ImageData model must have an imageUrl");
                                }
                                fVar = new f(strK);
                            }
                            if (bVarG.M()) {
                                p083g7.a.C0372a c0372aA = p083g7.k.a(bVarG.G());
                                aVar2 = new p083g7.a(c0372aA.f35606a, c0372aA.f35607b);
                            } else {
                                aVar2 = null;
                            }
                            p083g7.n nVarC = bVarG.N() ? p083g7.k.c(bVarG.I()) : null;
                            p083g7.n nVarC2 = bVarG.O() ? p083g7.k.c(bVarG.L()) : null;
                            if (nVarC2 == null) {
                                throw new IllegalArgumentException("Banner model must have a title");
                            }
                            if (TextUtils.isEmpty(strH3)) {
                                throw new IllegalArgumentException("Banner model must have a background color");
                            }
                            cVar3 = new p083g7.c(kVar2, nVarC2, nVarC, fVar, aVar2, strH3, mapH);
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                com.google.firebase.inappmessaging.e eVarJ = messagesProto$ContentG.J();
                                if (TextUtils.isEmpty(eVarJ.I())) {
                                    fVar3 = null;
                                } else {
                                    String strI3 = eVarJ.I();
                                    if (TextUtils.isEmpty(strI3)) {
                                        strI3 = null;
                                    }
                                    if (TextUtils.isEmpty(strI3)) {
                                        throw new IllegalArgumentException("ImageData model must have an imageUrl");
                                    }
                                    fVar3 = new f(strI3);
                                }
                                if (eVarJ.J()) {
                                    p083g7.a.C0372a c0372aA2 = p083g7.k.a(eVarJ.G());
                                    aVar3 = new p083g7.a(c0372aA2.f35606a, c0372aA2.f35607b);
                                }
                                if (fVar3 == null) {
                                    throw new IllegalArgumentException("ImageOnly model must have image data");
                                }
                                p083g7.g gVar2 = new p083g7.g(kVar2, MessageType.IMAGE_ONLY, mapH);
                                gVar2.f35625d = fVar3;
                                gVar2.f35626e = aVar3;
                                eVar3 = gVar2;
                            } else if (iOrdinal != 3) {
                                cVar3 = new p083g7.j(new k(strH, strI, zJ), MessageType.UNSUPPORTED, mapH);
                            } else {
                                com.google.firebase.inappmessaging.d dVarH = messagesProto$ContentG.H();
                                p083g7.n nVarC3 = dVarH.V() ? p083g7.k.c(dVarH.P()) : null;
                                p083g7.n nVarC4 = dVarH.Q() ? p083g7.k.c(dVarH.H()) : null;
                                String strG = !TextUtils.isEmpty(dVarH.G()) ? dVarH.G() : null;
                                p083g7.a aVarB = (dVarH.R() || dVarH.S()) ? p083g7.k.b(dVarH.L(), dVarH.M()) : null;
                                p083g7.a aVarB2 = (dVarH.T() || dVarH.U()) ? p083g7.k.b(dVarH.N(), dVarH.O()) : null;
                                if (TextUtils.isEmpty(dVarH.K())) {
                                    fVar4 = null;
                                } else {
                                    String strK2 = dVarH.K();
                                    if (TextUtils.isEmpty(strK2)) {
                                        strK2 = null;
                                    }
                                    if (TextUtils.isEmpty(strK2)) {
                                        throw new IllegalArgumentException("ImageData model must have an imageUrl");
                                    }
                                    fVar4 = new f(strK2);
                                }
                                if (TextUtils.isEmpty(dVarH.J())) {
                                    fVar5 = null;
                                } else {
                                    String strJ = dVarH.J();
                                    String str3 = TextUtils.isEmpty(strJ) ? null : strJ;
                                    if (TextUtils.isEmpty(str3)) {
                                        throw new IllegalArgumentException("ImageData model must have an imageUrl");
                                    }
                                    fVar5 = new f(str3);
                                }
                                if (aVarB == null) {
                                    throw new IllegalArgumentException("Card model must have a primary action");
                                }
                                if (aVarB.f35605b == null) {
                                    throw new IllegalArgumentException("Card model must have a primary action button");
                                }
                                if (aVarB2 != null && aVarB2.f35605b == null) {
                                    throw new IllegalArgumentException("Card model secondary action must be null or have a button");
                                }
                                if (nVarC3 == null) {
                                    throw new IllegalArgumentException("Card model must have a title");
                                }
                                if (fVar4 == null && fVar5 == null) {
                                    throw new IllegalArgumentException("Card model must have at least one image");
                                }
                                if (TextUtils.isEmpty(strG)) {
                                    throw new IllegalArgumentException("Card model must have a background color");
                                }
                                eVar3 = new p083g7.e(kVar2, nVarC3, nVarC4, fVar4, fVar5, strG, aVarB, aVarB2, mapH);
                            }
                            cVar3 = eVar3;
                        } else {
                            com.google.firebase.inappmessaging.f fVarL = messagesProto$ContentG.L();
                            String strI4 = !TextUtils.isEmpty(fVarL.I()) ? fVarL.I() : null;
                            if (TextUtils.isEmpty(fVarL.L())) {
                                fVar2 = null;
                            } else {
                                String strL = fVarL.L();
                                if (TextUtils.isEmpty(strL)) {
                                    strL = null;
                                }
                                if (TextUtils.isEmpty(strL)) {
                                    throw new IllegalArgumentException("ImageData model must have an imageUrl");
                                }
                                fVar2 = new f(strL);
                            }
                            p083g7.a aVarB3 = fVarL.N() ? p083g7.k.b(fVarL.G(), fVarL.H()) : null;
                            p083g7.n nVarC5 = fVarL.O() ? p083g7.k.c(fVarL.J()) : null;
                            p083g7.n nVarC6 = fVarL.P() ? p083g7.k.c(fVarL.M()) : null;
                            if (nVarC6 == null) {
                                throw new IllegalArgumentException("Modal model must have a title");
                            }
                            if (aVarB3 != null && aVarB3.f35605b == null) {
                                throw new IllegalArgumentException("Modal model action must be null or have a button");
                            }
                            if (TextUtils.isEmpty(strI4)) {
                                throw new IllegalArgumentException("Modal model must have a background color");
                            }
                            cVar3 = new p083g7.i(kVar2, nVarC6, nVarC5, fVar2, aVarB3, strI4, mapH);
                        }
                        if (cVar3.f35627a.equals(MessageType.UNSUPPORTED)) {
                            return io.reactivex.internal.operators.maybe.b.f40795b;
                        }
                        p083g7.o oVar = new p083g7.o();
                        oVar.f35638a = cVar3;
                        oVar.f35639b = str2;
                        return h.b(oVar);
                    }
                });
            }
        };
        io.reactivex.internal.operators.maybe.k kVar2 = new io.reactivex.internal.operators.maybe.k(h8.f22359g.a(), cVar, new D(2));
        N7.b bVarJ = N7.b.J();
        Q3.d.I(bVarJ, "item is null");
        MaybeOnErrorNext maybeOnErrorNext2 = new MaybeOnErrorNext(kVar2.e(p123ja.h.b(bVarJ)), new qa.a.g(p123ja.h.b(N7.b.J())));
        p108i7.c cVar3 = h8.f22364m;
        B id = cVar3.getId();
        Executor executor = h8.f22366o;
        MaybeCreate maybeCreate = new MaybeCreate(new C1493f(id, executor));
        MaybeCreate maybeCreate2 = new MaybeCreate(new C1493f(cVar3.a(), executor));
        new C1293h(0);
        MaybeZipArray maybeZipArray = new MaybeZipArray(new p123ja.k[]{maybeCreate, maybeCreate2}, new qa.a.C0521a());
        p123ja.o oVar = h8.f22358f.f22451a;
        Q3.d.I(oVar, "scheduler is null");
        final MaybeObserveOn maybeObserveOn = new MaybeObserveOn(maybeZipArray, oVar);
        p183oa.c cVar4 = new p183oa.c() { // from class: c7.C
            @Override // p183oa.c, p311z4.f
            public final Object apply(Object obj2) {
                N7.b bVar3 = (N7.b) obj2;
                H h10 = h8;
                if (!h10.f22365n.a()) {
                    Q3.d.C();
                    e.a aVarL = e.L();
                    aVarL.r();
                    e.H((e) aVarL.f29047c, 1L);
                    return h.b(aVarL.p());
                }
                H6.c cVar5 = new H6.c(4);
                h hVar = maybeObserveOn;
                hVar.getClass();
                j jVar = new j(new c(hVar, cVar5), new H7.a(h10, bVar3));
                e.a aVarL2 = e.L();
                aVarL2.r();
                e.H((e) aVarL2.f29047c, 1L);
                h hVarE = jVar.e(h.b(aVarL2.p()));
                q qVar2 = new q();
                a.c cVar6 = a.f46191d;
                io.reactivex.internal.operators.maybe.k kVar3 = new io.reactivex.internal.operators.maybe.k(new io.reactivex.internal.operators.maybe.k(hVarE, qVar2, cVar6), new C1406y(h10), cVar6);
                C1489b c1489b = h10.j;
                Objects.requireNonNull(c1489b);
                io.reactivex.internal.operators.maybe.k kVar4 = new io.reactivex.internal.operators.maybe.k(kVar3, new X8.m(2, c1489b), cVar6);
                j0 j0Var = h10.f22362k;
                Objects.requireNonNull(j0Var);
                io.reactivex.internal.operators.maybe.k kVar5 = new io.reactivex.internal.operators.maybe.k(new io.reactivex.internal.operators.maybe.k(kVar4, new A4.b(j0Var), cVar6), cVar6, new androidx.compose.ui.graphics.colorspace.e());
                io.reactivex.internal.operators.maybe.b bVar4 = io.reactivex.internal.operators.maybe.b.f40795b;
                Q3.d.I(bVar4, "next is null");
                return new MaybeOnErrorNext(kVar5, new a.g(bVar4));
            }
        };
        j0 j0Var = h8.f22362k;
        if (j0Var.f22464c ? str.equals("ON_FOREGROUND") : j0Var.f22463b) {
            Q3.d.C();
            MaybeFlatten maybeFlatten = new MaybeFlatten(new MaybeFlatten(maybeOnErrorNext2, cVar4), cVar2);
            return maybeFlatten instanceof ra.b ? ((ra.b) maybeFlatten).d() : new MaybeToFlowable(maybeFlatten);
        }
        Q3.d.B();
        MaybeFlatten maybeFlatten2 = new MaybeFlatten(maybeOnErrorNext.e(new io.reactivex.internal.operators.maybe.k(new MaybeFlatten(maybeOnErrorNext2, cVar4), qVar, cVar)), cVar2);
        return maybeFlatten2 instanceof ra.b ? ((ra.b) maybeFlatten2).d() : new MaybeToFlowable(maybeFlatten2);
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.e
    public void c(MaterialDialog materialDialog) {
        materialDialog.dismiss();
        ((TaskCompletionSource) this.f7401b).setResult(Boolean.FALSE);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.E
    public void h(Bundle bundle, String str) {
        ((SfdViewModel) ((s) this.f7401b).f7411D.getValue()).c();
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        Type type = (Type) this.f7401b;
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new JsonIOException("Invalid EnumSet type: " + type.toString());
    }
}
