package androidx.media3.common.audio;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: AudioProcessingPipeline.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList<AudioProcessor> f17871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17872b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f17873c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17874d;

    public a(ImmutableList<AudioProcessor> immutableList) {
        this.f17871a = immutableList;
        AudioProcessor.a aVar = AudioProcessor.a.f17866e;
        this.f17874d = false;
    }

    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.equals(AudioProcessor.a.f17866e)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i10 = 0;
        while (true) {
            ImmutableList<AudioProcessor> immutableList = this.f17871a;
            if (i10 >= immutableList.size()) {
                return aVar;
            }
            AudioProcessor audioProcessor = immutableList.get(i10);
            AudioProcessor.a aVarH = audioProcessor.h(aVar);
            if (audioProcessor.c()) {
                p241t7.b.k(!aVarH.equals(AudioProcessor.a.f17866e));
                aVar = aVarH;
            }
            i10++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f17872b;
        arrayList.clear();
        this.f17874d = false;
        int i10 = 0;
        while (true) {
            ImmutableList<AudioProcessor> immutableList = this.f17871a;
            if (i10 >= immutableList.size()) {
                break;
            }
            AudioProcessor audioProcessor = immutableList.get(i10);
            audioProcessor.flush();
            if (audioProcessor.c()) {
                arrayList.add(audioProcessor);
            }
            i10++;
        }
        this.f17873c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f17873c[i11] = ((AudioProcessor) arrayList.get(i11)).e();
        }
    }

    public final int c() {
        return this.f17873c.length - 1;
    }

    public final boolean d() {
        return this.f17874d && ((AudioProcessor) this.f17872b.get(c())).d() && !this.f17873c[c()].hasRemaining();
    }

    public final boolean e() {
        return !this.f17872b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        ImmutableList<AudioProcessor> immutableList = this.f17871a;
        if (immutableList.size() != aVar.f17871a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < immutableList.size(); i10++) {
            if (immutableList.get(i10) != aVar.f17871a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            for (int i10 = 0; i10 <= c(); i10++) {
                if (!this.f17873c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f17872b;
                    AudioProcessor audioProcessor = (AudioProcessor) arrayList.get(i10);
                    if (!audioProcessor.d()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f17873c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f17865a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.f(byteBuffer2);
                        this.f17873c[i10] = audioProcessor.e();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f17873c[i10].hasRemaining();
                    } else if (!this.f17873c[i10].hasRemaining() && i10 < c()) {
                        ((AudioProcessor) arrayList.get(i10 + 1)).g();
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return this.f17871a.hashCode();
    }
}
