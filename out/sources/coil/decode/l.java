package coil.decode;

import android.graphics.Bitmap;
import android.graphics.Movie;
import android.graphics.Picture;
import coil.transform.PixelOpacity;
import io.intercom.android.sdk.AppIdentityInjector;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;
import java.io.IOException;
import p318zb.InterfaceC2841h;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22900c;

    public /* synthetic */ l(int i10, Object obj) {
        this.f22899b = i10;
        this.f22900c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    @Override // Ia.a
    public final Object invoke() throws IOException {
        Bitmap.Config config;
        switch (this.f22899b) {
            case 0:
                m mVar = (m) this.f22900c;
                boolean z10 = mVar.f22903c;
                x xVar = mVar.f22901a;
                InterfaceC2841h interfaceC2841hB = z10 ? p318zb.v.b(new j(xVar.i())) : xVar.i();
                try {
                    Movie movieDecodeStream = Movie.decodeStream(interfaceC2841hB.X0());
                    p241t7.b.n(interfaceC2841hB, null);
                    if (movieDecodeStream == null || movieDecodeStream.width() <= 0 || movieDecodeStream.height() <= 0) {
                        throw new IllegalStateException("Failed to decode GIF.");
                    }
                    boolean zIsOpaque = movieDecodeStream.isOpaque();
                    coil.request.k kVar = mVar.f22902b;
                    if (zIsOpaque && kVar.f23104g) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = kVar.f23099b;
                        if (config == Bitmap.Config.HARDWARE) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                    }
                    U2.c cVar = new U2.c(movieDecodeStream, config, kVar.f23102e);
                    coil.request.l lVar = kVar.f23108l;
                    Integer num = (Integer) lVar.e("coil#repeat_count");
                    int iIntValue = num != null ? num.intValue() : -1;
                    if (iIntValue < -1) {
                        throw new IllegalArgumentException(J4.i.b(iIntValue, "Invalid repeatCount: ").toString());
                    }
                    cVar.f6323r = iIntValue;
                    Ia.a aVar = (Ia.a) lVar.e("coil#animation_start_callback");
                    Ia.a aVar2 = (Ia.a) lVar.e("coil#animation_end_callback");
                    if (aVar != null || aVar2 != null) {
                        cVar.f6312f.add(new coil.util.e(aVar, aVar2));
                    }
                    p016b3.a aVar3 = (p016b3.a) lVar.e("coil#animated_transformation");
                    cVar.f6324s = aVar3;
                    if (aVar3 != null) {
                        Movie movie = cVar.f6308b;
                        if (movie.width() <= 0 || movie.height() <= 0) {
                            cVar.f6325t = null;
                            cVar.f6326u = PixelOpacity.f23146b;
                            cVar.f6327v = false;
                        } else {
                            Picture picture = new Picture();
                            cVar.f6326u = aVar3.transform(picture.beginRecording(movie.width(), movie.height()));
                            picture.endRecording();
                            cVar.f6325t = picture;
                            cVar.f6327v = true;
                        }
                    } else {
                        cVar.f6325t = null;
                        cVar.f6326u = PixelOpacity.f23146b;
                        cVar.f6327v = false;
                    }
                    cVar.invalidateSelf();
                    return new c(cVar, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p241t7.b.n(interfaceC2841hB, th);
                        throw th2;
                    }
                }
            case 1:
                return AppIdentityInjector.surveyApi_delegate$lambda$10((AppIdentityInjector) this.f22900c);
            default:
                return IntercomSurveyActivity.viewModel_delegate$lambda$0((IntercomSurveyActivity) this.f22900c);
        }
    }
}
