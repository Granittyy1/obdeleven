package com.voltasit.obdeleven.domain.usecases;

import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt;
import com.voltasit.parse.model.HistoryDB;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SaveBasicSettingHistoryUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.SaveBasicSettingHistoryUC$invoke$2", f = "SaveBasicSettingHistoryUC.kt", l = {R.styleable.AppCompatTheme_listChoiceBackgroundIndicator}, m = "invokeSuspend")
public final class SaveBasicSettingHistoryUC$invoke$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ HistoryDB $history;
    int label;
    final /* synthetic */ SaveBasicSettingHistoryUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveBasicSettingHistoryUC$invoke$2(HistoryDB historyDB, SaveBasicSettingHistoryUC saveBasicSettingHistoryUC, kotlin.coroutines.c<? super SaveBasicSettingHistoryUC$invoke$2> cVar) {
        super(2, cVar);
        this.$history = historyDB;
        this.this$0 = saveBasicSettingHistoryUC;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SaveBasicSettingHistoryUC$invoke$2(this.$history, this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SaveBasicSettingHistoryUC$invoke$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.b.b(obj);
                Task<Void> taskSaveInBackground = this.$history.saveInBackground();
                kotlin.jvm.internal.i.d(taskSaveInBackground, "saveInBackground(...)");
                this.label = 1;
                if (ParseTaskExtensionsKt.b(taskSaveInBackground, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            this.this$0.f30621c.e("SaveBasicSettingHistoryUC", "History saved");
        } catch (Throwable th) {
            this.this$0.f30621c.d(th, false);
        }
        return p293xa.r.f47939a;
    }
}
