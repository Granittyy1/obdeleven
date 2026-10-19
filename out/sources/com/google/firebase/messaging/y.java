package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: MessagingAnalytics.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y {
    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            p144l6.e.c();
            p144l6.e eVarC = p144l6.e.c();
            eVarC.a();
            Context context = eVarC.f44388a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
            }
            return false;
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0185 A[Catch: NumberFormatException -> 0x0179, TRY_ENTER, TRY_LEAVE, TryCatch #5 {NumberFormatException -> 0x0179, blocks: (B:97:0x016b, B:105:0x0185), top: B:132:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x018d  */
    /* JADX WARN: Code duplicated, block: B:109:0x018f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8 A[PHI: r5
      0x00c8: PHI (r5v24 java.lang.String) = (r5v23 java.lang.String), (r5v47 java.lang.String) binds: [B:42:0x00b0, B:46:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00de  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:73:0x010f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0112  */
    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Code duplicated, block: B:78:0x011e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0127  */
    /* JADX WARN: Code duplicated, block: B:82:0x012a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0134  */
    /* JADX WARN: Code duplicated, block: B:86:0x0137  */
    /* JADX WARN: Code duplicated, block: B:91:0x014c  */
    /* JADX WARN: Code duplicated, block: B:95:0x015e  */
    /* JADX WARN: Code duplicated, block: B:97:0x016b A[Catch: NumberFormatException -> 0x0179, TRY_ENTER, TRY_LEAVE, TryCatch #5 {NumberFormatException -> 0x0179, blocks: (B:97:0x016b, B:105:0x0185), top: B:132:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0170  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Intent intent) {
        int iIntValue;
        int i10;
        String string;
        MessagingClientEvent.MessageType messageType;
        String string2;
        Object[] objArr;
        int i11;
        int i12;
        String string3;
        String str;
        String string4;
        String str2;
        String string5;
        String str3;
        String string6;
        String str4;
        String string7;
        String str5;
        long j;
        long j10;
        p144l6.e eVarC;
        p144l6.f fVar;
        String str6;
        String str7;
        String[] strArrSplit;
        String str8;
        int i13 = 0;
        if (d(intent)) {
            c(intent.getExtras(), "_nr");
        }
        if ((intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) ? false : a()) {
            p311z4.h transportFactory = FirebaseMessaging.getTransportFactory();
            if (transportFactory == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            MessagingClientEvent messagingClientEvent = null;
            str = null;
            String str9 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            iIntValue = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Objects.toString(obj);
                            i10 = 0;
                        }
                    }
                    i10 = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            p144l6.e eVarC2 = p144l6.e.c();
                            Object obj2 = com.google.firebase.installations.a.f28202m;
                            string = (String) p191p5.j.a(((com.google.firebase.installations.a) eVarC2.b(p108i7.c.class)).getId());
                        } catch (InterruptedException | ExecutionException e10) {
                            throw new RuntimeException(e10);
                        }
                    }
                    String str10 = string;
                    p144l6.e eVarC3 = p144l6.e.c();
                    eVarC3.a();
                    String packageName = eVarC3.f44388a.getPackageName();
                    if (J2.l.k(extras)) {
                        messageType = MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
                    } else {
                        messageType = MessagingClientEvent.MessageType.DATA_MESSAGE;
                    }
                    MessagingClientEvent.MessageType messageType2 = messageType;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 != null) {
                        if ("high".equals(string2)) {
                            objArr = 1;
                        } else if ("normal".equals(string2)) {
                            objArr = 2;
                        } else {
                            objArr = 0;
                        }
                    } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                        objArr = 2;
                    } else {
                        string2 = extras.getString("google.priority");
                        if ("high".equals(string2)) {
                            objArr = 1;
                        } else if ("normal".equals(string2)) {
                            objArr = 2;
                        } else {
                            objArr = 0;
                        }
                    }
                    if (objArr == 2) {
                        i12 = 5;
                    } else {
                        if (objArr == 1) {
                            i12 = 10;
                        } else {
                            i11 = 0;
                        }
                        string3 = extras.getString("google.message_id");
                        if (string3 == null) {
                            string3 = extras.getString("message_id");
                        }
                        if (string3 != null) {
                            str = string3;
                        } else {
                            str = "";
                        }
                        string4 = extras.getString(TicketDetailDestinationKt.LAUNCHED_FROM);
                        if (string4 != null && string4.startsWith("/topics/")) {
                            str9 = string4;
                        }
                        if (str9 != null) {
                            str2 = str9;
                        } else {
                            str2 = "";
                        }
                        string5 = extras.getString("collapse_key");
                        if (string5 != null) {
                            str3 = string5;
                        } else {
                            str3 = "";
                        }
                        string6 = extras.getString("google.c.a.m_l");
                        if (string6 != null) {
                            str4 = string6;
                        } else {
                            str4 = "";
                        }
                        string7 = extras.getString("google.c.a.c_l");
                        if (string7 != null) {
                            str5 = string7;
                        } else {
                            str5 = "";
                        }
                        if (extras.containsKey("google.c.sender.id")) {
                            try {
                                j = Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (NumberFormatException unused2) {
                                eVarC = p144l6.e.c();
                                eVarC.a();
                                fVar = eVarC.f44390c;
                                str6 = fVar.f44404e;
                                if (str6 != null) {
                                    try {
                                        j = Long.parseLong(str6);
                                    } catch (NumberFormatException unused3) {
                                        eVarC.a();
                                        str7 = fVar.f44401b;
                                        try {
                                            if (str7.startsWith("1:")) {
                                                strArrSplit = str7.split(":");
                                                if (strArrSplit.length >= 2) {
                                                    str8 = strArrSplit[1];
                                                    if (str8.isEmpty()) {
                                                        j = Long.parseLong(str8);
                                                    }
                                                }
                                                j = 0;
                                            } else {
                                                j = Long.parseLong(str7);
                                            }
                                        } catch (NumberFormatException unused4) {
                                        }
                                    }
                                } else {
                                    eVarC.a();
                                    str7 = fVar.f44401b;
                                    if (str7.startsWith("1:")) {
                                        j = Long.parseLong(str7);
                                    } else {
                                        strArrSplit = str7.split(":");
                                        if (strArrSplit.length >= 2) {
                                            str8 = strArrSplit[1];
                                            if (str8.isEmpty()) {
                                                j = Long.parseLong(str8);
                                            }
                                        }
                                        j = 0;
                                    }
                                }
                            }
                        } else {
                            eVarC = p144l6.e.c();
                            eVarC.a();
                            fVar = eVarC.f44390c;
                            str6 = fVar.f44404e;
                            if (str6 != null) {
                                j = Long.parseLong(str6);
                            } else {
                                eVarC.a();
                                str7 = fVar.f44401b;
                                if (str7.startsWith("1:")) {
                                    j = Long.parseLong(str7);
                                } else {
                                    strArrSplit = str7.split(":");
                                    if (strArrSplit.length >= 2) {
                                        str8 = strArrSplit[1];
                                        if (str8.isEmpty()) {
                                            j = Long.parseLong(str8);
                                        }
                                    }
                                    j = 0;
                                }
                            }
                        }
                        if (j > 0) {
                            j10 = j;
                        } else {
                            j10 = 0;
                        }
                        messagingClientEvent = new MessagingClientEvent(j10, str, str10, messageType2, packageName, str3, i11, i10, str2, str4, str5);
                    }
                    i11 = i12;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    if (string3 != null) {
                        str = string3;
                    } else {
                        str = "";
                    }
                    string4 = extras.getString(TicketDetailDestinationKt.LAUNCHED_FROM);
                    if (string4 != null) {
                        str9 = string4;
                    }
                    if (str9 != null) {
                        str2 = str9;
                    } else {
                        str2 = "";
                    }
                    string5 = extras.getString("collapse_key");
                    if (string5 != null) {
                        str3 = string5;
                    } else {
                        str3 = "";
                    }
                    string6 = extras.getString("google.c.a.m_l");
                    if (string6 != null) {
                        str4 = string6;
                    } else {
                        str4 = "";
                    }
                    string7 = extras.getString("google.c.a.c_l");
                    if (string7 != null) {
                        str5 = string7;
                    } else {
                        str5 = "";
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        j = Long.parseLong(extras.getString("google.c.sender.id"));
                    } else {
                        eVarC = p144l6.e.c();
                        eVarC.a();
                        fVar = eVarC.f44390c;
                        str6 = fVar.f44404e;
                        if (str6 != null) {
                            j = Long.parseLong(str6);
                        } else {
                            eVarC.a();
                            str7 = fVar.f44401b;
                            if (str7.startsWith("1:")) {
                                j = Long.parseLong(str7);
                            } else {
                                strArrSplit = str7.split(":");
                                if (strArrSplit.length >= 2) {
                                    str8 = strArrSplit[1];
                                    if (str8.isEmpty()) {
                                        j = Long.parseLong(str8);
                                    }
                                }
                                j = 0;
                            }
                        }
                    }
                    if (j > 0) {
                        j10 = j;
                    } else {
                        j10 = 0;
                    }
                    messagingClientEvent = new MessagingClientEvent(j10, str, str10, messageType2, packageName, str3, i11, i10, str2, str4, str5);
                }
                i10 = iIntValue;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    p144l6.e eVarC4 = p144l6.e.c();
                    Object obj3 = com.google.firebase.installations.a.f28202m;
                    string = (String) p191p5.j.a(((com.google.firebase.installations.a) eVarC4.b(p108i7.c.class)).getId());
                }
                String str11 = string;
                p144l6.e eVarC5 = p144l6.e.c();
                eVarC5.a();
                String packageName2 = eVarC5.f44388a.getPackageName();
                if (J2.l.k(extras)) {
                    messageType = MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
                } else {
                    messageType = MessagingClientEvent.MessageType.DATA_MESSAGE;
                }
                MessagingClientEvent.MessageType messageType3 = messageType;
                string2 = extras.getString("google.delivered_priority");
                if (string2 != null) {
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                    objArr = 2;
                } else {
                    string2 = extras.getString("google.priority");
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                }
                if (objArr == 2) {
                    i12 = 5;
                } else {
                    if (objArr == 1) {
                        i12 = 10;
                    } else {
                        i11 = 0;
                    }
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    if (string3 != null) {
                        str = string3;
                    } else {
                        str = "";
                    }
                    string4 = extras.getString(TicketDetailDestinationKt.LAUNCHED_FROM);
                    if (string4 != null) {
                        str9 = string4;
                    }
                    if (str9 != null) {
                        str2 = str9;
                    } else {
                        str2 = "";
                    }
                    string5 = extras.getString("collapse_key");
                    if (string5 != null) {
                        str3 = string5;
                    } else {
                        str3 = "";
                    }
                    string6 = extras.getString("google.c.a.m_l");
                    if (string6 != null) {
                        str4 = string6;
                    } else {
                        str4 = "";
                    }
                    string7 = extras.getString("google.c.a.c_l");
                    if (string7 != null) {
                        str5 = string7;
                    } else {
                        str5 = "";
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        j = Long.parseLong(extras.getString("google.c.sender.id"));
                    } else {
                        eVarC = p144l6.e.c();
                        eVarC.a();
                        fVar = eVarC.f44390c;
                        str6 = fVar.f44404e;
                        if (str6 != null) {
                            j = Long.parseLong(str6);
                        } else {
                            eVarC.a();
                            str7 = fVar.f44401b;
                            if (str7.startsWith("1:")) {
                                j = Long.parseLong(str7);
                            } else {
                                strArrSplit = str7.split(":");
                                if (strArrSplit.length >= 2) {
                                    str8 = strArrSplit[1];
                                    if (str8.isEmpty()) {
                                        j = Long.parseLong(str8);
                                    }
                                }
                                j = 0;
                            }
                        }
                    }
                    if (j > 0) {
                        j10 = j;
                    } else {
                        j10 = 0;
                    }
                    messagingClientEvent = new MessagingClientEvent(j10, str, str11, messageType3, packageName2, str3, i11, i10, str2, str4, str5);
                }
                i11 = i12;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                    string3 = extras.getString("message_id");
                }
                if (string3 != null) {
                    str = string3;
                } else {
                    str = "";
                }
                string4 = extras.getString(TicketDetailDestinationKt.LAUNCHED_FROM);
                if (string4 != null) {
                    str9 = string4;
                }
                if (str9 != null) {
                    str2 = str9;
                } else {
                    str2 = "";
                }
                string5 = extras.getString("collapse_key");
                if (string5 != null) {
                    str3 = string5;
                } else {
                    str3 = "";
                }
                string6 = extras.getString("google.c.a.m_l");
                if (string6 != null) {
                    str4 = string6;
                } else {
                    str4 = "";
                }
                string7 = extras.getString("google.c.a.c_l");
                if (string7 != null) {
                    str5 = string7;
                } else {
                    str5 = "";
                }
                if (extras.containsKey("google.c.sender.id")) {
                    j = Long.parseLong(extras.getString("google.c.sender.id"));
                } else {
                    eVarC = p144l6.e.c();
                    eVarC.a();
                    fVar = eVarC.f44390c;
                    str6 = fVar.f44404e;
                    if (str6 != null) {
                        j = Long.parseLong(str6);
                    } else {
                        eVarC.a();
                        str7 = fVar.f44401b;
                        if (str7.startsWith("1:")) {
                            j = Long.parseLong(str7);
                        } else {
                            strArrSplit = str7.split(":");
                            if (strArrSplit.length >= 2) {
                                str8 = strArrSplit[1];
                                if (str8.isEmpty()) {
                                    j = Long.parseLong(str8);
                                }
                            }
                            j = 0;
                        }
                    }
                }
                if (j > 0) {
                    j10 = j;
                } else {
                    j10 = 0;
                }
                messagingClientEvent = new MessagingClientEvent(j10, str, str11, messageType3, packageName2, str3, i11, i10, str2, str4, str5);
            }
            if (messagingClientEvent == null) {
                return;
            }
            try {
                transportFactory.b("FCM_CLIENT_EVENT_LOGGING", new p311z4.c("proto"), new B6.b(3)).a(new p311z4.a(new o7.a(messagingClientEvent), Priority.f25231b, new p311z4.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new C4.v(i13));
            } catch (RuntimeException unused5) {
            }
        }
    }

    public static void c(Bundle bundle, String str) {
        try {
            p144l6.e.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString(TicketDetailDestinationKt.LAUNCHED_FROM);
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = J2.l.k(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            p192p6.a aVar = (p192p6.a) p144l6.e.c().b(p192p6.a.class);
            if (aVar != null) {
                aVar.c(bundle2, "fcm", str);
            }
        } catch (IllegalStateException unused3) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean d(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }
}
