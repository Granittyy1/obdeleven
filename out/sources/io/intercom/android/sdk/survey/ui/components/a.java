package io.intercom.android.sdk.survey.ui.components;

import Ia.l;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.X;
import androidx.compose.ui.semantics.w;
import androidx.media3.exoplayer.K;
import io.intercom.android.sdk.ui.preview.ui.PreviewUriKt;
import io.intercom.android.sdk.views.compose.ListAttributeCollectorKt;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39591c;

    public /* synthetic */ a(int i10, Object obj) {
        this.f39590b = i10;
        this.f39591c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39590b) {
            case 0:
                return CircularAvatarComponentKt.CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0((String) this.f39591c, (w) obj);
            case 1:
                return PreviewUriKt.VideoPlayer$lambda$6((K) this.f39591c, (Context) obj);
            case 2:
                return ListAttributeCollectorKt.ListAttributeCollector$lambda$8$lambda$7((X) this.f39591c, ((Boolean) obj).booleanValue());
            default:
                String key = (String) obj;
                kotlin.jvm.internal.i.e(key, "key");
                T t8 = ((Ref$ObjectRef) this.f39591c).element;
                boolean z10 = true;
                if (t8 != 0 && ((Bundle) t8).containsKey(key)) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
