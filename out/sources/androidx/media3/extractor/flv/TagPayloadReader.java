package androidx.media3.extractor.flv;

import A1.K;
import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f18834a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(K k10) {
        this.f18834a = k10;
    }
}
