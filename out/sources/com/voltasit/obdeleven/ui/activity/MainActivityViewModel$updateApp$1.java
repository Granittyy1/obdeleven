package com.voltasit.obdeleven.ui.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.voltasit.obdeleven.utils.NavigationManager;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: MainActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$updateApp$1", f = "MainActivityViewModel.kt", l = {}, m = "invokeSuspend")
final class MainActivityViewModel$updateApp$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$updateApp$1(MainActivityViewModel mainActivityViewModel, kotlin.coroutines.c<? super MainActivityViewModel$updateApp$1> cVar) {
        super(2, cVar);
        this.this$0 = mainActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainActivityViewModel$updateApp$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MainActivityViewModel$updateApp$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        NavigationManager navigationManager = this.this$0.f33629b0;
        if (navigationManager == null) {
            kotlin.jvm.internal.i.m("navigationManager");
            throw null;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.voltasit.obdeleven"));
        MainActivity mainActivity = navigationManager.f34230a;
        List<ResolveInfo> listQueryIntentActivities = mainActivity.getPackageManager().queryIntentActivities(intent, 0);
        kotlin.jvm.internal.i.d(listQueryIntentActivities, "queryIntentActivities(...)");
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            if (kotlin.jvm.internal.i.a(resolveInfo.activityInfo.applicationInfo.packageName, "com.android.vending")) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.addFlags(268435456);
                intent.addFlags(2097152);
                intent.addFlags(67108864);
                intent.setComponent(componentName);
                mainActivity.startActivity(intent);
                this.this$0.f33657w.L();
                return p293xa.r.f47939a;
            }
        }
        this.this$0.f33637j0.j(Boolean.TRUE);
        NavigationManager navigationManager2 = this.this$0.f33629b0;
        if (navigationManager2 != null) {
            navigationManager2.g("https://obdeleven.com");
            return p293xa.r.f47939a;
        }
        kotlin.jvm.internal.i.m("navigationManager");
        throw null;
    }
}
