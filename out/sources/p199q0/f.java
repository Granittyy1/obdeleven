package p199q0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ShortcutManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile d<?> f45974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile ArrayList f45975b;

    public static List<b> a(Context context) {
        Bundle bundle;
        String string;
        if (f45975b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((b) Class.forName(string, false, f.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f45975b == null) {
                f45975b = arrayList;
            }
        }
        return f45975b;
    }

    public static d<?> b(Context context) {
        if (f45974a == null) {
            try {
                f45974a = (d) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, f.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f45974a == null) {
                f45974a = new d.a();
            }
        }
        return f45974a;
    }

    public static void c(Context context, String str) {
        context.getClass();
        str.getClass();
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        for (b bVar : (ArrayList) a(context)) {
            Collections.singletonList(str);
            bVar.getClass();
        }
    }

    public static void d(Context context, List list) {
        context.getClass();
        list.getClass();
        if (Build.VERSION.SDK_INT <= 32) {
            ArrayList arrayList = new ArrayList(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).getClass();
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((c) it2.next()).b());
        }
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList2)) {
            b(context).getClass();
            b(context).getClass();
            Iterator it3 = ((ArrayList) a(context)).iterator();
            while (it3.hasNext()) {
                ((b) it3.next()).getClass();
            }
        }
    }
}
