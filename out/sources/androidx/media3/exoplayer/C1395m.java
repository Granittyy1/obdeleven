package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.media3.exoplayer.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultRenderersFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1395m implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.exoplayer.mediacodec.b f18485b;

    public C1395m(Context context) {
        this.f18484a = context;
        this.f18485b = new androidx.media3.exoplayer.mediacodec.b(context);
    }

    @Override // androidx.media3.exoplayer.q0
    public final m0[] a(Handler handler, K.a aVar, K.a aVar2, K.a aVar3, K.a aVar4) {
        ArrayList arrayList = new ArrayList();
        Context context = this.f18484a;
        y1.f.c cVar = new y1.f.c(context);
        androidx.media3.exoplayer.mediacodec.b bVar = this.f18485b;
        cVar.f48096c = bVar;
        cVar.f48097d = 5000L;
        cVar.f48098e = handler;
        cVar.f48099f = aVar;
        cVar.f48100g = 50;
        p241t7.b.k(!cVar.f48095b);
        Handler handler2 = cVar.f48098e;
        p241t7.b.k((handler2 == null && cVar.f48099f == null) || !(handler2 == null || cVar.f48099f == null));
        cVar.f48095b = true;
        arrayList.add(new p297y1.f(cVar));
        DefaultAudioSink.c cVar2 = new DefaultAudioSink.c(context);
        p241t7.b.k(!cVar2.f18265d);
        cVar2.f18265d = true;
        if (cVar2.f18264c == null) {
            cVar2.f18264c = new DefaultAudioSink.e(new AudioProcessor[0]);
        }
        if (cVar2.f18268g == null) {
            cVar2.f18268g = new p175o1.o(context);
        }
        arrayList.add(new androidx.media3.exoplayer.audio.c(this.f18484a, bVar, handler, aVar2, new DefaultAudioSink(cVar2)));
        arrayList.add(new p247u1.e(aVar3, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new p223s1.b(aVar4, looper));
        arrayList.add(new p223s1.b(aVar4, looper));
        arrayList.add(new p308z1.b());
        arrayList.add(new p200q1.e(q1.c.a.f45979a));
        return (m0[]) arrayList.toArray(new m0[0]);
    }

    @Override // androidx.media3.exoplayer.q0
    public final void b(m0 m0Var) {
        m0Var.getClass();
    }
}
