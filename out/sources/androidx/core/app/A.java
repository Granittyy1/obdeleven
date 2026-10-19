package androidx.core.app;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.braze.models.inappmessage.InAppMessageBase;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class A extends B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16666a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16667b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F f16668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f16669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f16670e;

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class a {
        public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
            return messagingStyle.addMessage(message);
        }

        public static Notification.MessagingStyle b(CharSequence charSequence) {
            return new Notification.MessagingStyle(charSequence);
        }

        public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
            return messagingStyle.setConversationTitle(charSequence);
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class b {
        public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
            return messagingStyle.addHistoricMessage(message);
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class c {
        public static Notification.MessagingStyle a(Person person) {
            return new Notification.MessagingStyle(person);
        }

        public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z10) {
            return messagingStyle.setGroupConversation(z10);
        }
    }

    public A() {
    }

    @Override // androidx.core.app.B
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f16668c.f16682a);
        bundle.putBundle("android.messagingStyleUser", this.f16668c.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.f16669d);
        if (this.f16669d != null && this.f16670e.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f16669d);
        }
        ArrayList arrayList = this.f16666a;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", d.a(arrayList));
        }
        ArrayList arrayList2 = this.f16667b;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", d.a(arrayList2));
        }
        Boolean bool = this.f16670e;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // androidx.core.app.B
    public final void apply(o oVar) {
        Notification.MessagingStyle messagingStyleB;
        v vVar = this.mBuilder;
        boolean zBooleanValue = false;
        if (vVar == null || vVar.f16796a.getApplicationInfo().targetSdkVersion >= 28 || this.f16670e != null) {
            Boolean bool = this.f16670e;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else if (this.f16669d != null) {
            zBooleanValue = true;
        }
        this.f16670e = Boolean.valueOf(zBooleanValue);
        if (Build.VERSION.SDK_INT >= 28) {
            F f10 = this.f16668c;
            f10.getClass();
            messagingStyleB = c.a(F.b.b(f10));
        } else {
            messagingStyleB = a.b(this.f16668c.f16682a);
        }
        Iterator it = this.f16666a.iterator();
        while (it.hasNext()) {
            a.a(messagingStyleB, ((d) it.next()).c());
        }
        Iterator it2 = this.f16667b.iterator();
        while (it2.hasNext()) {
            b.a(messagingStyleB, ((d) it2.next()).c());
        }
        if (this.f16670e.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            a.c(messagingStyleB, this.f16669d);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            c.b(messagingStyleB, this.f16670e.booleanValue());
        }
        messagingStyleB.setBuilder(((C) oVar).f16678b);
    }

    @Override // androidx.core.app.B
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    @Override // androidx.core.app.B
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // androidx.core.app.B
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        ArrayList arrayList = this.f16666a;
        arrayList.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f16668c = F.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            String string = bundle.getString("android.selfDisplayName");
            F f10 = new F();
            f10.f16682a = string;
            f10.f16683b = null;
            f10.f16684c = null;
            f10.f16685d = null;
            f10.f16686e = false;
            f10.f16687f = false;
            this.f16668c = f10;
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f16669d = charSequence;
        if (charSequence == null) {
            this.f16669d = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(d.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f16667b.addAll(d.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.f16670e = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public A(F f10) {
        if (!TextUtils.isEmpty(f10.f16682a)) {
            this.f16668c = f10;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f16671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f16672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final F f16673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f16674d = new Bundle();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f16675e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Uri f16676f;

        /* JADX INFO: compiled from: NotificationCompat.java */
        public static class a {
            public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j, CharSequence charSequence2) {
                return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
            }

            public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                return message.setData(str, uri);
            }
        }

        public d(CharSequence charSequence, long j, F f10) {
            this.f16671a = charSequence;
            this.f16672b = j;
            this.f16673c = f10;
        }

        public static Bundle[] a(ArrayList arrayList) {
            Bundle[] bundleArr = new Bundle[arrayList.size()];
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                dVar.getClass();
                Bundle bundle = new Bundle();
                CharSequence charSequence = dVar.f16671a;
                if (charSequence != null) {
                    bundle.putCharSequence(AttributeType.TEXT, charSequence);
                }
                bundle.putLong("time", dVar.f16672b);
                F f10 = dVar.f16673c;
                if (f10 != null) {
                    bundle.putCharSequence("sender", f10.f16682a);
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.a(F.b.b(f10)));
                    } else {
                        bundle.putBundle("person", f10.b());
                    }
                }
                String str = dVar.f16675e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = dVar.f16676f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = dVar.f16674d;
                if (bundle2 != null) {
                    bundle.putBundle(InAppMessageBase.EXTRAS, bundle2);
                }
                bundleArr[i10] = bundle;
            }
            return bundleArr;
        }

        public static ArrayList b(Parcelable[] parcelableArr) {
            F fA;
            ArrayList arrayList = new ArrayList(parcelableArr.length);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable instanceof Bundle) {
                    Bundle bundle = (Bundle) parcelable;
                    d dVar = null;
                    try {
                        if (bundle.containsKey(AttributeType.TEXT) && bundle.containsKey("time")) {
                            if (bundle.containsKey("person")) {
                                fA = F.a(bundle.getBundle("person"));
                            } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                                fA = F.b.a(w.a(bundle.getParcelable("sender_person")));
                            } else if (bundle.containsKey("sender")) {
                                CharSequence charSequence = bundle.getCharSequence("sender");
                                F f10 = new F();
                                f10.f16682a = charSequence;
                                f10.f16683b = null;
                                f10.f16684c = null;
                                f10.f16685d = null;
                                f10.f16686e = false;
                                f10.f16687f = false;
                                fA = f10;
                            } else {
                                fA = null;
                            }
                            d dVar2 = new d(bundle.getCharSequence(AttributeType.TEXT), bundle.getLong("time"), fA);
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                String string = bundle.getString("type");
                                Uri uri = (Uri) bundle.getParcelable("uri");
                                dVar2.f16675e = string;
                                dVar2.f16676f = uri;
                            }
                            if (bundle.containsKey(InAppMessageBase.EXTRAS)) {
                                dVar2.f16674d.putAll(bundle.getBundle(InAppMessageBase.EXTRAS));
                            }
                            dVar = dVar2;
                        }
                    } catch (ClassCastException unused) {
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                }
            }
            return arrayList;
        }

        public final Notification.MessagingStyle.Message c() {
            Notification.MessagingStyle.Message messageA;
            int i10 = Build.VERSION.SDK_INT;
            long j = this.f16672b;
            CharSequence charSequence = this.f16671a;
            F f10 = this.f16673c;
            if (i10 >= 28) {
                messageA = b.b(charSequence, j, f10 != null ? F.b.b(f10) : null);
            } else {
                messageA = a.a(charSequence, j, f10 != null ? f10.f16682a : null);
            }
            String str = this.f16675e;
            if (str != null) {
                a.b(messageA, str, this.f16676f);
            }
            return messageA;
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        public static class b {
            public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j, Person person) {
                return new Notification.MessagingStyle.Message(charSequence, j, person);
            }

            public static Parcelable a(Person person) {
                return person;
            }
        }
    }
}
