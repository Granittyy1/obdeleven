package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static String sEnabledNotificationListeners;
    private static j sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static final Object sLock = new Object();

    public static class a {
        public static List<StatusBarNotification> a(NotificationManager notificationManager) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    public static class b {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    public static class c {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        public static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        public static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        public static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        public static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        public static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        public static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    public static class d {
        public static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    public static class e {
        public static NotificationChannel a(NotificationManager notificationManager, String str, String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }

        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }
    }

    public static class f {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }
    }

    public static class g {
    }

    public static class h implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f16697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Notification f16698d;

        public h(String str, int i10, String str2, Notification notification) {
            this.f16695a = str;
            this.f16696b = i10;
            this.f16697c = str2;
            this.f16698d = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.k
        public final void a(p025c.a aVar) throws RemoteException {
            aVar.V(this.f16695a, this.f16696b, this.f16697c, this.f16698d);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
            sb2.append(this.f16695a);
            sb2.append(", id:");
            sb2.append(this.f16696b);
            sb2.append(", tag:");
            return Q8.d.a(sb2, this.f16697c, "]");
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f16699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IBinder f16700b;

        public i(ComponentName componentName, IBinder iBinder) {
            this.f16699a = componentName;
            this.f16700b = iBinder;
        }
    }

    public static class j implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f16701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f16702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HashMap f16703d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Set<String> f16704e = new HashSet();

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ComponentName f16705a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public p025c.a f16707c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f16706b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final ArrayDeque<k> f16708d = new ArrayDeque<>();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f16709e = 0;

            public a(ComponentName componentName) {
                this.f16705a = componentName;
            }
        }

        public j(Context context) {
            this.f16701b = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.f16702c = new Handler(handlerThread.getLooper(), this);
        }

        public final void a(a aVar) {
            boolean z10;
            ArrayDeque<k> arrayDeque;
            boolean zIsLoggable = Log.isLoggable(NotificationManagerCompat.TAG, 3);
            ComponentName componentName = aVar.f16705a;
            if (zIsLoggable) {
                Objects.toString(componentName);
                aVar.f16708d.size();
            }
            if (aVar.f16708d.isEmpty()) {
                return;
            }
            if (aVar.f16706b) {
                z10 = true;
            } else {
                Intent component = new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(componentName);
                Context context = this.f16701b;
                boolean zBindService = context.bindService(component, this, 33);
                aVar.f16706b = zBindService;
                if (zBindService) {
                    aVar.f16709e = 0;
                } else {
                    Objects.toString(componentName);
                    context.unbindService(this);
                }
                z10 = aVar.f16706b;
            }
            if (!z10 || aVar.f16707c == null) {
                b(aVar);
                return;
            }
            while (true) {
                arrayDeque = aVar.f16708d;
                k kVarPeek = arrayDeque.peek();
                if (kVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        kVarPeek.toString();
                    }
                    kVarPeek.a(aVar.f16707c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Objects.toString(componentName);
                    }
                } catch (RemoteException unused2) {
                    Objects.toString(componentName);
                }
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            b(aVar);
        }

        public final void b(a aVar) {
            Handler handler = this.f16702c;
            ComponentName componentName = aVar.f16705a;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i10 = aVar.f16709e;
            int i11 = i10 + 1;
            aVar.f16709e = i11;
            if (i11 <= 6) {
                Log.isLoggable(NotificationManagerCompat.TAG, 3);
                handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << i10) * 1000);
            } else {
                ArrayDeque<k> arrayDeque = aVar.f16708d;
                arrayDeque.size();
                Objects.toString(componentName);
                arrayDeque.clear();
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            HashMap map = this.f16703d;
            p025c.a aVar = null;
            Context context = this.f16701b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return false;
                        }
                        a aVar2 = (a) map.get((ComponentName) message.obj);
                        if (aVar2 != null) {
                            a(aVar2);
                        }
                        return true;
                    }
                    a aVar3 = (a) map.get((ComponentName) message.obj);
                    if (aVar3 != null) {
                        if (aVar3.f16706b) {
                            context.unbindService(this);
                            aVar3.f16706b = false;
                        }
                        aVar3.f16707c = null;
                    }
                    return true;
                }
                i iVar = (i) message.obj;
                a aVar4 = (a) map.get(iVar.f16699a);
                if (aVar4 != null) {
                    int i11 = p025c.a.AbstractBinderC0233a.f22267c;
                    IBinder iBinder = iVar.f16700b;
                    if (iBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(p025c.a.f22266a);
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p025c.a)) {
                            p025c.a.AbstractBinderC0233a.C0234a c0234a = new p025c.a.AbstractBinderC0233a.C0234a();
                            c0234a.f22268c = iBinder;
                            aVar = c0234a;
                        } else {
                            aVar = (p025c.a) iInterfaceQueryLocalInterface;
                        }
                    }
                    aVar4.f16707c = aVar;
                    aVar4.f16709e = 0;
                    a(aVar4);
                }
                return true;
            }
            k kVar = (k) message.obj;
            Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(context);
            if (!enabledListenerPackages.equals(this.f16704e)) {
                this.f16704e = enabledListenerPackages;
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
                HashSet<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!map.containsKey(componentName2)) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            Objects.toString(componentName2);
                        }
                        map.put(componentName2, new a(componentName2));
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            Objects.toString(entry.getKey());
                        }
                        a aVar5 = (a) entry.getValue();
                        if (aVar5.f16706b) {
                            context.unbindService(this);
                            aVar5.f16706b = false;
                        }
                        aVar5.f16707c = null;
                        it.remove();
                    }
                }
            }
            for (a aVar6 : map.values()) {
                aVar6.f16708d.add(kVar);
                a(aVar6);
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Objects.toString(componentName);
            }
            this.f16702c.obtainMessage(1, new i(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Objects.toString(componentName);
            }
            this.f16702c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface k {
        void a(p025c.a aVar) throws RemoteException;
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService("notification");
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                try {
                    if (!string.equals(sEnabledNotificationListeners)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        sEnabledNotificationListenerPackages = hashSet;
                        sEnabledNotificationListeners = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(k kVar) {
        synchronized (sLock) {
            try {
                if (sSideChannelManager == null) {
                    sSideChannelManager = new j(this.mContext.getApplicationContext());
                }
                sSideChannelManager.f16702c.obtainMessage(0, kVar).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle bundle = notification.extras;
        return bundle != null && bundle.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    public boolean areNotificationsEnabled() {
        return b.a(this.mNotificationManager);
    }

    public boolean canUseFullScreenIntent() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29) {
            return true;
        }
        if (i10 < 34) {
            return this.mContext.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0;
        }
        return f.a(this.mNotificationManager);
    }

    public void cancel(int i10) {
        cancel(null, i10);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        c.a(this.mNotificationManager, notificationChannel);
    }

    public void createNotificationChannelGroup(q qVar) {
        int i10 = Build.VERSION.SDK_INT;
        NotificationChannelGroup notificationChannelGroupA = q.a.a(qVar.f16761a, qVar.f16762b);
        if (i10 >= 28) {
            q.b.c(notificationChannelGroupA, qVar.f16763c);
        }
        createNotificationChannelGroup(notificationChannelGroupA);
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        c.c(this.mNotificationManager, list);
    }

    public void createNotificationChannelGroupsCompat(List<q> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (q qVar : list) {
            int i10 = Build.VERSION.SDK_INT;
            NotificationChannelGroup notificationChannelGroupA = q.a.a(qVar.f16761a, qVar.f16762b);
            if (i10 >= 28) {
                q.b.c(notificationChannelGroupA, qVar.f16763c);
            }
            arrayList.add(notificationChannelGroupA);
        }
        c.c(this.mNotificationManager, arrayList);
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        c.d(this.mNotificationManager, list);
    }

    public void createNotificationChannelsCompat(List<p> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<p> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        c.d(this.mNotificationManager, arrayList);
    }

    public void deleteNotificationChannel(String str) {
        c.e(this.mNotificationManager, str);
    }

    public void deleteNotificationChannelGroup(String str) {
        c.f(this.mNotificationManager, str);
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        for (NotificationChannel notificationChannel : c.k(this.mNotificationManager)) {
            if (!collection.contains(c.g(notificationChannel)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(e.b(notificationChannel)))) {
                c.e(this.mNotificationManager, c.g(notificationChannel));
            }
        }
    }

    public List<StatusBarNotification> getActiveNotifications() {
        return a.a(this.mNotificationManager);
    }

    public int getCurrentInterruptionFilter() {
        return a.b(this.mNotificationManager);
    }

    public int getImportance() {
        return b.b(this.mNotificationManager);
    }

    public NotificationChannel getNotificationChannel(String str) {
        return c.i(this.mNotificationManager, str);
    }

    public p getNotificationChannelCompat(String str) {
        NotificationChannel notificationChannel = getNotificationChannel(str);
        if (notificationChannel != null) {
            return new p(notificationChannel);
        }
        return null;
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.a(this.mNotificationManager, str);
        }
        for (NotificationChannelGroup notificationChannelGroup : getNotificationChannelGroups()) {
            if (c.h(notificationChannelGroup).equals(str)) {
                return notificationChannelGroup;
            }
        }
        return null;
    }

    public q getNotificationChannelGroupCompat(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            NotificationChannelGroup notificationChannelGroup = getNotificationChannelGroup(str);
            if (notificationChannelGroup != null) {
                return new q(notificationChannelGroup);
            }
            return null;
        }
        NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
        if (notificationChannelGroup2 != null) {
            return new q(notificationChannelGroup2, getNotificationChannels());
        }
        return null;
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        return c.j(this.mNotificationManager);
    }

    public List<q> getNotificationChannelGroupsCompat() {
        int i10 = Build.VERSION.SDK_INT;
        List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
        if (notificationChannelGroups.isEmpty()) {
            return Collections.emptyList();
        }
        List<NotificationChannel> listEmptyList = i10 >= 28 ? Collections.emptyList() : getNotificationChannels();
        ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
        for (NotificationChannelGroup notificationChannelGroup : notificationChannelGroups) {
            if (Build.VERSION.SDK_INT >= 28) {
                arrayList.add(new q(notificationChannelGroup));
            } else {
                arrayList.add(new q(notificationChannelGroup, listEmptyList));
            }
        }
        return arrayList;
    }

    public List<NotificationChannel> getNotificationChannels() {
        return c.k(this.mNotificationManager);
    }

    public List<p> getNotificationChannelsCompat() {
        List<NotificationChannel> notificationChannels = getNotificationChannels();
        if (notificationChannels.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(notificationChannels.size());
        Iterator<NotificationChannel> it = notificationChannels.iterator();
        while (it.hasNext()) {
            arrayList.add(new p(it.next()));
        }
        return arrayList;
    }

    public void notify(int i10, Notification notification) {
        notify(null, i10, notification);
    }

    public void cancel(String str, int i10) {
        this.mNotificationManager.cancel(str, i10);
    }

    public void createNotificationChannel(p pVar) {
        createNotificationChannel(pVar.a());
    }

    public NotificationChannel getNotificationChannel(String str, String str2) {
        return Build.VERSION.SDK_INT >= 30 ? e.a(this.mNotificationManager, str, str2) : getNotificationChannel(str);
    }

    public void notify(String str, int i10, Notification notification) {
        if (!useSideChannelForNotification(notification)) {
            this.mNotificationManager.notify(str, i10, notification);
        } else {
            pushSideChannelQueue(new h(this.mContext.getPackageName(), i10, str, notification));
            this.mNotificationManager.cancel(str, i10);
        }
    }

    public p getNotificationChannelCompat(String str, String str2) {
        NotificationChannel notificationChannel = getNotificationChannel(str, str2);
        if (notificationChannel != null) {
            return new p(notificationChannel);
        }
        return null;
    }

    public NotificationManagerCompat(NotificationManager notificationManager, Context context) {
        this.mContext = context;
        this.mNotificationManager = notificationManager;
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        c.b(this.mNotificationManager, notificationChannelGroup);
    }

    public void notify(List<g> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).getClass();
            notify(null, 0, null);
        }
    }
}
