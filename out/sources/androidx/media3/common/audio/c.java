package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p090h1.e;

/* JADX INFO: compiled from: SonicAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f17883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f17884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioProcessor.a f17885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AudioProcessor.a f17886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AudioProcessor.a f17887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioProcessor.a f17888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17889i;
    public e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f17890k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f17891l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f17892m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f17893n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f17894o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17895p;

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean c() {
        return this.f17886f.f17867a != -1 && (Math.abs(this.f17883c - 1.0f) >= 1.0E-4f || Math.abs(this.f17884d - 1.0f) >= 1.0E-4f || this.f17886f.f17867a != this.f17885e.f17867a);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean d() {
        if (!this.f17895p) {
            return false;
        }
        e eVar = this.j;
        if (eVar != null) {
            p241t7.b.k(eVar.f35744m >= 0);
            if (eVar.f35744m * eVar.f35734b * 2 != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer e() {
        e eVar = this.j;
        if (eVar != null) {
            p241t7.b.k(eVar.f35744m >= 0);
            int i10 = eVar.f35744m;
            int i11 = eVar.f35734b;
            int i12 = i10 * i11 * 2;
            if (i12 > 0) {
                if (this.f17890k.capacity() < i12) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                    this.f17890k = byteBufferOrder;
                    this.f17891l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f17890k.clear();
                    this.f17891l.clear();
                }
                ShortBuffer shortBuffer = this.f17891l;
                p241t7.b.k(eVar.f35744m >= 0);
                int iMin = Math.min(shortBuffer.remaining() / i11, eVar.f35744m);
                int i13 = iMin * i11;
                shortBuffer.put(eVar.f35743l, 0, i13);
                int i14 = eVar.f35744m - iMin;
                eVar.f35744m = i14;
                short[] sArr = eVar.f35743l;
                System.arraycopy(sArr, i13, sArr, 0, i14 * i11);
                this.f17894o += (long) i12;
                this.f17890k.limit(i12);
                this.f17892m = this.f17890k;
            }
        }
        ByteBuffer byteBuffer = this.f17892m;
        this.f17892m = AudioProcessor.f17865a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            e eVar = this.j;
            eVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f17893n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = eVar.f35734b;
            int i11 = iRemaining2 / i10;
            short[] sArrC = eVar.c(eVar.j, eVar.f35742k, i11);
            eVar.j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, eVar.f35742k * i10, ((i11 * i10) * 2) / 2);
            eVar.f35742k += i11;
            eVar.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        if (c()) {
            AudioProcessor.a aVar = this.f17885e;
            this.f17887g = aVar;
            AudioProcessor.a aVar2 = this.f17886f;
            this.f17888h = aVar2;
            if (this.f17889i) {
                int i10 = aVar.f17867a;
                this.j = new e(this.f17883c, this.f17884d, i10, aVar.f17868b, aVar2.f17867a);
            } else {
                e eVar = this.j;
                if (eVar != null) {
                    eVar.f35742k = 0;
                    eVar.f35744m = 0;
                    eVar.f35746o = 0;
                    eVar.f35747p = 0;
                    eVar.f35748q = 0;
                    eVar.f35749r = 0;
                    eVar.f35750s = 0;
                    eVar.f35751t = 0;
                    eVar.f35752u = 0;
                    eVar.f35753v = 0;
                    eVar.f35754w = 0.0d;
                }
            }
        }
        this.f17892m = AudioProcessor.f17865a;
        this.f17893n = 0L;
        this.f17894o = 0L;
        this.f17895p = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void g() {
        e eVar = this.j;
        if (eVar != null) {
            int i10 = eVar.f35742k;
            float f10 = eVar.f35735c;
            float f11 = eVar.f35736d;
            double d10 = f10 / f11;
            double d11 = eVar.f35737e * f11;
            int i11 = eVar.f35749r;
            int i12 = eVar.f35744m + ((int) ((((((((double) (i10 - i11)) / d10) + ((double) i11)) + eVar.f35754w) + ((double) eVar.f35746o)) / d11) + 0.5d));
            eVar.f35754w = 0.0d;
            short[] sArr = eVar.j;
            int i13 = eVar.f35740h * 2;
            eVar.j = eVar.c(sArr, i10, i13 + i10);
            int i14 = 0;
            while (true) {
                int i15 = eVar.f35734b;
                if (i14 >= i13 * i15) {
                    break;
                }
                eVar.j[(i15 * i10) + i14] = 0;
                i14++;
            }
            eVar.f35742k = i13 + eVar.f35742k;
            eVar.f();
            if (eVar.f35744m > i12) {
                eVar.f35744m = Math.max(i12, 0);
            }
            eVar.f35742k = 0;
            eVar.f35749r = 0;
            eVar.f35746o = 0;
        }
        this.f17895p = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f17869c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i10 = this.f17882b;
        if (i10 == -1) {
            i10 = aVar.f17867a;
        }
        this.f17885e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i10, aVar.f17868b, 2);
        this.f17886f = aVar2;
        this.f17889i = true;
        return aVar2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.f17883c = 1.0f;
        this.f17884d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f17866e;
        this.f17885e = aVar;
        this.f17886f = aVar;
        this.f17887g = aVar;
        this.f17888h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f17865a;
        this.f17890k = byteBuffer;
        this.f17891l = byteBuffer.asShortBuffer();
        this.f17892m = byteBuffer;
        this.f17882b = -1;
        this.f17889i = false;
        this.j = null;
        this.f17893n = 0L;
        this.f17894o = 0L;
        this.f17895p = false;
    }
}
