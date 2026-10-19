package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class x extends B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F f16822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PendingIntent f16823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PendingIntent f16824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PendingIntent f16825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f16827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f16828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IconCompat f16829i;
    public CharSequence j;

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class d {
        public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
        }

        public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
            return Notification.CallStyle.forOngoingCall(person, pendingIntent);
        }

        public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
        }

        public static Notification.CallStyle d(Notification.CallStyle callStyle, int i10) {
            return callStyle.setAnswerButtonColorHint(i10);
        }

        public static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        public static Notification.CallStyle f(Notification.CallStyle callStyle, int i10) {
            return callStyle.setDeclineButtonColorHint(i10);
        }

        public static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z10) {
            return callStyle.setIsVideo(z10);
        }

        public static Notification.CallStyle h(Notification.CallStyle callStyle, Icon icon) {
            return callStyle.setVerificationIcon(icon);
        }

        public static Notification.CallStyle i(Notification.CallStyle callStyle, CharSequence charSequence) {
            return callStyle.setVerificationText(charSequence);
        }
    }

    public final r a(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(p0.a.b.a(this.mBuilder.f16796a, i12));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.mBuilder.f16796a.getResources().getString(i11));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        r rVarA = new r.a(IconCompat.d(this.mBuilder.f16796a, i10), spannableStringBuilder, pendingIntent).a();
        rVarA.f16765a.putBoolean("key_action_priority", true);
        return rVarA;
    }

    @Override // androidx.core.app.B
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
        bundle.putInt("android.callType", this.f16821a);
        bundle.putBoolean("android.callIsVideo", this.f16826f);
        F f10 = this.f16822b;
        if (f10 != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f10.getClass();
                bundle.putParcelable("android.callPerson", c.b(F.b.b(f10)));
            } else {
                bundle.putParcelable("android.callPersonCompat", f10.b());
            }
        }
        IconCompat iconCompat = this.f16829i;
        if (iconCompat != null) {
            Context context = this.mBuilder.f16796a;
            iconCompat.getClass();
            bundle.putParcelable("android.verificationIcon", b.a(IconCompat.a.f(iconCompat, context)));
        }
        bundle.putCharSequence("android.verificationText", this.j);
        bundle.putParcelable("android.answerIntent", this.f16823c);
        bundle.putParcelable("android.declineIntent", this.f16824d);
        bundle.putParcelable("android.hangUpIntent", this.f16825e);
        Integer num = this.f16827g;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f16828h;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    @Override // androidx.core.app.B
    public final void apply(o oVar) {
        int i10 = Build.VERSION.SDK_INT;
        String string = null;
        callStyleA = null;
        Notification.CallStyle callStyleA = null;
        if (i10 < 31) {
            Notification.Builder builder = ((C) oVar).f16678b;
            F f10 = this.f16822b;
            builder.setContentTitle(f10 != null ? f10.f16682a : null);
            Bundle bundle = this.mBuilder.f16812r;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.mBuilder.f16812r.getCharSequence("android.text");
            if (charSequence == null) {
                int i11 = this.f16821a;
                if (i11 == 1) {
                    string = this.mBuilder.f16796a.getResources().getString(R.string.call_notification_incoming_text);
                } else if (i11 == 2) {
                    string = this.mBuilder.f16796a.getResources().getString(R.string.call_notification_ongoing_text);
                } else if (i11 == 3) {
                    string = this.mBuilder.f16796a.getResources().getString(R.string.call_notification_screening_text);
                }
                charSequence = string;
            }
            builder.setContentText(charSequence);
            F f11 = this.f16822b;
            if (f11 != null) {
                IconCompat iconCompat = f11.f16683b;
                if (iconCompat != null) {
                    b.c(builder, IconCompat.a.f(iconCompat, this.mBuilder.f16796a));
                }
                if (i10 >= 28) {
                    F f12 = this.f16822b;
                    f12.getClass();
                    c.a(builder, F.b.b(f12));
                } else {
                    a.a(builder, this.f16822b.f16684c);
                }
            }
            a.b(builder, "call");
            return;
        }
        int i12 = this.f16821a;
        if (i12 == 1) {
            F f13 = this.f16822b;
            f13.getClass();
            callStyleA = d.a(F.b.b(f13), this.f16824d, this.f16823c);
        } else if (i12 == 2) {
            F f14 = this.f16822b;
            f14.getClass();
            callStyleA = d.b(F.b.b(f14), this.f16825e);
        } else if (i12 == 3) {
            F f15 = this.f16822b;
            f15.getClass();
            callStyleA = d.c(F.b.b(f15), this.f16825e, this.f16823c);
        } else if (Log.isLoggable("NotifCompat", 3)) {
            String.valueOf(this.f16821a);
        }
        if (callStyleA != null) {
            callStyleA.setBuilder(((C) oVar).f16678b);
            Integer num = this.f16827g;
            if (num != null) {
                d.d(callStyleA, num.intValue());
            }
            Integer num2 = this.f16828h;
            if (num2 != null) {
                d.f(callStyleA, num2.intValue());
            }
            d.i(callStyleA, this.j);
            IconCompat iconCompat2 = this.f16829i;
            if (iconCompat2 != null) {
                d.h(callStyleA, IconCompat.a.f(iconCompat2, this.mBuilder.f16796a));
            }
            d.g(callStyleA, this.f16826f);
        }
    }

    @Override // androidx.core.app.B
    public final boolean displayCustomViewInline() {
        return true;
    }

    @Override // androidx.core.app.B
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // androidx.core.app.B
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        this.f16821a = bundle.getInt("android.callType");
        this.f16826f = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.f16822b = F.b.a(w.a(bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.f16822b = F.a(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            this.f16829i = IconCompat.b((Icon) bundle.getParcelable("android.verificationIcon"));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.f16829i = IconCompat.a(bundle.getBundle("android.verificationIconCompat"));
        }
        this.j = bundle.getCharSequence("android.verificationText");
        this.f16823c = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.f16824d = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.f16825e = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.f16827g = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.f16828h = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class b {
        public static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static void c(Notification.Builder builder, Icon icon) {
            builder.setLargeIcon(icon);
        }

        public static Parcelable a(Icon icon) {
            return icon;
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class c {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Parcelable b(Person person) {
            return person;
        }
    }
}
