package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.collection.C0874b;
import androidx.core.graphics.drawable.IconCompat;
import com.braze.models.inappmessage.InAppMessageBase;
import com.voltasit.obdeleven.R;
import io.intercom.android.sdk.m5.push.ConversationActionHandlerKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: NotificationCompatBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public final class C implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification.Builder f16678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f16679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f16680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16681e;

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        public static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: compiled from: NotificationCompatBuilder.java */
    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0446  */
    public C(v vVar) {
        Notification notification;
        ArrayList<F> arrayList;
        Notification.BubbleMetadata bubbleMetadataA;
        Bundle[] bundleArr;
        ArrayList<F> arrayList2;
        ArrayList<String> arrayList3;
        r rVarA;
        int i10;
        C c10 = this;
        new ArrayList();
        c10.f16680d = new Bundle();
        c10.f16679c = vVar;
        Context context = vVar.f16796a;
        c10.f16677a = context;
        Notification.Builder builderA = e.a(context, vVar.f16818x);
        c10.f16678b = builderA;
        Notification notification2 = vVar.f16793C;
        int i11 = 0;
        builderA.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(vVar.f16800e).setContentText(vVar.f16801f).setContentInfo(null).setContentIntent(vVar.f16802g).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(vVar.f16804i).setProgress(0, 0, false);
        IconCompat iconCompat = vVar.f16803h;
        c.b(builderA, iconCompat == null ? null : IconCompat.a.f(iconCompat, context));
        builderA.setSubText(vVar.f16807m).setUsesChronometer(false).setPriority(vVar.j);
        B b10 = vVar.f16806l;
        if (b10 instanceof x) {
            x xVar = (x) b10;
            PendingIntent pendingIntent = xVar.f16824d;
            r rVarA2 = pendingIntent == null ? xVar.a(2131231131, R.string.call_notification_hang_up_action, xVar.f16828h, R.color.call_notification_decline_color, xVar.f16825e) : xVar.a(2131231131, R.string.call_notification_decline_action, xVar.f16828h, R.color.call_notification_decline_color, pendingIntent);
            PendingIntent pendingIntent2 = xVar.f16823c;
            if (pendingIntent2 == null) {
                rVarA = null;
            } else {
                boolean z10 = xVar.f16826f;
                rVarA = xVar.a(z10 ? 2131231129 : 2131231127, z10 ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, xVar.f16827g, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList4 = new ArrayList(3);
            arrayList4.add(rVarA2);
            ArrayList<r> arrayList5 = xVar.mBuilder.f16797b;
            if (arrayList5 != null) {
                i10 = 2;
                for (r rVar : arrayList5) {
                    if (rVar.f16770f) {
                        arrayList4.add(rVar);
                    } else if (!rVar.f16765a.getBoolean("key_action_priority") && i10 > 1) {
                        arrayList4.add(rVar);
                        i10--;
                    }
                    if (rVarA != null && i10 == 1) {
                        arrayList4.add(rVarA);
                        i10--;
                    }
                }
            } else {
                i10 = 2;
            }
            if (rVarA != null && i10 >= 1) {
                arrayList4.add(rVarA);
            }
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                c10.a((r) it.next());
            }
        } else {
            Iterator<r> it2 = vVar.f16797b.iterator();
            while (it2.hasNext()) {
                c10.a(it2.next());
            }
        }
        Bundle bundle = vVar.f16812r;
        if (bundle != null) {
            c10.f16680d.putAll(bundle);
        }
        int i12 = Build.VERSION.SDK_INT;
        c10.f16678b.setShowWhen(vVar.f16805k);
        a.i(c10.f16678b, vVar.f16810p);
        a.g(c10.f16678b, vVar.f16808n);
        a.j(c10.f16678b, null);
        a.h(c10.f16678b, vVar.f16809o);
        c10.f16681e = 0;
        b.b(c10.f16678b, vVar.f16811q);
        b.c(c10.f16678b, vVar.f16813s);
        b.f(c10.f16678b, vVar.f16814t);
        b.d(c10.f16678b, vVar.f16815u);
        b.e(c10.f16678b, notification2.sound, notification2.audioAttributes);
        ArrayList<String> arrayList6 = vVar.f16795E;
        ArrayList<F> arrayList7 = vVar.f16798c;
        if (i12 < 28) {
            if (arrayList7 == null) {
                arrayList3 = null;
            } else {
                arrayList3 = new ArrayList<>(arrayList7.size());
                for (F f10 : arrayList7) {
                    String str = f10.f16684c;
                    if (str == null) {
                        CharSequence charSequence = f10.f16682a;
                        str = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList3.add(str);
                }
            }
            if (arrayList3 != null) {
                if (arrayList6 == null) {
                    arrayList6 = arrayList3;
                } else {
                    C0874b c0874b = new C0874b(arrayList6.size() + arrayList3.size());
                    c0874b.addAll(arrayList3);
                    c0874b.addAll(arrayList6);
                    arrayList6 = new ArrayList<>(c0874b);
                }
            }
        }
        if (arrayList6 != null && !arrayList6.isEmpty()) {
            Iterator<String> it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                b.a(c10.f16678b, it3.next());
            }
        }
        ArrayList<r> arrayList8 = vVar.f16799d;
        if (arrayList8.size() > 0) {
            if (vVar.f16812r == null) {
                vVar.f16812r = new Bundle();
            }
            Bundle bundle2 = vVar.f16812r.getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            int i13 = 0;
            while (i13 < arrayList8.size()) {
                String string = Integer.toString(i13);
                r rVar2 = arrayList8.get(i13);
                Bundle bundle5 = new Bundle();
                IconCompat iconCompatA = rVar2.a();
                bundle5.putInt(InAppMessageBase.ICON, iconCompatA != null ? iconCompatA.f() : i11);
                bundle5.putCharSequence("title", rVar2.f16772h);
                bundle5.putParcelable("actionIntent", rVar2.f16773i);
                Bundle bundle6 = rVar2.f16765a;
                Bundle bundle7 = bundle6 != null ? new Bundle(bundle6) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", rVar2.f16768d);
                bundle5.putBundle(InAppMessageBase.EXTRAS, bundle7);
                H[] hArr = rVar2.f16767c;
                if (hArr == null) {
                    arrayList2 = arrayList7;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[hArr.length];
                    int i14 = 0;
                    while (i14 < hArr.length) {
                        H h8 = hArr[i14];
                        H[] hArr2 = hArr;
                        Bundle bundle8 = new Bundle();
                        h8.getClass();
                        ArrayList<F> arrayList9 = arrayList7;
                        bundle8.putString("resultKey", ConversationActionHandlerKt.KEY_TEXT_REPLY);
                        bundle8.putCharSequence("label", h8.f16689a);
                        bundle8.putCharSequenceArray("choices", null);
                        bundle8.putBoolean("allowFreeFormInput", true);
                        bundle8.putBundle(InAppMessageBase.EXTRAS, h8.f16690b);
                        HashSet hashSet = h8.f16691c;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList10 = new ArrayList<>(hashSet.size());
                            Iterator it4 = hashSet.iterator();
                            while (it4.hasNext()) {
                                arrayList10.add((String) it4.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList10);
                        }
                        bundleArr[i14] = bundle8;
                        i14++;
                        hArr = hArr2;
                        arrayList7 = arrayList9;
                    }
                    arrayList2 = arrayList7;
                }
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", rVar2.f16769e);
                bundle5.putInt("semanticAction", 0);
                bundle4.putBundle(string, bundle5);
                i13++;
                i11 = 0;
                arrayList8 = arrayList8;
                notification2 = notification2;
                arrayList7 = arrayList2;
            }
            notification = notification2;
            arrayList = arrayList7;
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            if (vVar.f16812r == null) {
                vVar.f16812r = new Bundle();
            }
            vVar.f16812r.putBundle("android.car.EXTENSIONS", bundle2);
            c10 = this;
            c10.f16680d.putBundle("android.car.EXTENSIONS", bundle3);
        } else {
            notification = notification2;
            arrayList = arrayList7;
        }
        int i15 = Build.VERSION.SDK_INT;
        c10.f16678b.setExtras(vVar.f16812r);
        d.e(c10.f16678b, null);
        RemoteViews remoteViews = vVar.f16816v;
        if (remoteViews != null) {
            d.c(c10.f16678b, remoteViews);
        }
        RemoteViews remoteViews2 = vVar.f16817w;
        if (remoteViews2 != null) {
            d.b(c10.f16678b, remoteViews2);
        }
        e.b(c10.f16678b, 0);
        e.e(c10.f16678b, null);
        e.f(c10.f16678b, vVar.f16819y);
        e.g(c10.f16678b, 0L);
        e.d(c10.f16678b, 0);
        if (!TextUtils.isEmpty(vVar.f16818x)) {
            c10.f16678b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i15 >= 28) {
            for (F f11 : arrayList) {
                Notification.Builder builder = c10.f16678b;
                f11.getClass();
                f.a(builder, F.b.b(f11));
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 29) {
            g.a(c10.f16678b, vVar.f16791A);
            Notification.Builder builder2 = c10.f16678b;
            u uVar = vVar.f16792B;
            if (uVar == null) {
                bubbleMetadataA = null;
            } else if (i16 >= 30) {
                bubbleMetadataA = u.b.a(uVar);
            } else if (i16 == 29) {
                bubbleMetadataA = u.a.a(uVar);
            } else {
                bubbleMetadataA = null;
            }
            g.b(builder2, bubbleMetadataA);
            p186p0.b bVar = vVar.f16820z;
            if (bVar != null) {
                g.d(c10.f16678b, bVar.f45795b);
            }
        }
        if (vVar.f16794D) {
            if (c10.f16679c.f16809o) {
                c10.f16681e = 2;
            } else {
                c10.f16681e = 1;
            }
            c10.f16678b.setVibrate(null);
            c10.f16678b.setSound(null);
            Notification notification3 = notification;
            int i17 = notification3.defaults & (-4);
            notification3.defaults = i17;
            c10.f16678b.setDefaults(i17);
            if (TextUtils.isEmpty(c10.f16679c.f16808n)) {
                a.g(c10.f16678b, "silent");
            }
            e.d(c10.f16678b, c10.f16681e);
        }
    }

    public final void a(r rVar) {
        IconCompat iconCompatA = rVar.a();
        Notification.Action.Builder builderA = c.a(iconCompatA != null ? IconCompat.a.f(iconCompatA, null) : null, rVar.f16772h, rVar.f16773i);
        H[] hArr = rVar.f16767c;
        if (hArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[hArr.length];
            for (int i10 = 0; i10 < hArr.length; i10++) {
                remoteInputArr[i10] = H.a(hArr[i10]);
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = rVar.f16765a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z10 = rVar.f16768d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z10);
        int i11 = Build.VERSION.SDK_INT;
        d.a(builderA, z10);
        bundle2.putInt("android.support.action.semanticAction", 0);
        if (i11 >= 28) {
            f.b(builderA, 0);
        }
        if (i11 >= 29) {
            g.c(builderA, rVar.f16770f);
        }
        if (i11 >= 31) {
            h.a(builderA, false);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", rVar.f16769e);
        a.b(builderA, bundle2);
        a.a(this.f16678b, a.d(builderA));
    }
}
