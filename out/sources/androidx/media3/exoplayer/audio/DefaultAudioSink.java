package androidx.media3.exoplayer.audio;

import K2.v;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.K;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.m0;
import com.google.android.play.integrity.internal.k;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.google.firebase.messaging.RunnableC2055s;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p078g1.C2198d;
import p078g1.C2199e;
import p078g1.u;
import p114j1.A;
import p114j1.j;
import p114j1.z;
import p175o1.l;
import p175o1.m;
import p175o1.n;
import p175o1.o;
import p175o1.p;
import p175o1.q;
import p175o1.s;
import p175o1.t;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultAudioSink {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Object f18197j0 = new Object();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static ScheduledExecutorService f18198k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static int f18199l0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public f f18200A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public f f18201B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public u f18202C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f18203D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ByteBuffer f18204E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f18205F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f18206G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f18207H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f18208I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f18209J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f18210K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f18211L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f18212M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f18213N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f18214O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ByteBuffer f18215P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f18216Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ByteBuffer f18217R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f18218S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f18219T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f18220U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f18221V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f18222W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f18223X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C2199e f18224Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public k f18225Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18226a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f18227a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f18228b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f18229b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f18230c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f18231c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p175o1.u f18232d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f18233d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImmutableList<AudioProcessor> f18234e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f18235e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImmutableList<AudioProcessor> f18236f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Looper f18237f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f18238g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long f18239g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayDeque<f> f18240h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public long f18241h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f18242i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Handler f18243i0;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j f18244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h<AudioSink$InitializationException> f18245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h<AudioSink$WriteException> f18246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.media3.exoplayer.audio.a f18247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o f18248o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.media3.exoplayer.audio.b f18249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p162n1.u f18250q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.media3.exoplayer.audio.c.a f18251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d f18252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f18253t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public androidx.media3.common.audio.a f18254u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AudioTrack f18255v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p175o1.a f18256w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p175o1.b f18257x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public g f18258y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C2198d f18259z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
    }

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.media3.exoplayer.audio.a f18260a = new androidx.media3.exoplayer.audio.a();
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.media3.exoplayer.audio.b f18261a = new androidx.media3.exoplayer.audio.b();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f18262a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f18264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f18265d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f18268g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p175o1.a f18263b = p175o1.a.f45052c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final androidx.media3.exoplayer.audio.a f18266e = a.f18260a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final androidx.media3.exoplayer.audio.b f18267f = b.f18261a;

        public c(Context context) {
            this.f18262a = context;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p078g1.n f18269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f18272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f18274f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f18275g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f18276h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final androidx.media3.common.audio.a f18277i;
        public final boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f18278k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f18279l;

        public d(p078g1.n nVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, androidx.media3.common.audio.a aVar, boolean z10, boolean z11, boolean z12) {
            this.f18269a = nVar;
            this.f18270b = i10;
            this.f18271c = i11;
            this.f18272d = i12;
            this.f18273e = i13;
            this.f18274f = i14;
            this.f18275g = i15;
            this.f18276h = i16;
            this.f18277i = aVar;
            this.j = z10;
            this.f18278k = z11;
            this.f18279l = z12;
        }

        public final p175o1.k a() {
            return new p175o1.k(this.f18275g, this.f18273e, this.f18274f, this.f18276h, this.f18279l, this.f18271c == 1);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioProcessor[] f18280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f18281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.audio.c f18282c;

        public e(AudioProcessor... audioProcessorArr) {
            s sVar = new s();
            androidx.media3.common.audio.c cVar = new androidx.media3.common.audio.c();
            cVar.f17883c = 1.0f;
            cVar.f17884d = 1.0f;
            AudioProcessor.a aVar = AudioProcessor.a.f17866e;
            cVar.f17885e = aVar;
            cVar.f17886f = aVar;
            cVar.f17887g = aVar;
            cVar.f17888h = aVar;
            ByteBuffer byteBuffer = AudioProcessor.f17865a;
            cVar.f17890k = byteBuffer;
            cVar.f17891l = byteBuffer.asShortBuffer();
            cVar.f17892m = byteBuffer;
            cVar.f17882b = -1;
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f18280a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f18281b = sVar;
            this.f18282c = cVar;
            audioProcessorArr2[audioProcessorArr.length] = sVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = cVar;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f18283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f18285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f18286d;

        public f(u uVar, long j, long j10) {
            this.f18283a = uVar;
            this.f18284b = j;
            this.f18285c = j10;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f18287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p175o1.b f18288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p f18289c = new AudioRouting.OnRoutingChangedListener() { // from class: o1.p
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                AudioDeviceInfo routedDevice;
                DefaultAudioSink.g gVar = this.f45157a;
                if (gVar.f18289c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                    return;
                }
                gVar.f18288b.b(routedDevice);
            }
        };

        /* JADX WARN: Type inference failed for: r3v1, types: [o1.p] */
        public g(AudioTrack audioTrack, p175o1.b bVar) {
            this.f18287a = audioTrack;
            this.f18288b = bVar;
            audioTrack.addOnRoutingChangedListener(this.f18289c, new Handler(Looper.myLooper()));
        }
    }

    public static final class h<T extends Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f18290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f18291b = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f18292c = -9223372036854775807L;

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public final void a(T t8) throws Exception {
            boolean z10;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f18290a == null) {
                this.f18290a = t8;
            }
            if (this.f18291b == -9223372036854775807L) {
                synchronized (DefaultAudioSink.f18197j0) {
                    z10 = DefaultAudioSink.f18199l0 > 0;
                }
                if (!z10) {
                    this.f18291b = 200 + jElapsedRealtime;
                }
            }
            long j = this.f18291b;
            if (j == -9223372036854775807L || jElapsedRealtime < j) {
                this.f18292c = jElapsedRealtime + 50;
                return;
            }
            T t10 = this.f18290a;
            if (t10 != t8) {
                t10.addSuppressed(t8);
            }
            T t11 = this.f18290a;
            this.f18290a = null;
            this.f18291b = -9223372036854775807L;
            this.f18292c = -9223372036854775807L;
            throw t11;
        }
    }

    public final class i {
        public i() {
        }
    }

    public final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f18294a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f18295b = new a();

        public class a extends AudioTrack$StreamEventCallback {
            public a() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i10) {
                DefaultAudioSink defaultAudioSink;
                androidx.media3.exoplayer.audio.c.a aVar;
                m0.a aVar2;
                if (audioTrack.equals(DefaultAudioSink.this.f18255v) && (aVar = (defaultAudioSink = DefaultAudioSink.this).f18251r) != null && defaultAudioSink.f18221V && (aVar2 = androidx.media3.exoplayer.audio.c.this.f18499G) != null) {
                    aVar2.b();
                }
            }

            public final void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f18255v)) {
                    DefaultAudioSink.this.f18220U = true;
                }
            }

            public final void onTearDown(AudioTrack audioTrack) {
                DefaultAudioSink defaultAudioSink;
                androidx.media3.exoplayer.audio.c.a aVar;
                m0.a aVar2;
                if (audioTrack.equals(DefaultAudioSink.this.f18255v) && (aVar = (defaultAudioSink = DefaultAudioSink.this).f18251r) != null && defaultAudioSink.f18221V && (aVar2 = androidx.media3.exoplayer.audio.c.this.f18499G) != null) {
                    aVar2.b();
                }
            }
        }

        public j() {
        }
    }

    public DefaultAudioSink(c cVar) {
        Context context = cVar.f18262a;
        this.f18226a = context;
        this.f18259z = C2198d.f35244b;
        this.f18256w = context != null ? null : cVar.f18263b;
        this.f18228b = cVar.f18264c;
        int i10 = A.f40996a;
        this.f18242i = false;
        this.j = 0;
        this.f18247n = cVar.f18266e;
        o oVar = cVar.f18268g;
        oVar.getClass();
        this.f18248o = oVar;
        this.f18238g = new m(new i());
        n nVar = new n();
        this.f18230c = nVar;
        p175o1.u uVar = new p175o1.u();
        uVar.f45181m = A.f40998c;
        this.f18232d = uVar;
        androidx.media3.common.audio.d dVar = new androidx.media3.common.audio.d();
        ImmutableList.b bVar = ImmutableList.f27874c;
        Object[] objArr = {dVar, nVar, uVar};
        p019b6.d.b(3, objArr);
        this.f18234e = ImmutableList.A(3, objArr);
        Object[] objArr2 = {new t(), nVar, uVar};
        p019b6.d.b(3, objArr2);
        this.f18236f = ImmutableList.A(3, objArr2);
        this.f18214O = 1.0f;
        this.f18223X = 0;
        this.f18224Y = new C2199e();
        u uVar2 = u.f35451d;
        this.f18201B = new f(uVar2, 0L, 0L);
        this.f18202C = uVar2;
        this.f18203D = false;
        this.f18240h = new ArrayDeque<>();
        this.f18245l = new h<>();
        this.f18246m = new h<>();
        this.f18249p = cVar.f18267f;
    }

    public static boolean p(AudioTrack audioTrack) {
        return A.f40996a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    public final void a(long j10) {
        u uVar;
        boolean z10 = z();
        boolean z11 = false;
        e eVar = this.f18228b;
        if (z10) {
            uVar = u.f35451d;
        } else {
            if (this.f18227a0) {
                uVar = u.f35451d;
            } else {
                d dVar = this.f18253t;
                if (dVar.f18271c == 0) {
                    int i10 = dVar.f18269a.f35281F;
                    uVar = this.f18202C;
                    eVar.getClass();
                    float f10 = uVar.f35452a;
                    androidx.media3.common.audio.c cVar = eVar.f18282c;
                    cVar.getClass();
                    p241t7.b.e(f10 > 0.0f);
                    if (cVar.f17883c != f10) {
                        cVar.f17883c = f10;
                        cVar.f17889i = true;
                    }
                    float f11 = uVar.f35453b;
                    p241t7.b.e(f11 > 0.0f);
                    if (cVar.f17884d != f11) {
                        cVar.f17884d = f11;
                        cVar.f17889i = true;
                    }
                } else {
                    uVar = u.f35451d;
                }
            }
            this.f18202C = uVar;
        }
        u uVar2 = uVar;
        if (!this.f18227a0) {
            d dVar2 = this.f18253t;
            if (dVar2.f18271c == 0) {
                int i11 = dVar2.f18269a.f35281F;
                z11 = this.f18203D;
                eVar.f18281b.f45169o = z11;
            }
        }
        this.f18203D = z11;
        this.f18240h.add(new f(uVar2, Math.max(0L, j10), A.J(this.f18253t.f18273e, k())));
        androidx.media3.common.audio.a aVar = this.f18253t.f18277i;
        this.f18254u = aVar;
        aVar.b();
        androidx.media3.exoplayer.audio.c.a aVar2 = this.f18251r;
        if (aVar2 != null) {
            final boolean z12 = this.f18203D;
            final p175o1.j jVar = androidx.media3.exoplayer.audio.c.this.f18299T0;
            Handler handler = jVar.f45099a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o1.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        j jVar2 = jVar;
                        jVar2.getClass();
                        int i12 = A.f40996a;
                        K k10 = K.this;
                        boolean z13 = k10.f18013Z;
                        final boolean z14 = z12;
                        if (z13 == z14) {
                            return;
                        }
                        k10.f18013Z = z14;
                        k10.f18033m.e(23, new j.a() { // from class: androidx.media3.exoplayer.J
                            @Override // j1.j.a
                            public final void invoke(Object obj) {
                                ((g1.v.c) obj).N(z14);
                            }
                        });
                    }
                });
            }
        }
    }

    public final AudioTrack b(d dVar) throws AudioSink$InitializationException {
        try {
            return c(dVar.a(), this.f18259z, this.f18223X, dVar.f18269a);
        } catch (AudioSink$InitializationException e10) {
            androidx.media3.exoplayer.audio.c.a aVar = this.f18251r;
            if (aVar != null) {
                aVar.a(e10);
            }
            throw e10;
        }
    }

    public final AudioTrack c(p175o1.k kVar, C2198d c2198d, int i10, p078g1.n nVar) throws AudioSink$InitializationException {
        try {
            AudioTrack audioTrackA = this.f18249p.a(kVar, c2198d, i10);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new AudioSink$InitializationException(state, kVar.f45102b, kVar.f45103c, kVar.f45101a, nVar, kVar.f45105e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new AudioSink$InitializationException(0, kVar.f45102b, kVar.f45103c, kVar.f45101a, nVar, kVar.f45105e, e10);
        }
    }

    public final void d(p078g1.n nVar, int[] iArr) throws AudioSink$ConfigurationException {
        int iIntValue;
        int iIntValue2;
        androidx.media3.common.audio.a aVar;
        boolean z10;
        int i10;
        int iP;
        int i11;
        boolean z11;
        int iG;
        int i12;
        q();
        boolean zEquals = "audio/raw".equals(nVar.f35302n);
        boolean z12 = this.f18242i;
        String str = nVar.f35302n;
        int i13 = nVar.f35280E;
        int i14 = nVar.f35279D;
        if (zEquals) {
            int i15 = nVar.f35281F;
            p241t7.b.e(A.C(i15));
            int iP2 = A.p(i15) * i14;
            ImmutableList.a aVar2 = new ImmutableList.a();
            aVar2.f(this.f18234e);
            aVar2.d(this.f18228b.f18280a);
            aVar = new androidx.media3.common.audio.a(aVar2.h());
            if (aVar.equals(this.f18254u)) {
                aVar = this.f18254u;
            }
            int i16 = nVar.f35282G;
            p175o1.u uVar = this.f18232d;
            uVar.f45178i = i16;
            uVar.j = nVar.f35283H;
            this.f18230c.f45154i = iArr;
            try {
                AudioProcessor.a aVarA = aVar.a(new AudioProcessor.a(i13, i14, i15));
                int i17 = aVarA.f17868b;
                iIntValue2 = A.o(i17);
                int i18 = aVarA.f17869c;
                iP = A.p(i18) * i17;
                i13 = aVarA.f17867a;
                i11 = 0;
                z11 = false;
                z10 = z12;
                i10 = iP2;
                iIntValue = i18;
            } catch (AudioProcessor.UnhandledAudioFormatException e10) {
                throw new AudioSink$ConfigurationException(e10, nVar);
            }
        } else {
            androidx.media3.common.audio.a aVar3 = new androidx.media3.common.audio.a(ImmutableList.K());
            p175o1.c cVarH = this.j != 0 ? h(nVar) : p175o1.c.f45075d;
            if (this.j == 0 || !cVarH.f45076a) {
                Pair<Integer, Integer> pairD = this.f18256w.d(nVar, this.f18259z);
                if (pairD == null) {
                    throw new AudioSink$ConfigurationException(nVar, "Unable to configure passthrough for: " + nVar);
                }
                iIntValue = ((Integer) pairD.first).intValue();
                iIntValue2 = ((Integer) pairD.second).intValue();
                aVar = aVar3;
                z10 = z12;
                i10 = -1;
                iP = -1;
                i11 = 2;
                z11 = false;
            } else {
                str.getClass();
                int iC = p078g1.t.c(str, nVar.f35299k);
                iIntValue2 = A.o(i14);
                aVar = aVar3;
                i11 = 1;
                z10 = true;
                iP = -1;
                z11 = cVarH.f45077b;
                iIntValue = iC;
                i10 = -1;
            }
        }
        if (iIntValue == 0) {
            throw new AudioSink$ConfigurationException(nVar, "Invalid output encoding (mode=" + i11 + ") for: " + nVar);
        }
        if (iIntValue2 == 0) {
            throw new AudioSink$ConfigurationException(nVar, "Invalid output channel config (mode=" + i11 + ") for: " + nVar);
        }
        boolean zEquals2 = "audio/vnd.dts.hd;profile=lbr".equals(str);
        int i19 = nVar.j;
        if (zEquals2 && i19 == -1) {
            i19 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i13, iIntValue2, iIntValue);
        p241t7.b.k(minBufferSize != -2);
        int i20 = iP != -1 ? iP : 1;
        double d10 = z10 ? 8.0d : 1.0d;
        this.f18247n.getClass();
        if (i11 == 0) {
            z10 = z10;
            aVar = aVar;
            long j10 = i13;
            long j11 = i20;
            iG = A.g(minBufferSize * 4, Ints.j0(((((long) 250000) * j10) * j11) / 1000000), Ints.j0(((((long) 750000) * j10) * j11) / 1000000));
        } else if (i11 == 1) {
            iG = Ints.j0((((long) 50000000) * ((long) androidx.media3.exoplayer.audio.a.a(iIntValue))) / 1000000);
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException();
            }
            if (iIntValue == 5) {
                i12 = 500000;
            } else {
                i12 = iIntValue == 8 ? 1000000 : 250000;
            }
            iG = Ints.j0((((long) i12) * ((long) (i19 != -1 ? p095h6.b.b(i19, 8, RoundingMode.CEILING) : androidx.media3.exoplayer.audio.a.a(iIntValue)))) / 1000000);
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) iG) * d10)) + i20) - 1) / i20) * i20;
        this.f18233d0 = false;
        d dVar = new d(nVar, i10, i11, iP, i13, iIntValue2, iIntValue, iMax, aVar, z10, z11, this.f18227a0);
        if (o()) {
            this.f18252s = dVar;
        } else {
            this.f18253t = dVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
    public final void e(long j10) throws Exception {
        int iWrite;
        androidx.media3.exoplayer.audio.c.a aVar;
        m0.a aVar2;
        boolean z10;
        if (this.f18217R == null) {
            return;
        }
        h<AudioSink$WriteException> hVar = this.f18246m;
        boolean z11 = false;
        if (hVar.f18290a != 0) {
            synchronized (f18197j0) {
                z10 = f18199l0 > 0;
            }
            if (z10 || SystemClock.elapsedRealtime() < hVar.f18292c) {
                return;
            }
        }
        int iRemaining = this.f18217R.remaining();
        if (this.f18227a0) {
            p241t7.b.k(j10 != -9223372036854775807L);
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f18229b0;
            } else {
                this.f18229b0 = j10;
            }
            AudioTrack audioTrack = this.f18255v;
            ByteBuffer byteBuffer = this.f18217R;
            if (A.f40996a >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining, 1, 1000 * j10);
            } else {
                if (this.f18204E == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.f18204E = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.f18204E.putInt(1431633921);
                }
                if (this.f18205F == 0) {
                    this.f18204E.putInt(4, iRemaining);
                    this.f18204E.putLong(8, j10 * 1000);
                    this.f18204E.position(0);
                    this.f18205F = iRemaining;
                }
                int iRemaining2 = this.f18204E.remaining();
                if (iRemaining2 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                    if (iWrite < 0) {
                        this.f18205F = 0;
                    } else {
                        this.f18205F -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.f18204E, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.f18205F = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining2) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                        if (iWrite < 0) {
                            this.f18205F = 0;
                        } else {
                            this.f18205F -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = this.f18255v.write(this.f18217R, iRemaining, 1);
        }
        this.f18231c0 = SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            if ((A.f40996a >= 24 && iWrite == -6) || iWrite == -32) {
                if (k() > 0) {
                    z11 = true;
                } else if (p(this.f18255v)) {
                    if (this.f18253t.f18271c == 1) {
                        this.f18233d0 = true;
                    }
                    z11 = true;
                }
            }
            AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(iWrite, this.f18253t.f18269a, z11);
            androidx.media3.exoplayer.audio.c.a aVar3 = this.f18251r;
            if (aVar3 != null) {
                aVar3.a(audioSink$WriteException);
            }
            if (!audioSink$WriteException.isRecoverable || this.f18226a == null) {
                hVar.a(audioSink$WriteException);
                return;
            } else {
                this.f18256w = p175o1.a.f45052c;
                throw audioSink$WriteException;
            }
        }
        hVar.f18290a = null;
        hVar.f18291b = -9223372036854775807L;
        hVar.f18292c = -9223372036854775807L;
        if (p(this.f18255v)) {
            if (this.f18209J > 0) {
                this.f18235e0 = false;
            }
            if (this.f18221V && (aVar = this.f18251r) != null && iWrite < iRemaining && !this.f18235e0 && (aVar2 = androidx.media3.exoplayer.audio.c.this.f18499G) != null) {
                aVar2.a();
            }
        }
        int i10 = this.f18253t.f18271c;
        if (i10 == 0) {
            this.f18208I += (long) iWrite;
        }
        if (iWrite == iRemaining) {
            if (i10 != 0) {
                p241t7.b.k(this.f18217R == this.f18215P);
                this.f18209J = (((long) this.f18210K) * ((long) this.f18216Q)) + this.f18209J;
            }
            this.f18217R = null;
        }
    }

    public final boolean f() throws Exception {
        if (!this.f18254u.e()) {
            e(Long.MIN_VALUE);
            return this.f18217R == null;
        }
        androidx.media3.common.audio.a aVar = this.f18254u;
        if (aVar.e() && !aVar.f17874d) {
            aVar.f17874d = true;
            ((AudioProcessor) aVar.f17872b.get(0)).g();
        }
        t(Long.MIN_VALUE);
        if (!this.f18254u.d()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f18217R;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    public final void g() {
        g gVar;
        if (o()) {
            this.f18206G = 0L;
            this.f18207H = 0L;
            this.f18208I = 0L;
            this.f18209J = 0L;
            this.f18235e0 = false;
            this.f18210K = 0;
            this.f18201B = new f(this.f18202C, 0L, 0L);
            this.f18213N = 0L;
            this.f18200A = null;
            this.f18240h.clear();
            this.f18215P = null;
            this.f18216Q = 0;
            this.f18217R = null;
            this.f18219T = false;
            this.f18218S = false;
            this.f18220U = false;
            this.f18204E = null;
            this.f18205F = 0;
            this.f18232d.f45183o = 0L;
            androidx.media3.common.audio.a aVar = this.f18253t.f18277i;
            this.f18254u = aVar;
            aVar.b();
            AudioTrack audioTrack = this.f18238g.f45131c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f18255v.pause();
            }
            if (p(this.f18255v)) {
                j jVar = this.f18244k;
                jVar.getClass();
                this.f18255v.unregisterStreamEventCallback(jVar.f18295b);
                jVar.f18294a.removeCallbacksAndMessages(null);
            }
            p175o1.k kVarA = this.f18253t.a();
            d dVar = this.f18252s;
            if (dVar != null) {
                this.f18253t = dVar;
                this.f18252s = null;
            }
            m mVar = this.f18238g;
            mVar.e();
            mVar.f45131c = null;
            mVar.f45133e = null;
            if (A.f40996a >= 24 && (gVar = this.f18258y) != null) {
                p pVar = gVar.f18289c;
                pVar.getClass();
                gVar.f18287a.removeOnRoutingChangedListener(pVar);
                gVar.f18289c = null;
                this.f18258y = null;
            }
            AudioTrack audioTrack2 = this.f18255v;
            androidx.media3.exoplayer.audio.c.a aVar2 = this.f18251r;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f18197j0) {
                try {
                    if (f18198k0 == null) {
                        f18198k0 = Executors.newSingleThreadScheduledExecutor(new z());
                    }
                    f18199l0++;
                    f18198k0.schedule(new v(audioTrack2, aVar2, handler, kVarA, 1), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f18255v = null;
        }
        h<AudioSink$WriteException> hVar = this.f18246m;
        hVar.f18290a = null;
        hVar.f18291b = -9223372036854775807L;
        hVar.f18292c = -9223372036854775807L;
        h<AudioSink$InitializationException> hVar2 = this.f18245l;
        hVar2.f18290a = null;
        hVar2.f18291b = -9223372036854775807L;
        hVar2.f18292c = -9223372036854775807L;
        this.f18239g0 = 0L;
        this.f18241h0 = 0L;
        Handler handler2 = this.f18243i0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final p175o1.c h(p078g1.n nVar) {
        int i10;
        boolean zBooleanValue;
        if (this.f18233d0) {
            return p175o1.c.f45075d;
        }
        C2198d c2198d = this.f18259z;
        o oVar = this.f18248o;
        oVar.getClass();
        nVar.getClass();
        c2198d.getClass();
        int i11 = A.f40996a;
        if (i11 < 29 || (i10 = nVar.f35280E) == -1) {
            return p175o1.c.f45075d;
        }
        Boolean bool = oVar.f45156b;
        boolean z10 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = oVar.f45155a;
            if (context != null) {
                String parameters = p090h1.d.a(context).getParameters("offloadVariableRateSupported");
                oVar.f45156b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                oVar.f45156b = Boolean.FALSE;
            }
            zBooleanValue = oVar.f45156b.booleanValue();
        }
        String str = nVar.f35302n;
        str.getClass();
        int iC = p078g1.t.c(str, nVar.f35299k);
        if (iC == 0 || i11 < A.m(iC)) {
            return p175o1.c.f45075d;
        }
        int iO = A.o(nVar.f35279D);
        if (iO == 0) {
            return p175o1.c.f45075d;
        }
        try {
            AudioFormat audioFormatN = A.n(i10, iO, iC);
            if (i11 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatN, c2198d.a().f35246a)) {
                    return p175o1.c.f45075d;
                }
                o1.c.a aVar = new o1.c.a();
                aVar.f45079a = true;
                aVar.f45081c = zBooleanValue;
                return aVar.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatN, c2198d.a().f35246a);
            if (playbackOffloadSupport == 0) {
                return p175o1.c.f45075d;
            }
            o1.c.a aVar2 = new o1.c.a();
            if (i11 > 32 && playbackOffloadSupport == 2) {
                z10 = true;
            }
            aVar2.f45079a = true;
            aVar2.f45080b = z10;
            aVar2.f45081c = zBooleanValue;
            return aVar2.a();
        } catch (IllegalArgumentException unused) {
            return p175o1.c.f45075d;
        }
    }

    public final int i(p078g1.n nVar) {
        q();
        if (!"audio/raw".equals(nVar.f35302n)) {
            return this.f18256w.d(nVar, this.f18259z) != null ? 2 : 0;
        }
        int i10 = nVar.f35281F;
        if (A.C(i10)) {
            return i10 != 2 ? 1 : 2;
        }
        com.google.gson.internal.b.e(i10, "Invalid PCM encoding: ");
        return 0;
    }

    public final long j() {
        d dVar = this.f18253t;
        return dVar.f18271c == 0 ? this.f18206G / ((long) dVar.f18270b) : this.f18207H;
    }

    public final long k() {
        d dVar = this.f18253t;
        if (dVar.f18271c != 0) {
            return this.f18209J;
        }
        long j10 = this.f18208I;
        long j11 = dVar.f18272d;
        int i10 = A.f40996a;
        return ((j10 + j11) - 1) / j11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:139:0x023a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0271  */
    /* JADX WARN: Code duplicated, block: B:164:0x0273  */
    /* JADX WARN: Code duplicated, block: B:166:0x0281  */
    /* JADX WARN: Code duplicated, block: B:169:0x0292  */
    /* JADX WARN: Code duplicated, block: B:171:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:179:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:180:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:182:0x02d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:185:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:188:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:190:0x0303  */
    /* JADX WARN: Code duplicated, block: B:191:0x0314  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010d, code lost:
    
        if (r10.b() == 0) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.nio.ByteBuffer r24, final long r25, int r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.l(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean m() {
        return o() && !(A.f40996a >= 29 && this.f18255v.isOffloadedPlayback() && this.f18220U) && this.f18238g.d(k());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    /* JADX WARN: Code duplicated, block: B:82:0x019b  */
    /* JADX WARN: Code duplicated, block: B:93:? A[SYNTHETIC] */
    public final boolean n() throws AudioSink$InitializationException {
        boolean z10;
        boolean z11;
        AudioTrack audioTrackB;
        p175o1.b bVar;
        p162n1.u uVar;
        h<AudioSink$InitializationException> hVar = this.f18245l;
        if (hVar.f18290a == 0) {
            z11 = false;
        } else {
            synchronized (f18197j0) {
                z10 = f18199l0 > 0;
            }
            if (!z10 && SystemClock.elapsedRealtime() >= hVar.f18292c) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if (z11) {
            return false;
        }
        try {
            d dVar = this.f18253t;
            dVar.getClass();
            audioTrackB = b(dVar);
        } catch (AudioSink$InitializationException e10) {
            d dVar2 = this.f18253t;
            if (dVar2.f18276h > 1000000) {
                d dVar3 = new d(dVar2.f18269a, dVar2.f18270b, dVar2.f18271c, dVar2.f18272d, dVar2.f18273e, dVar2.f18274f, dVar2.f18275g, 1000000, dVar2.f18277i, dVar2.j, dVar2.f18278k, dVar2.f18279l);
                try {
                    audioTrackB = b(dVar3);
                    this.f18253t = dVar3;
                } catch (AudioSink$InitializationException e11) {
                    e10.addSuppressed(e11);
                    if (this.f18253t.f18271c == 1) {
                        throw e10;
                    }
                    this.f18233d0 = true;
                    throw e10;
                }
            }
            if (this.f18253t.f18271c == 1) {
                throw e10;
            }
            this.f18233d0 = true;
            throw e10;
        }
        this.f18255v = audioTrackB;
        if (p(audioTrackB)) {
            AudioTrack audioTrack = this.f18255v;
            if (this.f18244k == null) {
                this.f18244k = new j();
            }
            j jVar = this.f18244k;
            Handler handler = jVar.f18294a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new q(handler), jVar.f18295b);
            d dVar4 = this.f18253t;
            if (dVar4.f18278k) {
                AudioTrack audioTrack2 = this.f18255v;
                p078g1.n nVar = dVar4.f18269a;
                audioTrack2.setOffloadDelayPadding(nVar.f35282G, nVar.f35283H);
            }
        }
        int i10 = A.f40996a;
        if (i10 >= 31 && (uVar = this.f18250q) != null) {
            AudioTrack audioTrack3 = this.f18255v;
            LogSessionId logSessionIdA = uVar.a();
            if (!logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                audioTrack3.setLogSessionId(logSessionIdA);
            }
        }
        this.f18223X = this.f18255v.getAudioSessionId();
        AudioTrack audioTrack4 = this.f18255v;
        d dVar5 = this.f18253t;
        boolean z12 = dVar5.f18271c == 2;
        int i11 = dVar5.f18275g;
        int i12 = dVar5.f18272d;
        int i13 = dVar5.f18276h;
        m mVar = this.f18238g;
        mVar.f45131c = audioTrack4;
        mVar.f45132d = i13;
        mVar.f45133e = new l(audioTrack4);
        mVar.f45134f = audioTrack4.getSampleRate();
        mVar.f45135g = z12 && i10 < 23 && (i11 == 5 || i11 == 6);
        boolean zC = A.C(i11);
        mVar.f45143p = zC;
        mVar.f45136h = zC ? A.J(mVar.f45134f, i13 / i12) : -9223372036854775807L;
        mVar.f45146s = 0L;
        mVar.f45147t = 0L;
        mVar.f45126G = false;
        mVar.f45127H = 0L;
        mVar.f45148u = 0L;
        mVar.f45142o = false;
        mVar.f45151x = -9223372036854775807L;
        mVar.f45152y = -9223372036854775807L;
        mVar.f45144q = 0L;
        mVar.f45141n = 0L;
        mVar.f45137i = 1.0f;
        if (o()) {
            this.f18255v.setVolume(this.f18214O);
        }
        this.f18224Y.getClass();
        k kVar = this.f18225Z;
        if (kVar != null && i10 >= 23) {
            this.f18255v.setPreferredDevice((AudioDeviceInfo) kVar.f27754b);
            p175o1.b bVar2 = this.f18257x;
            if (bVar2 != null) {
                bVar2.b((AudioDeviceInfo) this.f18225Z.f27754b);
            }
        }
        if (i10 >= 24 && (bVar = this.f18257x) != null) {
            this.f18258y = new g(this.f18255v, bVar);
        }
        this.f18212M = true;
        androidx.media3.exoplayer.audio.c.a aVar = this.f18251r;
        if (aVar != null) {
            p175o1.k kVarA = this.f18253t.a();
            p175o1.j jVar2 = androidx.media3.exoplayer.audio.c.this.f18299T0;
            Handler handler2 = jVar2.f45099a;
            if (handler2 != null) {
                handler2.post(new RunnableC2055s(jVar2, 1, kVarA));
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f18255v != null;
    }

    public final void q() {
        Context context;
        p175o1.a aVarB;
        o1.b.a aVar;
        if (this.f18257x == null && (context = this.f18226a) != null) {
            this.f18237f0 = Looper.myLooper();
            p175o1.b bVar = new p175o1.b(context, new I4.e(this), this.f18259z, this.f18225Z);
            this.f18257x = bVar;
            if (bVar.j) {
                aVarB = bVar.f45067g;
                aVarB.getClass();
            } else {
                bVar.j = true;
                p175o1.b.C0513b c0513b = bVar.f45066f;
                if (c0513b != null) {
                    c0513b.f45071a.registerContentObserver(c0513b.f45072b, false, c0513b);
                }
                int i10 = A.f40996a;
                Handler handler = bVar.f45063c;
                Context context2 = bVar.f45061a;
                if (i10 >= 23 && (aVar = bVar.f45064d) != null) {
                    p090h1.d.a(context2).registerAudioDeviceCallback(aVar, handler);
                }
                aVarB = p175o1.a.b(context2, context2.registerReceiver(bVar.f45065e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), bVar.f45069i, bVar.f45068h);
                bVar.f45067g = aVarB;
            }
            this.f18256w = aVarB;
        }
        this.f18256w.getClass();
    }

    public final void r() {
        this.f18221V = true;
        if (o()) {
            m mVar = this.f18238g;
            if (mVar.f45151x != -9223372036854775807L) {
                mVar.f45128I.getClass();
                mVar.f45151x = A.F(SystemClock.elapsedRealtime());
            }
            l lVar = mVar.f45133e;
            lVar.getClass();
            lVar.a();
            this.f18255v.play();
        }
    }

    public final void s() {
        if (this.f18219T) {
            return;
        }
        this.f18219T = true;
        long jK = k();
        m mVar = this.f18238g;
        mVar.f45153z = mVar.b();
        mVar.f45128I.getClass();
        mVar.f45151x = A.F(SystemClock.elapsedRealtime());
        mVar.f45120A = jK;
        if (p(this.f18255v)) {
            this.f18220U = false;
        }
        this.f18255v.stop();
        this.f18205F = 0;
    }

    public final void t(long j10) throws Exception {
        ByteBuffer byteBuffer;
        e(j10);
        if (this.f18217R != null) {
            return;
        }
        if (!this.f18254u.e()) {
            ByteBuffer byteBuffer2 = this.f18215P;
            if (byteBuffer2 != null) {
                x(byteBuffer2);
                e(j10);
                return;
            }
            return;
        }
        while (!this.f18254u.d()) {
            do {
                androidx.media3.common.audio.a aVar = this.f18254u;
                if (aVar.e()) {
                    ByteBuffer byteBuffer3 = aVar.f17873c[aVar.c()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        aVar.f(AudioProcessor.f17865a);
                        byteBuffer = aVar.f17873c[aVar.c()];
                    }
                } else {
                    byteBuffer = AudioProcessor.f17865a;
                }
                if (byteBuffer.hasRemaining()) {
                    x(byteBuffer);
                    e(j10);
                } else {
                    ByteBuffer byteBuffer4 = this.f18215P;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    androidx.media3.common.audio.a aVar2 = this.f18254u;
                    ByteBuffer byteBuffer5 = this.f18215P;
                    if (aVar2.e() && !aVar2.f17874d) {
                        aVar2.f(byteBuffer5);
                    }
                }
            } while (this.f18217R == null);
            return;
        }
    }

    public final void u() {
        g();
        ImmutableList.b bVarListIterator = this.f18234e.listIterator(0);
        while (bVarListIterator.hasNext()) {
            ((AudioProcessor) bVarListIterator.next()).reset();
        }
        ImmutableList.b bVarListIterator2 = this.f18236f.listIterator(0);
        while (bVarListIterator2.hasNext()) {
            ((AudioProcessor) bVarListIterator2.next()).reset();
        }
        androidx.media3.common.audio.a aVar = this.f18254u;
        if (aVar != null) {
            int i10 = 0;
            while (true) {
                ImmutableList<AudioProcessor> immutableList = aVar.f17871a;
                if (i10 >= immutableList.size()) {
                    break;
                }
                AudioProcessor audioProcessor = immutableList.get(i10);
                audioProcessor.flush();
                audioProcessor.reset();
                i10++;
            }
            aVar.f17873c = new ByteBuffer[0];
            AudioProcessor.a aVar2 = AudioProcessor.a.f17866e;
            aVar.f17874d = false;
        }
        this.f18221V = false;
        this.f18233d0 = false;
    }

    public final void v() {
        if (o()) {
            try {
                this.f18255v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f18202C.f35452a).setPitch(this.f18202C.f35453b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                p114j1.k.g("Failed to set playback params", e10);
            }
            u uVar = new u(this.f18255v.getPlaybackParams().getSpeed(), this.f18255v.getPlaybackParams().getPitch());
            this.f18202C = uVar;
            float f10 = uVar.f35452a;
            m mVar = this.f18238g;
            mVar.f45137i = f10;
            l lVar = mVar.f45133e;
            if (lVar != null) {
                lVar.a();
            }
            mVar.e();
        }
    }

    public final void w(int i10) {
        p241t7.b.k(A.f40996a >= 29);
        this.j = i10;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:47:0x013c  */
    /* JADX WARN: Code duplicated, block: B:49:0x013f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:54:0x0148  */
    /* JADX WARN: Code duplicated, block: B:56:0x014c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150  */
    /* JADX WARN: Code duplicated, block: B:60:0x0154  */
    /* JADX WARN: Code duplicated, block: B:63:0x0172  */
    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    /* JADX WARN: Code duplicated, block: B:65:0x0192  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01be  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0055 A[SYNTHETIC] */
    public final void x(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i10;
        byte b10;
        int i11;
        int i12;
        int i13;
        float f10;
        p241t7.b.k(this.f18217R == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f18253t.f18271c != 0) {
                byteBufferOrder = byteBuffer;
            } else {
                int iL = (int) A.L(A.F(20L), this.f18253t.f18273e, 1000000L, RoundingMode.UP);
                long jK = k();
                long j10 = iL;
                if (jK >= j10) {
                    byteBufferOrder = byteBuffer;
                } else {
                    d dVar = this.f18253t;
                    int i14 = dVar.f18275g;
                    int i15 = (int) jK;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i15 < iL) {
                        if (i14 != 2) {
                            if (i14 == 3) {
                                i12 = (byteBuffer.get() & 255) << 24;
                            } else if (i14 == 4) {
                                float f11 = A.f(byteBuffer.getFloat(), -1.0f, 1.0f);
                                if (f11 < 0.0f) {
                                    f11 = -f11;
                                    f10 = -2.1474836E9f;
                                } else {
                                    f10 = 2.1474836E9f;
                                }
                                i12 = (int) (f11 * f10);
                            } else if (i14 != 21) {
                                if (i14 == 22) {
                                    i10 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                    b10 = byteBuffer.get();
                                } else if (i14 == 268435456) {
                                    i10 = (byteBuffer.get() & 255) << 24;
                                    i11 = (byteBuffer.get() & 255) << 16;
                                } else if (i14 == 1342177280) {
                                    i10 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i11 = (byteBuffer.get() & 255) << 8;
                                } else {
                                    if (i14 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    i10 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i11 = byteBuffer.get() & 255;
                                }
                                i12 = i10 | i11;
                            } else {
                                i10 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b10 = byteBuffer.get();
                            }
                            i13 = (int) ((((long) i12) * ((long) i15)) / j10);
                            if (i14 != 2) {
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i14 != 3) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i14 != 4) {
                                if (i14 != 21) {
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                } else if (i14 != 22) {
                                    byteBufferOrder.put((byte) i13);
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                } else if (i14 != 268435456) {
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                } else if (i14 != 1342177280) {
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                } else {
                                    if (i14 == 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                    byteBufferOrder.put((byte) i13);
                                }
                            } else if (i13 < 0) {
                                byteBufferOrder.putFloat((-i13) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i13 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == dVar.f18272d + iPosition) {
                                i15++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i10 = (byteBuffer.get() & 255) << 16;
                            b10 = byteBuffer.get();
                        }
                        i11 = (b10 & 255) << 24;
                        i12 = i10 | i11;
                        i13 = (int) ((((long) i12) * ((long) i15)) / j10);
                        if (i14 != 2) {
                            byteBufferOrder.put((byte) (i13 >> 16));
                            byteBufferOrder.put((byte) (i13 >> 24));
                        } else if (i14 != 3) {
                            byteBufferOrder.put((byte) (i13 >> 24));
                        } else if (i14 != 4) {
                            if (i14 != 21) {
                                byteBufferOrder.put((byte) (i13 >> 8));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i14 != 22) {
                                byteBufferOrder.put((byte) i13);
                                byteBufferOrder.put((byte) (i13 >> 8));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i14 != 268435456) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                                byteBufferOrder.put((byte) (i13 >> 16));
                            } else if (i14 != 1342177280) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 8));
                            } else {
                                if (i14 == 1610612736) {
                                    throw new IllegalStateException();
                                }
                                byteBufferOrder.put((byte) (i13 >> 24));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 8));
                                byteBufferOrder.put((byte) i13);
                            }
                        } else if (i13 < 0) {
                            byteBufferOrder.putFloat((-i13) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i13 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == dVar.f18272d + iPosition) {
                            i15++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            }
            this.f18217R = byteBufferOrder;
        }
    }

    public final boolean y(p078g1.n nVar) {
        return i(nVar) != 0;
    }

    public final boolean z() {
        d dVar = this.f18253t;
        return dVar != null && dVar.j && A.f40996a >= 23;
    }
}
