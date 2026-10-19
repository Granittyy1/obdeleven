package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: BaseAudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioProcessor.a f17875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioProcessor.a f17876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AudioProcessor.a f17877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioProcessor.a f17878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f17879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f17880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17881h;

    public b() {
        ByteBuffer byteBuffer = AudioProcessor.f17865a;
        this.f17879f = byteBuffer;
        this.f17880g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f17866e;
        this.f17877d = aVar;
        this.f17878e = aVar;
        this.f17875b = aVar;
        this.f17876c = aVar;
    }

    public abstract AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException;

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean c() {
        return this.f17878e != AudioProcessor.a.f17866e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean d() {
        return this.f17881h && this.f17880g == AudioProcessor.f17865a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.f17880g;
        this.f17880g = AudioProcessor.f17865a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.f17880g = AudioProcessor.f17865a;
        this.f17881h = false;
        this.f17875b = this.f17877d;
        this.f17876c = this.f17878e;
        b();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void g() {
        this.f17881h = true;
        i();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.f17877d = aVar;
        this.f17878e = a(aVar);
        return c() ? this.f17878e : AudioProcessor.a.f17866e;
    }

    public final ByteBuffer k(int i10) {
        if (this.f17879f.capacity() < i10) {
            this.f17879f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f17879f.clear();
        }
        ByteBuffer byteBuffer = this.f17879f;
        this.f17880g = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f17879f = AudioProcessor.f17865a;
        AudioProcessor.a aVar = AudioProcessor.a.f17866e;
        this.f17877d = aVar;
        this.f17878e = aVar;
        this.f17875b = aVar;
        this.f17876c = aVar;
        j();
    }

    public void b() {
    }

    public void i() {
    }

    public void j() {
    }
}
