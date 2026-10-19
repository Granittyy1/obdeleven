package U6;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import java.util.List;
import p033c7.C1505s;
import p033c7.C1506t;

/* JADX INFO: compiled from: FirebaseInAppMessagingDisplay.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p083g7.a f6536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f6537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f6538d;

    public d(b bVar, p083g7.a aVar, Activity activity) {
        this.f6538d = bVar;
        this.f6536b = aVar;
        this.f6537c = activity;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dc  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent;
        ResolveInfo resolveInfoResolveActivity;
        String scheme;
        b bVar = this.f6538d;
        FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks = bVar.f6528l;
        p083g7.a aVar = this.f6536b;
        String str = aVar.f35604a;
        if (firebaseInAppMessagingDisplayCallbacks != null) {
            Log.isLoggable("FIAM.Display", 4);
            C1506t c1506t = (C1506t) bVar.f6528l;
            if (!c1506t.f22504g.a()) {
                c1506t.c("message click to metrics logger");
                new p191p5.h();
            } else if (str == null) {
                c1506t.f(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.f28155d);
            } else {
                Q3.d.B();
                io.reactivex.internal.operators.completable.b bVar2 = new io.reactivex.internal.operators.completable.b(new C1505s(c1506t, aVar));
                if (!c1506t.j) {
                    c1506t.b();
                }
                C1506t.e(bVar2 instanceof ra.c ? ((ra.c) bVar2).b() : new io.reactivex.internal.operators.maybe.f(bVar2), c1506t.f22500c.f22451a);
            }
        }
        Uri uri = Uri.parse(str);
        Activity activity = this.f6537c;
        if (uri == null || (scheme = uri.getScheme()) == null || (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https"))) {
            intent = new Intent("android.intent.action.VIEW", uri);
            resolveInfoResolveActivity = activity.getPackageManager().resolveActivity(intent, 0);
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            if (resolveInfoResolveActivity != null) {
                activity.startActivity(intent);
            } else {
                H3.c.k("Device cannot resolve intent for: android.intent.action.VIEW");
            }
        } else {
            Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage("com.android.chrome");
            List<ResolveInfo> listQueryIntentServices = activity.getPackageManager().queryIntentServices(intent2, 0);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                intent = new Intent("android.intent.action.VIEW", uri);
                resolveInfoResolveActivity = activity.getPackageManager().resolveActivity(intent, 0);
                intent.addFlags(1073741824);
                intent.addFlags(268435456);
                if (resolveInfoResolveActivity != null) {
                    activity.startActivity(intent);
                } else {
                    H3.c.k("Device cannot resolve intent for: android.intent.action.VIEW");
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                intent3.putExtras(bundle);
                intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                intent3.addFlags(1073741824);
                intent3.addFlags(268435456);
                intent3.setData(uri);
                activity.startActivity(intent3, null);
            }
        }
        bVar.a(activity);
        bVar.f6527k = null;
        bVar.f6528l = null;
    }
}
