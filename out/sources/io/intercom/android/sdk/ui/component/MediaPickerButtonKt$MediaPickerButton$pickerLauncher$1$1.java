package io.intercom.android.sdk.ui.component;

import android.net.Uri;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.I;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: MediaPickerButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.intercom.android.sdk.ui.component.MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1", f = "MediaPickerButton.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m = "invokeSuspend")
public final class MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ List<Uri> $it;
    final /* synthetic */ MediaPickerButtonCTAStyle $mediaPickerButtonCTAStyle;
    final /* synthetic */ androidx.activity.compose.e<IntercomPreviewArgs, List<Uri>> $previewLauncher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1(androidx.activity.compose.e<IntercomPreviewArgs, List<Uri>> eVar, List<? extends Uri> list, MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, kotlin.coroutines.c<? super MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1> cVar) {
        super(2, cVar);
        this.$previewLauncher = eVar;
        this.$it = list;
        this.$mediaPickerButtonCTAStyle = mediaPickerButtonCTAStyle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1(this.$previewLauncher, this.$it, this.$mediaPickerButtonCTAStyle, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.label = 1;
            if (I.b(50L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        androidx.activity.compose.e<IntercomPreviewArgs, List<Uri>> eVar = this.$previewLauncher;
        List<Uri> list = this.$it;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new IntercomPreviewFile.LocalFile((Uri) it.next()));
        }
        MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle = this.$mediaPickerButtonCTAStyle;
        eVar.a(new IntercomPreviewArgs(arrayList, DeleteType.Remove.INSTANCE, mediaPickerButtonCTAStyle instanceof MediaPickerButtonCTAStyle.TextButton ? ((MediaPickerButtonCTAStyle.TextButton) mediaPickerButtonCTAStyle).getCtaText() : null, this.$mediaPickerButtonCTAStyle instanceof MediaPickerButtonCTAStyle.TopBarButton, null, 16, null));
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
