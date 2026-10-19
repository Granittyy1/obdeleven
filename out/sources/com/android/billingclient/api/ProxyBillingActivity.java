package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.C2018x;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import me.zhanghai.android.materialprogressbar.R;
import p237t3.C;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f23536h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ResultReceiver f23537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23542g;

    public final Intent a(zzie zzieVar, long j) {
        Intent intentB = b();
        intentB.putExtra("RESPONSE_CODE", 6);
        intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        a.C0244a c0244aA = a.a();
        c0244aA.f23555a = 6;
        c0244aA.f23557c = "An internal error occurred.";
        a aVarA = c0244aA.a();
        int i10 = C.f47135a;
        intentB.putExtra("FAILURE_LOGGING_PAYLOAD", C.b(zzieVar, 2, aVarA, null, zzil.BROADCAST_ACTION_UNSPECIFIED).c());
        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentB.putExtra("billingClientTransactionId", j);
        intentB.putExtra("wasServiceAutoReconnected", this.f23542g);
        return intentB;
    }

    public final Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        zzie zzieVar;
        Intent intentA;
        Bundle extras;
        int i12;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 100 || i10 == 110) {
            int i13 = C2018x.e(intent, "ProxyBillingActivity").f23552a;
            if (i11 != -1) {
                Log.isLoggable("ProxyBillingActivity", 5);
            } else if (i13 != 0) {
                i11 = -1;
                Log.isLoggable("ProxyBillingActivity", 5);
            } else {
                i11 = -1;
            }
            if (intent == null) {
                Log.isLoggable("ProxyBillingActivity", 5);
                if (i11 == -1) {
                    zzieVar = zzie.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
                } else if (i11 == 0) {
                    zzieVar = zzie.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
                } else if (i11 == 3) {
                    zzieVar = zzie.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE;
                } else if (i11 != 4) {
                    zzieVar = i11 != 5 ? zzie.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : zzie.NULL_DATA_WITH_ON_CREATE_RUNTIME_EXCEPTION_RESULT_CODE;
                } else {
                    zzieVar = zzie.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE;
                }
                intentA = a(zzieVar, this.f23541f);
            } else if (intent.getExtras() != null) {
                String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    intentA = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intentA.setPackage(getApplicationContext().getPackageName());
                    intentA.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intentA.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                } else {
                    Intent intentB = b();
                    intentB.putExtras(intent.getExtras());
                    intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentA = intentB;
                }
                intentA.putExtra("billingClientTransactionId", this.f23541f);
                intentA.putExtra("wasServiceAutoReconnected", this.f23542g);
            } else {
                Log.isLoggable("ProxyBillingActivity", 5);
                intentA = a(zzie.NULL_BUNDLE_IN_ACTIVITY_RESULT, this.f23541f);
            }
            if (i10 == 110) {
                intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentA);
        } else if (i10 == 101) {
            int i14 = C2018x.f26297a;
            if (intent == null || (extras = intent.getExtras()) == null) {
                Log.isLoggable("ProxyBillingActivity", 5);
                i12 = 0;
            } else {
                i12 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
            }
            ResultReceiver resultReceiver = this.f23537b;
            if (resultReceiver != null) {
                resultReceiver.send(i12, intent == null ? null : intent.getExtras());
            }
        } else {
            int i15 = C2018x.f26297a;
            Log.isLoggable("ProxyBillingActivity", 5);
        }
        this.f23538c = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            C2018x.h("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f23538c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f23537b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f23539d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f23540e = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f23541f = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f23542g = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        C2018x.h("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f23540e = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f23539d = true;
                this.f23540e = R.styleable.AppCompatTheme_textColorAlertDialogListItem;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f23537b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f23540e = R.styleable.AppCompatTheme_switchStyle;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f23541f = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f23542g = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f23538c = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f23540e, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException unused) {
            C2018x.i("ProxyBillingActivity");
            ResultReceiver resultReceiver = this.f23537b;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentA = a(zzie.INTENT_SENDER_EXCEPTION, this.f23541f);
                if (this.f23539d) {
                    intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentA);
            }
            this.f23538c = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f23538c) {
            Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.f23539d) {
                intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i10 = this.f23540e;
            if (i10 == 110 || i10 == 100) {
                intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentB.putExtra("billingClientTransactionId", this.f23541f);
            }
            sendBroadcast(intentB);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f23537b;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f23538c);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f23539d);
        bundle.putInt("activity_code", this.f23540e);
        bundle.putLong("billingClientTransactionId", this.f23541f);
        bundle.putBoolean("wasServiceAutoReconnected", this.f23542g);
    }
}
