package com.braze.push;

import Aa.c;
import Ia.a;
import Ia.l;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.t;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: NotificationTrampolineActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NotificationTrampolineActivity extends Activity {

    /* JADX INFO: renamed from: com.braze.push.NotificationTrampolineActivity$onResume$7, reason: invalid class name */
    /* JADX INFO: compiled from: NotificationTrampolineActivity.kt */
    @c(c = "com.braze.push.NotificationTrampolineActivity$onResume$7", f = "NotificationTrampolineActivity.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends SuspendLambda implements l<kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass7(kotlin.coroutines.c<? super AnonymousClass7> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(kotlin.coroutines.c<?> cVar) {
            return NotificationTrampolineActivity.this.new AnonymousClass7(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, NotificationTrampolineActivity.this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.NotificationTrampolineActivity.onResume.7.1
                @Override // Ia.a
                public final String invoke() {
                    return "Delay complete. Finishing Notification trampoline activity now";
                }
            }, 2, (Object) null);
            NotificationTrampolineActivity.this.finish();
            return r.f47939a;
        }

        @Override // Ia.l
        public final Object invoke(kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass7) create(cVar)).invokeSuspend(r.f47939a);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.NotificationTrampolineActivity.onCreate.1
            @Override // Ia.a
            public final String invoke() {
                return "NotificationTrampolineActivity created";
            }
        }, 2, (Object) null);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.NotificationTrampolineActivity.onPause.1
            @Override // Ia.a
            public final String invoke() {
                return "Notification trampoline activity paused and finishing";
            }
        }, 2, (Object) null);
        finish();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            final Intent intent = getIntent();
            if (intent == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.NotificationTrampolineActivity.onResume.1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Notification trampoline activity received null intent. Doing nothing.";
                    }
                }, 3, (Object) null);
                finish();
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.NotificationTrampolineActivity.onResume.2
                    @Override // Ia.a
                    public final String invoke() {
                        return "Notification trampoline activity received intent with null action. Doing nothing.";
                    }
                }, 3, (Object) null);
                finish();
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.NotificationTrampolineActivity.onResume.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Notification trampoline activity received intent: " + intent;
                }
            }, 2, (Object) null);
            Intent intent2 = new Intent(action).setClass(this, BrazeNotificationUtils.getNotificationReceiverClass());
            i.d(intent2, "Intent(action).setClass(…otificationReceiverClass)");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                intent2.putExtras(extras);
            }
            if (Constants.isAmazonDevice()) {
                BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.Companion, this, intent2, false, 4, null);
            } else {
                BrazePushReceiver.Companion.handleReceivedIntent(this, intent2, false);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.NotificationTrampolineActivity.onResume.6
                @Override // Ia.a
                public final String invoke() {
                    return "Notification trampoline activity finished processing. Delaying before finishing activity.";
                }
            }, 2, (Object) null);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Integer.valueOf(t.d.DEFAULT_DRAG_ANIMATION_DURATION), null, new AnonymousClass7(null), 2, null);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.NotificationTrampolineActivity.onResume.5
                @Override // Ia.a
                public final String invoke() {
                    return "Failed to route intent to notification receiver";
                }
            });
        }
    }
}
