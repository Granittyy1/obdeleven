package coil.decode;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.X;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;
import java.io.File;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22909c;

    public /* synthetic */ y(int i10, Object obj) {
        this.f22908b = i10;
        this.f22909c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        Object obj = this.f22909c;
        switch (this.f22908b) {
            case 0:
                Bitmap.Config[] configArr = coil.util.k.f23160a;
                File cacheDir = ((Context) obj).getCacheDir();
                if (cacheDir == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir.mkdirs();
                return cacheDir;
            default:
                return DatePickerQuestionKt.DatePicker$lambda$11$lambda$10((X) obj);
        }
    }
}
