package B6;

import A1.p;
import A1.t;
import A6.N;
import A6.f0;
import android.graphics.Bitmap;
import android.util.Base64;
import android.util.JsonReader;
import androidx.compose.ui.text.font.s;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.io.IOException;
import p091h2.C2201a;
import p114j1.j;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements e.a, t, j.a {
    public Bitmap a(int i10, byte[] bArr) throws ImageDecoderException {
        try {
            return p140l1.b.a(i10, bArr);
        } catch (ParserException e10) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i10 + ")", e10);
        } catch (IOException e11) {
            throw new ImageDecoderException(e11);
        }
    }

    @Override // B6.e.a
    public Object b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Long lValueOf = null;
        Long lValueOf2 = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null name");
                    }
                    str = strNextString;
                    break;
                    break;
                case "size":
                    lValueOf2 = Long.valueOf(jsonReader.nextLong());
                    break;
                case "uuid":
                    str2 = new String(Base64.decode(jsonReader.nextString(), 2), f0.f870a);
                    break;
                case "baseAddress":
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strB = lValueOf == null ? " baseAddress" : "";
        if (lValueOf2 == null) {
            strB = strB.concat(" size");
        }
        if (str == null) {
            strB = s.b(strB, " name");
        }
        if (strB.isEmpty()) {
            return new N(lValueOf.longValue(), lValueOf2.longValue(), str, str2);
        }
        throw new IllegalStateException("Missing required properties:".concat(strB));
    }

    @Override // A1.t
    public p[] c() {
        return new p[]{new C2201a()};
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }
}
