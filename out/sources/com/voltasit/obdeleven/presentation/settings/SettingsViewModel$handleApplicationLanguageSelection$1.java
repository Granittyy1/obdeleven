package com.voltasit.obdeleven.presentation.settings;

import Ia.p;
import K8.o;
import androidx.lifecycle.C;
import com.voltasit.obdeleven.core.ApplicationLanguage;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import java.util.Comparator;
import kotlin.collections.k;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: SettingsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.settings.SettingsViewModel$handleApplicationLanguageSelection$1", f = "SettingsViewModel.kt", l = {468}, m = "invokeSuspend")
final class SettingsViewModel$handleApplicationLanguageSelection$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ ApplicationLanguage $currentLanguage;
    final /* synthetic */ int $pos;
    Object L$0;
    int label;
    final /* synthetic */ SettingsViewModel this$0;

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return Cb.a.e(((ApplicationLanguage) t8).g(), ((ApplicationLanguage) t10).g());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$handleApplicationLanguageSelection$1(int i10, ApplicationLanguage applicationLanguage, SettingsViewModel settingsViewModel, kotlin.coroutines.c<? super SettingsViewModel$handleApplicationLanguageSelection$1> cVar) {
        super(2, cVar);
        this.$pos = i10;
        this.$currentLanguage = applicationLanguage;
        this.this$0 = settingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SettingsViewModel$handleApplicationLanguageSelection$1(this.$pos, this.$currentLanguage, this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SettingsViewModel$handleApplicationLanguageSelection$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ApplicationLanguage applicationLanguage;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            ApplicationLanguage applicationLanguage2 = (ApplicationLanguage) k.b0(ApplicationLanguage.values(), new a()).get(this.$pos);
            if (applicationLanguage2 != this.$currentLanguage) {
                this.this$0.f32113b.j(PreloaderState.c.f32642a);
                o oVar = this.this$0.f33160o;
                this.L$0 = applicationLanguage2;
                this.label = 1;
                if (oVar.k(applicationLanguage2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                applicationLanguage = applicationLanguage2;
            }
            return r.f47939a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        applicationLanguage = (ApplicationLanguage) this.L$0;
        kotlin.b.b(obj);
        C<Y8.b> c10 = this.this$0.f33142Z;
        String strG = applicationLanguage.g();
        i.d(strG, "getVisibleLanguage(...)");
        c10.j(Y8.c.b(strG, true));
        this.this$0.f33095B0.j(r.f47939a);
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
