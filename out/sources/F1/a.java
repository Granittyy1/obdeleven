package F1;

import A1.AbstractC0570e;
import A1.x;
import androidx.compose.ui.graphics.colorspace.j;
import androidx.compose.ui.graphics.colorspace.t;
import androidx.compose.ui.platform.C1251w;
import androidx.core.view.C1293h;
import androidx.media3.exoplayer.C1402u;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.braze.support.BrazeLogger;
import com.google.gson.internal.f;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.operators.observable.ObservableFlatMap;
import io.reactivex.internal.operators.observable.i;
import io.reactivex.internal.operators.single.SingleResumeNext;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import p033c7.H;
import p078g1.n;
import p078g1.v;
import p114j1.A;
import p123ja.h;
import p123ja.l;
import p191p5.g;
import ra.d;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements AbstractC0570e.d, j, j1.j.a, p183oa.c, p191p5.c, f, MediaCodecUtil.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3186c;

    public /* synthetic */ a(int i10, Object obj) {
        this.f3185b = i10;
        this.f3186c = obj;
    }

    @Override // A1.AbstractC0570e.d
    public long a(long j) {
        x xVar = (x) this.f3186c;
        return A.h((j * ((long) xVar.f560e)) / 1000000, 0L, xVar.j - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p183oa.c, p311z4.f
    public Object apply(Object obj) throws Exception {
        l observableFlatMap;
        CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
        H h8 = (H) this.f3186c;
        h8.getClass();
        if (campaignProto$ThickContent.J()) {
            return h.b(campaignProto$ThickContent);
        }
        p033c7.A a10 = h8.f22359g;
        a10.getClass();
        String strH = campaignProto$ThickContent.K().equals(CampaignProto$ThickContent.PayloadCase.VANILLA_PAYLOAD) ? campaignProto$ThickContent.N().H() : campaignProto$ThickContent.I().H();
        io.reactivex.internal.operators.maybe.j jVar = new io.reactivex.internal.operators.maybe.j(a10.a(), new C4.a(4));
        C4.b bVar = new C4.b(5);
        l lVarA = jVar instanceof d ? ((d) jVar).a() : new MaybeToObservable(jVar);
        int i10 = p123ja.d.f41194b;
        Q3.d.L(BrazeLogger.SUPPRESS, "maxConcurrency");
        Q3.d.L(i10, "bufferSize");
        if (lVarA instanceof ra.h) {
            T tCall = ((ra.h) lVarA).call();
            observableFlatMap = tCall == 0 ? io.reactivex.internal.operators.observable.d.f40851b : new i(tCall, bVar);
        } else {
            observableFlatMap = new ObservableFlatMap(lVarA, bVar, i10);
        }
        C1251w c1251w = new C1251w(1);
        observableFlatMap.getClass();
        io.reactivex.internal.operators.observable.h hVar = new io.reactivex.internal.operators.observable.h(observableFlatMap, c1251w);
        Q3.d.I(strH, "element is null");
        return new io.reactivex.internal.operators.maybe.j(new io.reactivex.internal.operators.maybe.d(new io.reactivex.internal.operators.single.b(new SingleResumeNext(new io.reactivex.internal.operators.single.a(new io.reactivex.internal.operators.observable.c(hVar, new qa.a.e(strH)), new B6.c(5)), new qa.a.g(new io.reactivex.internal.operators.single.c())), new S6.i(2, campaignProto$ThickContent)), new C1293h(6)), new C1402u(campaignProto$ThickContent));
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.e
    public int b(Object obj) {
        androidx.media3.exoplayer.mediacodec.d dVar = (androidx.media3.exoplayer.mediacodec.d) obj;
        dVar.getClass();
        n nVar = (n) this.f3186c;
        String str = nVar.f35302n;
        String str2 = dVar.f18576b;
        return ((str2.equals(str) || str2.equals(MediaCodecUtil.b(nVar))) && dVar.c(nVar, false) && dVar.d(nVar)) ? 1 : 0;
    }

    @Override // p191p5.c
    public void e(g gVar) {
        ((ScheduledFuture) this.f3186c).cancel(false);
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        float[] fArr = androidx.compose.ui.graphics.colorspace.f.f13567a;
        return androidx.compose.ui.graphics.colorspace.f.b((t) this.f3186c, d10);
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        Class cls = (Class) this.f3186c;
        try {
            return com.google.gson.internal.l.f28975a.a(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        switch (this.f3185b) {
            case 2:
                ((v.c) obj).A((p102i1.b) this.f3186c);
                break;
            default:
                ((p162n1.b) obj).getClass();
                break;
        }
    }

    public /* synthetic */ a(n1.b.a aVar, List list) {
        this.f3185b = 6;
        this.f3186c = list;
    }
}
