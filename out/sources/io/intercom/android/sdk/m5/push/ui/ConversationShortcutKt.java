package io.intercom.android.sdk.m5.push.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.internal.measurement.M1;
import com.intercom.twig.Twig;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import p186p0.b;
import p199q0.c;
import p199q0.f;
import p293xa.r;

/* JADX INFO: compiled from: ConversationShortcut.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationShortcutKt {
    public static final Pair<List<c>, c> createTemporaryShortcut(Context context, String conversationId, String conversationTitle, Bitmap bitmap) {
        ArrayList arrayListA;
        String str;
        Object next;
        Object next2;
        IconCompat iconCompat;
        int i10;
        InputStream inputStreamI;
        Bitmap bitmapDecodeStream;
        IconCompat iconCompatC;
        i.e(context, "context");
        i.e(conversationId, "conversationId");
        i.e(conversationTitle, "conversationTitle");
        if (Build.VERSION.SDK_INT >= 30) {
            arrayListA = c.a(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(8));
        } else {
            arrayListA = c.a(context, new ArrayList());
        }
        List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new c.b(context, it.next()).a());
        }
        Iterator it2 = arrayListA.iterator();
        while (true) {
            str = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            c cVar = (c) next;
            if (i.a(cVar.f45961b, conversationId) && i.a(cVar.f45964e, conversationTitle)) {
                break;
            }
        }
        c cVar2 = (c) next;
        if (cVar2 != null) {
            return new Pair<>(null, cVar2);
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            c cVar3 = (c) next2;
            if (i.a(cVar3.f45961b, conversationId) && i.a(cVar3.f45964e, conversationTitle)) {
                break;
            }
        }
        c cVar4 = (c) next2;
        if (cVar4 != null) {
            return new Pair<>(null, cVar4);
        }
        c cVar5 = new c();
        cVar5.f45960a = context;
        cVar5.f45961b = conversationId;
        cVar5.f45970l = true;
        cVar5.f45964e = conversationTitle;
        cVar5.f45962c = new Intent[]{new Intent("android.intent.action.VIEW")};
        if (bitmap != null) {
            IconCompat iconCompat2 = new IconCompat(5);
            iconCompat2.f16835b = bitmap;
            cVar5.f45967h = iconCompat2;
        }
        if (TextUtils.isEmpty(cVar5.f45964e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = cVar5.f45962c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        if (cVar5.f45969k == null) {
            cVar5.f45969k = new b(cVar5.f45961b);
        }
        cVar5.f45970l = true;
        int i11 = Build.VERSION.SDK_INT;
        int maxShortcutCountPerActivity = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        if (maxShortcutCountPerActivity != 0) {
            if (i11 <= 29 && (iconCompat = cVar5.f45967h) != null && (((i10 = iconCompat.f16834a) == 6 || i10 == 4) && (inputStreamI = iconCompat.i(context)) != null && (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamI)) != null)) {
                if (i10 == 6) {
                    iconCompatC = new IconCompat(5);
                    iconCompatC.f16835b = bitmapDecodeStream;
                } else {
                    iconCompatC = IconCompat.c(bitmapDecodeStream);
                }
                cVar5.f45967h = iconCompatC;
            }
            int i12 = -1;
            if (i11 >= 30) {
                ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(cVar5.b());
            } else {
                ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
                if (!shortcutManager.isRateLimitingActive()) {
                    List<ShortcutInfo> dynamicShortcuts2 = shortcutManager.getDynamicShortcuts();
                    if (dynamicShortcuts2.size() >= maxShortcutCountPerActivity) {
                        int rank = -1;
                        String id = null;
                        for (ShortcutInfo shortcutInfo : dynamicShortcuts2) {
                            if (shortcutInfo.getRank() > rank) {
                                id = shortcutInfo.getId();
                                rank = shortcutInfo.getRank();
                            }
                        }
                        shortcutManager.removeDynamicShortcuts(Arrays.asList(id));
                    }
                    shortcutManager.addDynamicShortcuts(Arrays.asList(cVar5.b()));
                }
            }
            try {
                f.b(context).getClass();
                ArrayList<c> arrayList2 = new ArrayList();
                if (arrayList2.size() >= maxShortcutCountPerActivity) {
                    for (c cVar6 : arrayList2) {
                        int i13 = cVar6.f45971m;
                        if (i13 > i12) {
                            str = cVar6.f45961b;
                            i12 = i13;
                        }
                    }
                    Arrays.asList(str);
                }
                Arrays.asList(cVar5);
            } catch (Exception unused) {
            } finally {
                for (p199q0.b bVar : (ArrayList) f.a(context)) {
                    Collections.singletonList(cVar5);
                    bVar.getClass();
                }
                f.c(context, cVar5.f45961b);
            }
        }
        return new Pair<>(arrayList, cVar5);
    }

    public static final void resetShortcuts(Context context, List<? extends c> list, c cVar, Twig twig) {
        i.e(context, "context");
        i.e(twig, "twig");
        if (cVar != null) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(M1.k(cVar.f45961b));
            f.b(context).getClass();
            Iterator it = ((ArrayList) f.a(context)).iterator();
            while (it.hasNext()) {
                ((p199q0.b) it.next()).getClass();
            }
        }
        if (list != null) {
            try {
                f.d(context, list);
            } catch (IllegalArgumentException e10) {
                twig.i(e10, "Could not set dynamic shortcuts, max number of dynamic shortcuts exceeded.", new Object[0]);
                r rVar = r.f47939a;
            }
        }
    }
}
