package p152m1;

import X1.j;
import androidx.media3.decoder.DecoderException;

/* JADX INFO: compiled from: Decoder.java */
/* JADX INFO: loaded from: classes.dex */
public interface c<I, O, E extends DecoderException> {
    void a();

    void b(j jVar) throws DecoderException;

    void c(long j);

    O e() throws DecoderException;

    I f() throws DecoderException;

    void flush();
}
