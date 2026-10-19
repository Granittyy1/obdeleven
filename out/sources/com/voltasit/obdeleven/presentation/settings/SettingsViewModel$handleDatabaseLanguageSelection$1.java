package com.voltasit.obdeleven.presentation.settings;

import Ia.p;
import K8.o;
import K8.t;
import android.content.Context;
import androidx.lifecycle.C;
import com.voltasit.obdeleven.core.DatabaseLanguage;
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
@Aa.c(c = "com.voltasit.obdeleven.presentation.settings.SettingsViewModel$handleDatabaseLanguageSelection$1", f = "SettingsViewModel.kt", l = {452}, m = "invokeSuspend")
final class SettingsViewModel$handleDatabaseLanguageSelection$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ DatabaseLanguage $currentLanguage;
    final /* synthetic */ int $pos;
    Object L$0;
    int label;
    final /* synthetic */ SettingsViewModel this$0;

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return Cb.a.e(((DatabaseLanguage) t8).d(), ((DatabaseLanguage) t10).d());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$handleDatabaseLanguageSelection$1(int i10, DatabaseLanguage databaseLanguage, SettingsViewModel settingsViewModel, kotlin.coroutines.c<? super SettingsViewModel$handleDatabaseLanguageSelection$1> cVar) {
        super(2, cVar);
        this.$pos = i10;
        this.$currentLanguage = databaseLanguage;
        this.this$0 = settingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SettingsViewModel$handleDatabaseLanguageSelection$1(this.$pos, this.$currentLanguage, this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SettingsViewModel$handleDatabaseLanguageSelection$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DatabaseLanguage databaseLanguage;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            DatabaseLanguage databaseLanguage2 = (DatabaseLanguage) k.b0(DatabaseLanguage.values(), new a()).get(this.$pos);
            if (databaseLanguage2 != this.$currentLanguage) {
                this.this$0.f32113b.j(PreloaderState.c.f32642a);
                o oVar = this.this$0.f33160o;
                this.L$0 = databaseLanguage2;
                this.label = 1;
                if (oVar.b0(databaseLanguage2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                databaseLanguage = databaseLanguage2;
            }
            return r.f47939a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        databaseLanguage = (DatabaseLanguage) this.L$0;
        kotlin.b.b(obj);
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        C<Y8.b> c10 = this.this$0.f33146b0;
        String strD = databaseLanguage.d();
        i.d(strD, "getVisibleLanguage(...)");
        c10.j(Y8.c.b(strD, true));
        SettingsViewModel settingsViewModel = this.this$0;
        t tVar = settingsViewModel.f33166r;
        Context context = settingsViewModel.f33168s.getContext();
        String strB = databaseLanguage.b();
        i.d(strB, "getCode(...)");
        tVar.a(context, strB);
        return r.f47939a;
    }
}
