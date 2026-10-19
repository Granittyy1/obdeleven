package androidx.media3.exoplayer.source;

import A1.J;
import android.net.Uri;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final ImmutableList<J> sniffFailures;
    public final Uri uri;

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends J> list) {
        super(str, null, false, 1);
        this.uri = uri;
        this.sniffFailures = ImmutableList.G(list);
    }
}
