package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.collection.AbstractC0883k;
import androidx.collection.C0874b;
import androidx.collection.C0882j;
import androidx.collection.C0884l;
import androidx.collection.C0886n;
import androidx.collection.C0897z;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AbstractC1266g;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.C1262c;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.C1286a;
import androidx.lifecycle.Lifecycle;
import com.braze.support.BrazeLogger;
import com.google.android.gms.internal.measurement.M1;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends C1286a {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final androidx.collection.A f14733M = C0882j.a(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final androidx.collection.C f14734A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0897z f14735B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0897z f14736C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final String f14737D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final String f14738E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final androidx.compose.ui.text.platform.h f14739F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final androidx.collection.B<I0> f14740G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public I0 f14741H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f14742I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final RunnableC1240q f14743J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final ArrayList f14744K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Ia.l<H0, p293xa.r> f14745L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f14746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14747b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.l<? super AccessibilityEvent, Boolean> f14748c = new AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityManager f14749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AccessibilityManagerAccessibilityStateChangeListenerC1236o f14751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC1238p f14752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<AccessibilityServiceInfo> f14753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f14754i;
    public final c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public B0.s f14757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public B0.s f14758n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14759o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.collection.B<androidx.compose.ui.semantics.j> f14760p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final androidx.collection.B<androidx.compose.ui.semantics.j> f14761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.collection.Y<androidx.collection.Y<CharSequence>> f14762r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final androidx.collection.Y<androidx.collection.H<CharSequence>> f14763s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14764t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer f14765u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0874b<LayoutNode> f14766v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final BufferedChannel f14767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14768x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d f14769y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public androidx.collection.B f14770z;

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.f14749d;
            accessibilityManager.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f14751f);
            accessibilityManager.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f14752g);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            androidComposeViewAccessibilityDelegateCompat.f14754i.removeCallbacks(androidComposeViewAccessibilityDelegateCompat.f14743J);
            AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.f14749d;
            accessibilityManager.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f14751f);
            accessibilityManager.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f14752g);
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class b {
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public final class c extends B0.t {
        public c() {
        }

        @Override // B0.t
        public final void a(int i10, B0.s sVar, String str, Bundle bundle) {
            AndroidComposeViewAccessibilityDelegateCompat.this.a(i10, sVar, str, bundle);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:235:0x055c  */
        /* JADX WARN: Code duplicated, block: B:238:0x0571  */
        /* JADX WARN: Code duplicated, block: B:240:0x057f  */
        /* JADX WARN: Code duplicated, block: B:241:0x0581  */
        /* JADX WARN: Code duplicated, block: B:243:0x058a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:244:0x058c  */
        /* JADX WARN: Code duplicated, block: B:245:0x058e  */
        /* JADX WARN: Code duplicated, block: B:248:0x0598  */
        /* JADX WARN: Code duplicated, block: B:249:0x059a  */
        /* JADX WARN: Code duplicated, block: B:255:0x05a4  */
        /* JADX WARN: Code duplicated, block: B:264:0x05d0  */
        /* JADX WARN: Code duplicated, block: B:266:0x05da  */
        /* JADX WARN: Code duplicated, block: B:270:0x05f2  */
        /* JADX WARN: Code duplicated, block: B:273:0x0606  */
        /* JADX WARN: Code duplicated, block: B:275:0x0610  */
        /* JADX WARN: Code duplicated, block: B:278:0x0628  */
        /* JADX WARN: Code duplicated, block: B:281:0x0641  */
        /* JADX WARN: Code duplicated, block: B:284:0x0659  */
        /* JADX WARN: Code duplicated, block: B:286:0x065f  */
        /* JADX WARN: Code duplicated, block: B:288:0x066b  */
        /* JADX WARN: Code duplicated, block: B:289:0x0672  */
        /* JADX WARN: Code duplicated, block: B:291:0x0675  */
        /* JADX WARN: Code duplicated, block: B:299:0x0693  */
        /* JADX WARN: Code duplicated, block: B:301:0x0696  */
        /* JADX WARN: Code duplicated, block: B:303:0x06ad  */
        /* JADX WARN: Code duplicated, block: B:304:0x06b0  */
        /* JADX WARN: Code duplicated, block: B:311:0x06dd  */
        /* JADX WARN: Code duplicated, block: B:313:0x06e0  */
        /* JADX WARN: Code duplicated, block: B:315:0x06ea  */
        /* JADX WARN: Code duplicated, block: B:319:0x0700  */
        /* JADX WARN: Code duplicated, block: B:320:0x0702  */
        /* JADX WARN: Code duplicated, block: B:322:0x070c  */
        /* JADX WARN: Code duplicated, block: B:324:0x0712  */
        /* JADX WARN: Code duplicated, block: B:325:0x071d  */
        /* JADX WARN: Code duplicated, block: B:330:0x0724  */
        /* JADX WARN: Code duplicated, block: B:337:0x0748  */
        /* JADX WARN: Code duplicated, block: B:339:0x074b  */
        /* JADX WARN: Code duplicated, block: B:341:0x0755  */
        /* JADX WARN: Code duplicated, block: B:344:0x0764  */
        /* JADX WARN: Code duplicated, block: B:347:0x0776  */
        /* JADX WARN: Code duplicated, block: B:349:0x0780  */
        /* JADX WARN: Code duplicated, block: B:350:0x0786  */
        /* JADX WARN: Code duplicated, block: B:353:0x0793  */
        /* JADX WARN: Code duplicated, block: B:360:0x07d9  */
        /* JADX WARN: Code duplicated, block: B:363:0x07fa  */
        /* JADX WARN: Code duplicated, block: B:371:0x082a  */
        /* JADX WARN: Code duplicated, block: B:372:0x0837  */
        /* JADX WARN: Code duplicated, block: B:374:0x0848  */
        /* JADX WARN: Code duplicated, block: B:376:0x0858  */
        /* JADX WARN: Code duplicated, block: B:378:0x086c  */
        /* JADX WARN: Code duplicated, block: B:382:0x0878  */
        /* JADX WARN: Code duplicated, block: B:384:0x087e  */
        /* JADX WARN: Code duplicated, block: B:385:0x0880  */
        /* JADX WARN: Code duplicated, block: B:387:0x0886  */
        /* JADX WARN: Code duplicated, block: B:389:0x088c  */
        /* JADX WARN: Code duplicated, block: B:400:0x08c8  */
        /* JADX WARN: Code duplicated, block: B:402:0x08cb  */
        /* JADX WARN: Code duplicated, block: B:405:0x08e2  */
        /* JADX WARN: Code duplicated, block: B:408:0x08ec  */
        /* JADX WARN: Code duplicated, block: B:410:0x08f2  */
        /* JADX WARN: Code duplicated, block: B:412:0x08fd  */
        /* JADX WARN: Code duplicated, block: B:413:0x0900  */
        /* JADX WARN: Code duplicated, block: B:417:0x090b  */
        /* JADX WARN: Code duplicated, block: B:419:0x0916  */
        /* JADX WARN: Code duplicated, block: B:420:0x0919  */
        /* JADX WARN: Code duplicated, block: B:431:0x0945  */
        /* JADX WARN: Code duplicated, block: B:433:0x0948  */
        /* JADX WARN: Code duplicated, block: B:436:0x095f  */
        /* JADX WARN: Code duplicated, block: B:439:0x0969  */
        /* JADX WARN: Code duplicated, block: B:441:0x096f  */
        /* JADX WARN: Code duplicated, block: B:444:0x097f  */
        /* JADX WARN: Code duplicated, block: B:447:0x098d  */
        /* JADX WARN: Code duplicated, block: B:449:0x099d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:450:0x099f  */
        /* JADX WARN: Code duplicated, block: B:451:0x09a1  */
        /* JADX WARN: Code duplicated, block: B:453:0x09ab  */
        /* JADX WARN: Code duplicated, block: B:455:0x09b7  */
        /* JADX WARN: Code duplicated, block: B:458:0x09ce  */
        /* JADX WARN: Code duplicated, block: B:461:0x09e5  */
        /* JADX WARN: Code duplicated, block: B:464:0x09fc  */
        /* JADX WARN: Code duplicated, block: B:467:0x0a19  */
        /* JADX WARN: Code duplicated, block: B:468:0x0a1d  */
        /* JADX WARN: Code duplicated, block: B:471:0x0a2c  */
        /* JADX WARN: Code duplicated, block: B:473:0x0a3a  */
        /* JADX WARN: Code duplicated, block: B:476:0x0a56  */
        /* JADX WARN: Code duplicated, block: B:479:0x0a72  */
        /* JADX WARN: Code duplicated, block: B:482:0x0a8e  */
        /* JADX WARN: Code duplicated, block: B:484:0x0aa2  */
        /* JADX WARN: Code duplicated, block: B:486:0x0ab2  */
        /* JADX WARN: Code duplicated, block: B:489:0x0abf  */
        /* JADX WARN: Code duplicated, block: B:490:0x0ac1  */
        /* JADX WARN: Code duplicated, block: B:492:0x0ac4  */
        /* JADX WARN: Code duplicated, block: B:494:0x0ad6 A[LOOP:8: B:493:0x0ad4->B:494:0x0ad6, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:497:0x0aef  */
        /* JADX WARN: Code duplicated, block: B:499:0x0b04  */
        /* JADX WARN: Code duplicated, block: B:500:0x0b06  */
        /* JADX WARN: Code duplicated, block: B:502:0x0b09  */
        /* JADX WARN: Code duplicated, block: B:504:0x0b13  */
        /* JADX WARN: Code duplicated, block: B:506:0x0b32  */
        /* JADX WARN: Code duplicated, block: B:509:0x0b39 A[LOOP:10: B:505:0x0b30->B:509:0x0b39, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:512:0x0b41  */
        /* JADX WARN: Code duplicated, block: B:517:0x0b6a  */
        /* JADX WARN: Code duplicated, block: B:521:0x0b8a A[LOOP:11: B:520:0x0b88->B:521:0x0b8a, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:522:0x0bb1  */
        /* JADX WARN: Code duplicated, block: B:524:0x0bbf A[LOOP:12: B:523:0x0bbd->B:524:0x0bbf, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:526:0x0bf1  */
        /* JADX WARN: Code duplicated, block: B:528:0x0c06  */
        /* JADX WARN: Code duplicated, block: B:531:0x0c12  */
        /* JADX WARN: Code duplicated, block: B:532:0x0c18  */
        /* JADX WARN: Code duplicated, block: B:534:0x0c20  */
        /* JADX WARN: Code duplicated, block: B:537:0x0c36  */
        /* JADX WARN: Code duplicated, block: B:539:0x0c40  */
        /* JADX WARN: Code duplicated, block: B:540:0x0c46  */
        /* JADX WARN: Code duplicated, block: B:542:0x0c52  */
        /* JADX WARN: Code duplicated, block: B:581:0x0b52 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:582:0x0b3e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:583:0x0b3f A[EDGE_INSN: B:583:0x0b3f->B:511:0x0b3f BREAK  A[LOOP:10: B:505:0x0b30->B:509:0x0b39], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:588:0x086f A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v41 */
        /* JADX WARN: Type inference failed for: r0v46 */
        /* JADX WARN: Type inference failed for: r20v0 */
        /* JADX WARN: Type inference failed for: r20v1 */
        /* JADX WARN: Type inference failed for: r20v2 */
        /* JADX WARN: Type inference failed for: r20v3 */
        /* JADX WARN: Type inference failed for: r20v4 */
        /* JADX WARN: Type inference failed for: r20v5 */
        /* JADX WARN: Type inference failed for: r2v1, types: [android.view.accessibility.AccessibilityNodeInfo] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.view.accessibility.AccessibilityNodeInfo] */
        /* JADX WARN: Type inference failed for: r2v4, types: [android.view.accessibility.AccessibilityNodeInfo] */
        /* JADX WARN: Type inference failed for: r2v6, types: [android.view.accessibility.AccessibilityNodeInfo] */
        /* JADX WARN: Type inference failed for: r7v118, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r7v119, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r7v120, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r7v121, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r7v124, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r7v125, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
        @Override // B0.t
        public final B0.s b(int i10) {
            ?? r10;
            AccessibilityNodeInfo accessibilityNodeInfo;
            Resources resources;
            androidx.compose.ui.semantics.q qVar;
            androidx.compose.ui.semantics.i iVar;
            B0.s sVar;
            SpannableString spannableString;
            AccessibilityNodeInfo accessibilityNodeInfo2;
            androidx.compose.ui.semantics.i iVar2;
            int i11;
            int i12;
            androidx.compose.ui.semantics.a aVar;
            androidx.compose.ui.semantics.a aVar2;
            androidx.compose.ui.semantics.a aVar3;
            String strK;
            boolean z10;
            int i13;
            ArrayList arrayList;
            CharSequence charSequenceG;
            boolean z11;
            androidx.compose.ui.semantics.h hVar;
            androidx.compose.ui.semantics.b bVar;
            ArrayList arrayList2;
            boolean zA;
            int size;
            int size2;
            List listH;
            int size3;
            int i14;
            androidx.compose.ui.semantics.q qVar2;
            androidx.compose.ui.semantics.j jVar;
            androidx.compose.ui.semantics.j jVar2;
            CharSequence charSequence;
            ?? r20;
            boolean zH;
            ?? r11;
            Bundle extras;
            ?? r12;
            int iB;
            AndroidComposeView androidComposeView;
            int iB2;
            AndroidViewHolder androidViewHolderG;
            AndroidViewHolder androidViewHolderG2;
            androidx.compose.ui.semantics.a aVar4;
            androidx.compose.ui.semantics.a aVar5;
            androidx.compose.ui.semantics.a aVar6;
            androidx.compose.ui.semantics.l lVarK;
            androidx.compose.ui.semantics.v<List<androidx.compose.ui.semantics.e>> vVar;
            List list;
            int size4;
            androidx.collection.A a10;
            androidx.collection.Y<CharSequence> y10;
            androidx.collection.H<CharSequence> hA;
            androidx.collection.Y<androidx.collection.H<CharSequence>> y11;
            boolean z12;
            androidx.compose.ui.semantics.q qVar3;
            ?? r21;
            int size5;
            int i15;
            androidx.collection.H<CharSequence> hC;
            androidx.collection.A a11;
            int[] iArr;
            int i16;
            int i17;
            ArrayList arrayList3;
            int size6;
            int i18;
            ?? r13;
            int size7;
            int i19;
            androidx.compose.ui.semantics.e eVar;
            boolean z13;
            String strA;
            int iA;
            int i20;
            int[] iArr2;
            int i21;
            int i22;
            int i23;
            androidx.compose.ui.semantics.i iVar3;
            boolean zA2;
            androidx.compose.ui.semantics.a aVar7;
            androidx.compose.ui.semantics.a aVar8;
            androidx.compose.ui.semantics.a aVar9;
            androidx.compose.ui.semantics.a aVar10;
            boolean z14;
            boolean z15;
            B0.s.a aVar11;
            B0.s.a aVar12;
            androidx.compose.ui.semantics.a aVar13;
            androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.a<Ia.l<Float, Boolean>>> vVar2;
            androidx.compose.ui.semantics.h hVar2;
            float f10;
            Na.d dVar;
            androidx.compose.ui.semantics.a aVar14;
            String str;
            List list2;
            boolean z16;
            LayoutNode layoutNodeB;
            androidx.compose.ui.semantics.l lVarF;
            boolean zA3;
            boolean z17;
            androidx.compose.ui.semantics.a aVar15;
            androidx.compose.ui.semantics.a aVar16;
            androidx.compose.ui.semantics.a aVar17;
            androidx.compose.ui.semantics.a aVar18;
            ClipDescription primaryClipDescription;
            boolean zHasMimeType;
            boolean zA4;
            boolean z18;
            boolean z19;
            boolean zA5;
            boolean zBooleanValue;
            ?? arrayList4;
            ?? arrayList5;
            androidx.compose.ui.text.platform.h hVar3;
            int i24;
            Lifecycle lifecycle;
            boolean z20 = true;
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            AndroidComposeView androidComposeView2 = androidComposeViewAccessibilityDelegateCompat.f14746a;
            AndroidComposeView.b viewTreeOwners = androidComposeView2.getViewTreeOwners();
            if (((viewTreeOwners == null || (lifecycle = viewTreeOwners.f14724a.getLifecycle()) == null) ? null : lifecycle.b()) == Lifecycle.State.f17749b) {
                i11 = i10;
                sVar = null;
            } else {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                B0.s sVar2 = new B0.s(accessibilityNodeInfoObtain);
                J0 j0B = androidComposeViewAccessibilityDelegateCompat.j().b(i10);
                if (j0B == null) {
                    i11 = i10;
                    sVar = null;
                } else {
                    androidx.compose.ui.semantics.q qVar4 = j0B.f14934a;
                    if (i10 == -1) {
                        Object parentForAccessibility = androidComposeView2.getParentForAccessibility();
                        View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                        sVar2.f1412b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        androidx.compose.ui.semantics.q qVarJ = qVar4.j();
                        Integer numValueOf = qVarJ != null ? Integer.valueOf(qVarJ.f15245g) : null;
                        if (numValueOf == null) {
                            R.a.c("semanticsNode " + i10 + " has null parent");
                            throw new KotlinNothingValueException();
                        }
                        int iIntValue = numValueOf.intValue();
                        if (iIntValue == androidComposeView2.getSemanticsOwner().a().f15245g) {
                            iIntValue = -1;
                        }
                        sVar2.f1412b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                    }
                    sVar2.f1413c = i10;
                    accessibilityNodeInfoObtain.setSource(androidComposeView2, i10);
                    sVar2.h(androidComposeViewAccessibilityDelegateCompat.b(j0B));
                    Resources resources2 = androidComposeView2.getContext().getResources();
                    sVar2.i("android.view.View");
                    if (qVar4.f15242d.f15234b.b(SemanticsProperties.f15138D)) {
                        sVar2.i("android.widget.EditText");
                    }
                    androidx.compose.ui.semantics.v<List<C1260a>> vVar3 = SemanticsProperties.f15172z;
                    androidx.compose.ui.semantics.l lVar = qVar4.f15242d;
                    androidx.collection.K<androidx.compose.ui.semantics.v<?>, Object> k10 = lVar.f15234b;
                    if (k10.b(vVar3)) {
                        sVar2.i("android.widget.TextView");
                    }
                    androidx.compose.ui.semantics.i iVar4 = (androidx.compose.ui.semantics.i) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15169w);
                    if (iVar4 != null) {
                        if (qVar4.f15243e || androidx.compose.ui.semantics.q.h(qVar4, true, 4).isEmpty()) {
                            int i25 = iVar4.f15203a;
                            if (androidx.compose.ui.semantics.i.a(i25, 4)) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.tab));
                            } else if (androidx.compose.ui.semantics.i.a(i25, 2)) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.switch_role));
                            } else {
                                String strH = K0.h(i25);
                                if (!androidx.compose.ui.semantics.i.a(i25, 5) || qVar4.m() || lVar.f15236d) {
                                    sVar2.i(strH);
                                }
                            }
                        }
                        p293xa.r rVar = p293xa.r.f47939a;
                    }
                    accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(K0.f(qVar4));
                    List listH2 = androidx.compose.ui.semantics.q.h(qVar4, true, 4);
                    int size8 = listH2.size();
                    int i26 = 0;
                    while (true) {
                        r10 = sVar2.f1411a;
                        if (i26 >= size8) {
                            break;
                        }
                        androidx.compose.ui.semantics.q qVar5 = (androidx.compose.ui.semantics.q) listH2.get(i26);
                        int i27 = size8;
                        List list3 = listH2;
                        if (androidComposeViewAccessibilityDelegateCompat.j().a(qVar5.f15245g)) {
                            AndroidViewHolder androidViewHolder = androidComposeView2.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(qVar5.f15241c);
                            int i28 = qVar5.f15245g;
                            if (i28 != -1) {
                                if (androidViewHolder != null) {
                                    r10.addChild(androidViewHolder);
                                } else {
                                    r10.addChild(androidComposeView2, i28);
                                }
                            }
                        }
                        i26++;
                        z20 = true;
                        size8 = i27;
                        listH2 = list3;
                    }
                    boolean z21 = z20;
                    if (i10 == androidComposeViewAccessibilityDelegateCompat.f14755k) {
                        r10.setAccessibilityFocused(z21);
                        sVar2.b(B0.s.a.j);
                    } else {
                        r10.setAccessibilityFocused(false);
                        sVar2.b(B0.s.a.f1418i);
                    }
                    C1260a c1260aF = AndroidComposeViewAccessibilityDelegateCompat_androidKt.f(qVar4);
                    if (c1260aF != null) {
                        androidComposeView2.getFontFamilyResolver();
                        p013b0.c density = androidComposeView2.getDensity();
                        String str2 = c1260aF.f15408c;
                        SpannableString spannableString2 = new SpannableString(str2);
                        ArrayList arrayList6 = c1260aF.f15409d;
                        if (arrayList6 != null) {
                            int size9 = arrayList6.size();
                            int i29 = 0;
                            while (i29 < size9) {
                                ArrayList arrayList7 = arrayList6;
                                C1260a.c cVar = (C1260a.c) arrayList6.get(i29);
                                int i30 = size9;
                                androidx.compose.ui.text.v vVar4 = (androidx.compose.ui.text.v) cVar.f15418a;
                                androidx.compose.ui.semantics.i iVar5 = iVar4;
                                Resources resources3 = resources2;
                                androidx.compose.ui.semantics.q qVar6 = qVar4;
                                long jC = vVar4.f15690a.c();
                                TextForegroundStyle cVar2 = vVar4.f15690a;
                                AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                B0.s sVar3 = sVar2;
                                if (!androidx.compose.ui.graphics.H.c(jC, cVar2.c())) {
                                    cVar2 = jC != 16 ? new androidx.compose.ui.text.style.c(jC) : TextForegroundStyle.a.f15653a;
                                }
                                long jC2 = cVar2.c();
                                int i31 = cVar.f15419b;
                                int i32 = cVar.f15420c;
                                androidx.compose.ui.text.platform.extensions.a.c(spannableString2, jC2, i31, i32);
                                androidx.compose.ui.text.platform.extensions.a.d(spannableString2, vVar4.f15691b, density, i31, i32);
                                androidx.compose.ui.text.font.l lVar2 = vVar4.f15692c;
                                androidx.compose.ui.text.font.j jVar3 = vVar4.f15693d;
                                if (lVar2 == null && jVar3 == null) {
                                    i24 = 33;
                                } else {
                                    if (lVar2 == null) {
                                        lVar2 = androidx.compose.ui.text.font.l.f15442g;
                                    }
                                    StyleSpan styleSpan = new StyleSpan(D2.V.j(lVar2, jVar3 != null ? jVar3.f15436a : 0));
                                    i24 = 33;
                                    spannableString2.setSpan(styleSpan, i31, i32, 33);
                                }
                                androidx.compose.ui.text.style.h hVar4 = vVar4.f15701m;
                                if (hVar4 != null) {
                                    int i33 = hVar4.f15673a;
                                    if ((i33 | 1) == i33) {
                                        spannableString2.setSpan(new UnderlineSpan(), i31, i32, i24);
                                    }
                                    if ((i33 | 2) == i33) {
                                        spannableString2.setSpan(new StrikethroughSpan(), i31, i32, i24);
                                    }
                                }
                                androidx.compose.ui.text.style.j jVar4 = vVar4.j;
                                if (jVar4 != null) {
                                    spannableString2.setSpan(new ScaleXSpan(jVar4.f15676a), i31, i32, i24);
                                }
                                androidx.compose.ui.text.platform.extensions.a.e(spannableString2, vVar4.f15699k, i31, i32);
                                long j = vVar4.f15700l;
                                if (j != 16) {
                                    androidx.compose.ui.text.platform.extensions.a.f(spannableString2, new BackgroundColorSpan(Q3.d.K(j)), i31, i32);
                                }
                                i29++;
                                arrayList6 = arrayList7;
                                size9 = i30;
                                iVar4 = iVar5;
                                qVar4 = qVar6;
                                resources2 = resources3;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo3;
                                sVar2 = sVar3;
                            }
                        }
                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                        B0.s sVar4 = sVar2;
                        resources = resources2;
                        qVar = qVar4;
                        iVar = iVar4;
                        int length = str2.length();
                        List<C1260a.c<? extends C1260a.InterfaceC0160a>> list4 = c1260aF.f15407b;
                        if (list4 != null) {
                            arrayList4 = new ArrayList(list4.size());
                            int size10 = list4.size();
                            for (int i34 = 0; i34 < size10; i34++) {
                                C1260a.c<? extends C1260a.InterfaceC0160a> cVar3 = list4.get(i34);
                                C1260a.c<? extends C1260a.InterfaceC0160a> cVar4 = cVar3;
                                if ((cVar4.f15418a instanceof androidx.compose.ui.text.H) && C1262c.b(0, length, cVar4.f15419b, cVar4.f15420c)) {
                                    arrayList4.add(cVar3);
                                }
                            }
                        } else {
                            arrayList4 = EmptyList.f42983b;
                        }
                        kotlin.jvm.internal.i.c(arrayList4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
                        int size11 = ((Collection) arrayList4).size();
                        for (int i35 = 0; i35 < size11; i35++) {
                            C1260a.c cVar5 = (C1260a.c) arrayList4.get(i35);
                            androidx.compose.ui.text.H h8 = (androidx.compose.ui.text.H) cVar5.f15418a;
                            if (!(h8 instanceof androidx.compose.ui.text.J)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            spannableString2.setSpan(new TtsSpan.VerbatimBuilder(((androidx.compose.ui.text.J) h8).f15322a).build(), cVar5.f15419b, cVar5.f15420c, 33);
                        }
                        int length2 = str2.length();
                        if (list4 != null) {
                            arrayList5 = new ArrayList(list4.size());
                            int size12 = list4.size();
                            for (int i36 = 0; i36 < size12; i36++) {
                                C1260a.c<? extends C1260a.InterfaceC0160a> cVar6 = list4.get(i36);
                                C1260a.c<? extends C1260a.InterfaceC0160a> cVar7 = cVar6;
                                if ((cVar7.f15418a instanceof androidx.compose.ui.text.I) && C1262c.b(0, length2, cVar7.f15419b, cVar7.f15420c)) {
                                    arrayList5.add(cVar6);
                                }
                            }
                        } else {
                            arrayList5 = EmptyList.f42983b;
                        }
                        kotlin.jvm.internal.i.c(arrayList5, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
                        int size13 = ((Collection) arrayList5).size();
                        int i37 = 0;
                        while (true) {
                            hVar3 = androidComposeViewAccessibilityDelegateCompat.f14739F;
                            if (i37 >= size13) {
                                break;
                            }
                            C1260a.c cVar8 = (C1260a.c) arrayList5.get(i37);
                            androidx.compose.ui.text.I i38 = (androidx.compose.ui.text.I) cVar8.f15418a;
                            WeakHashMap<androidx.compose.ui.text.I, URLSpan> weakHashMap = hVar3.f15634a;
                            URLSpan uRLSpan = weakHashMap.get(i38);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(i38.f15321a);
                                weakHashMap.put(i38, uRLSpan);
                            }
                            spannableString2.setSpan(uRLSpan, cVar8.f15419b, cVar8.f15420c, 33);
                            i37++;
                        }
                        List listA = c1260aF.a(str2.length());
                        int size14 = listA.size();
                        for (int i39 = 0; i39 < size14; i39++) {
                            C1260a.c<AbstractC1266g> cVar9 = (C1260a.c) listA.get(i39);
                            int i40 = cVar9.f15419b;
                            int i41 = cVar9.f15420c;
                            if (i40 != i41) {
                                AbstractC1266g abstractC1266g = cVar9.f15418a;
                                AbstractC1266g abstractC1266g2 = abstractC1266g;
                                if ((abstractC1266g2 instanceof AbstractC1266g.b) && ((AbstractC1266g.b) abstractC1266g2).f15469c == null) {
                                    kotlin.jvm.internal.i.c(abstractC1266g, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    AbstractC1266g.b bVar2 = (AbstractC1266g.b) abstractC1266g;
                                    C1260a.c<AbstractC1266g.b> cVar10 = new C1260a.c<>(i40, i41, bVar2);
                                    WeakHashMap<C1260a.c<AbstractC1266g.b>, URLSpan> weakHashMap2 = hVar3.f15635b;
                                    URLSpan uRLSpan2 = weakHashMap2.get(cVar10);
                                    if (uRLSpan2 == null) {
                                        uRLSpan2 = new URLSpan(bVar2.f15467a);
                                        weakHashMap2.put(cVar10, uRLSpan2);
                                    }
                                    spannableString2.setSpan(uRLSpan2, i40, i41, 33);
                                } else {
                                    WeakHashMap<C1260a.c<AbstractC1266g>, androidx.compose.ui.text.platform.b> weakHashMap3 = hVar3.f15636c;
                                    androidx.compose.ui.text.platform.b bVar3 = weakHashMap3.get(cVar9);
                                    if (bVar3 == null) {
                                        bVar3 = new androidx.compose.ui.text.platform.b(abstractC1266g2);
                                        weakHashMap3.put(cVar9, bVar3);
                                    }
                                    spannableString2.setSpan(bVar3, i40, i41, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) AndroidComposeViewAccessibilityDelegateCompat.B(spannableString2);
                        sVar = sVar4;
                    } else {
                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                        resources = resources2;
                        qVar = qVar4;
                        iVar = iVar4;
                        sVar = sVar2;
                        spannableString = null;
                    }
                    sVar.o(spannableString);
                    androidx.compose.ui.semantics.v<String> vVar5 = SemanticsProperties.f15144J;
                    if (k10.b(vVar5)) {
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        accessibilityNodeInfo2.setContentInvalid(true);
                        r10.setError((CharSequence) SemanticsConfigurationKt.a(lVar, vVar5));
                    } else {
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                    }
                    androidx.compose.ui.semantics.q qVar7 = qVar;
                    Resources resources4 = resources;
                    String strE = AndroidComposeViewAccessibilityDelegateCompat_androidKt.e(qVar7, resources4);
                    if (Build.VERSION.SDK_INT >= 30) {
                        B0.s.b.c(r10, strE);
                    } else {
                        r10.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strE);
                    }
                    r10.setCheckable(AndroidComposeViewAccessibilityDelegateCompat_androidKt.d(qVar7));
                    ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15142H);
                    if (toggleableState != null) {
                        if (toggleableState == ToggleableState.f15273b) {
                            r10.setChecked(true);
                        } else if (toggleableState == ToggleableState.f15274c) {
                            r10.setChecked(false);
                        }
                        p293xa.r rVar2 = p293xa.r.f47939a;
                    }
                    Boolean bool = (Boolean) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15141G);
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        iVar2 = iVar;
                        if (iVar == null ? false : androidx.compose.ui.semantics.i.a(iVar2.f15203a, 4)) {
                            r10.setSelected(zBooleanValue2);
                        } else {
                            r10.setChecked(zBooleanValue2);
                        }
                        p293xa.r rVar3 = p293xa.r.f47939a;
                    } else {
                        iVar2 = iVar;
                    }
                    if (!lVar.f15236d || androidx.compose.ui.semantics.q.h(qVar7, true, 4).isEmpty()) {
                        List list5 = (List) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15148a);
                        r10.setContentDescription(list5 != null ? (String) kotlin.collections.q.P(list5) : null);
                    }
                    String str3 = (String) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15170x);
                    if (str3 != null) {
                        androidx.compose.ui.semantics.q qVarJ2 = qVar7;
                        while (true) {
                            if (qVarJ2 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            androidx.compose.ui.semantics.v<Boolean> vVar6 = SemanticsPropertiesAndroid.f15186a;
                            androidx.compose.ui.semantics.l lVar3 = qVarJ2.f15242d;
                            if (lVar3.f15234b.b(vVar6)) {
                                zBooleanValue = ((Boolean) lVar3.q(vVar6)).booleanValue();
                                break;
                            }
                            qVarJ2 = qVarJ2.j();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo2.setViewIdResourceName(str3);
                        }
                    }
                    if (((p293xa.r) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15155h)) != null) {
                        sVar.m(true);
                        p293xa.r rVar4 = p293xa.r.f47939a;
                    }
                    accessibilityNodeInfo2.setPassword(k10.b(SemanticsProperties.f15143I));
                    accessibilityNodeInfo2.setEditable(k10.b(SemanticsProperties.f15146L));
                    Integer num = (Integer) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15147M);
                    r10.setMaxTextLength(num != null ? num.intValue() : -1);
                    r10.setEnabled(AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7));
                    androidx.compose.ui.semantics.v<Boolean> vVar7 = SemanticsProperties.f15157k;
                    r10.setFocusable(k10.b(vVar7));
                    if (accessibilityNodeInfo2.isFocusable()) {
                        r10.setFocused(((Boolean) lVar.q(vVar7)).booleanValue());
                        if (accessibilityNodeInfo2.isFocused()) {
                            sVar.a(2);
                            i11 = i10;
                            androidComposeViewAccessibilityDelegateCompat.f14756l = i11;
                        } else {
                            i11 = i10;
                            i12 = 1;
                            sVar.a(1);
                        }
                        r10.setVisibleToUser((K0.e(qVar7) ? 1 : 0) ^ i12);
                        if (((androidx.compose.ui.semantics.g) SemanticsConfigurationKt.a(lVar, SemanticsProperties.j)) != null) {
                            accessibilityNodeInfo2.setLiveRegion(i12);
                            p293xa.r rVar5 = p293xa.r.f47939a;
                        }
                        sVar.j(false);
                        androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.a<Ia.l<List<androidx.compose.ui.text.B>, Boolean>>> vVar8 = androidx.compose.ui.semantics.k.f15209a;
                        aVar = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15210b);
                        if (aVar != null) {
                            boolean zA6 = kotlin.jvm.internal.i.a(SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15141G), Boolean.TRUE);
                            if (iVar2 == null) {
                                zA4 = false;
                            } else {
                                zA4 = androidx.compose.ui.semantics.i.a(iVar2.f15203a, 4);
                            }
                            if (zA4) {
                                z18 = true;
                            } else {
                                if (iVar2 == null) {
                                    zA5 = false;
                                } else {
                                    zA5 = androidx.compose.ui.semantics.i.a(iVar2.f15203a, 3);
                                }
                                if (zA5) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                            }
                            if (z18 || (z18 && !zA6)) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            sVar.j(z19);
                            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7) && accessibilityNodeInfo2.isClickable()) {
                                sVar.b(new B0.s.a(16, aVar.f15190a));
                            }
                            p293xa.r rVar6 = p293xa.r.f47939a;
                        }
                        r10.setLongClickable(false);
                        aVar2 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15211c);
                        if (aVar2 != null) {
                            r10.setLongClickable(true);
                            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7)) {
                                sVar.b(new B0.s.a(32, aVar2.f15190a));
                            }
                            p293xa.r rVar7 = p293xa.r.f47939a;
                        }
                        aVar3 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15223p);
                        if (aVar3 != null) {
                            sVar.b(new B0.s.a(16384, aVar3.f15190a));
                            p293xa.r rVar8 = p293xa.r.f47939a;
                        }
                        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7)) {
                            aVar15 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.j);
                            if (aVar15 != null) {
                                sVar.b(new B0.s.a(2097152, aVar15.f15190a));
                                p293xa.r rVar9 = p293xa.r.f47939a;
                            }
                            aVar16 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15222o);
                            if (aVar16 != null) {
                                sVar.b(new B0.s.a(android.R.id.accessibilityActionImeEnter, aVar16.f15190a));
                                p293xa.r rVar10 = p293xa.r.f47939a;
                            }
                            aVar17 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15224q);
                            if (aVar17 != null) {
                                sVar.b(new B0.s.a(65536, aVar17.f15190a));
                                p293xa.r rVar11 = p293xa.r.f47939a;
                            }
                            aVar18 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15225r);
                            if (aVar18 != null) {
                                if (r10.isFocused()) {
                                    primaryClipDescription = androidComposeView2.getClipboardManager().f15050a.getPrimaryClipDescription();
                                    if (primaryClipDescription != null) {
                                        zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                    } else {
                                        zHasMimeType = false;
                                    }
                                    if (zHasMimeType) {
                                        sVar.b(new B0.s.a(32768, aVar18.f15190a));
                                    }
                                }
                                p293xa.r rVar12 = p293xa.r.f47939a;
                            }
                        }
                        strK = AndroidComposeViewAccessibilityDelegateCompat.k(qVar7);
                        if (strK != null || strK.length() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            r10.setTextSelection(androidComposeViewAccessibilityDelegateCompat.i(qVar7), androidComposeViewAccessibilityDelegateCompat.h(qVar7));
                            aVar14 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15217i);
                            if (aVar14 != null) {
                                str = aVar14.f15190a;
                            } else {
                                str = null;
                            }
                            sVar.b(new B0.s.a(131072, str));
                            sVar.a(256);
                            sVar.a(512);
                            r10.setMovementGranularities(11);
                            list2 = (List) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15148a);
                            if (list2 != null || list2.isEmpty()) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                if (lVar.f15234b.b(androidx.compose.ui.semantics.k.f15209a)) {
                                    if (lVar.f15234b.b(SemanticsProperties.f15138D) || kotlin.jvm.internal.i.a(SemanticsConfigurationKt.a(lVar, vVar7), Boolean.TRUE)) {
                                        layoutNodeB = AndroidComposeViewAccessibilityDelegateCompat_androidKt.b(qVar7.f15241c, new Ia.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
                                            /* JADX WARN: Code duplicated, block: B:9:0x0018  */
                                            @Override // Ia.l
                                            public final Boolean invoke(LayoutNode layoutNode) {
                                                boolean z22;
                                                androidx.compose.ui.semantics.l lVarF2 = layoutNode.f();
                                                if (lVarF2 != null) {
                                                    if (lVarF2.f15236d) {
                                                        z22 = lVarF2.f15234b.b(SemanticsProperties.f15138D);
                                                    }
                                                }
                                                return Boolean.valueOf(z22);
                                            }
                                        });
                                        if (layoutNodeB != null) {
                                            lVarF = layoutNodeB.f();
                                            if (lVarF != null) {
                                                zA3 = kotlin.jvm.internal.i.a(SemanticsConfigurationKt.a(lVarF, vVar7), Boolean.TRUE);
                                            } else {
                                                zA3 = false;
                                            }
                                            z17 = zA3 ? false : true;
                                        }
                                    }
                                    if (!z17) {
                                        r10.setMovementGranularities(r10.getMovementGranularities() | 20);
                                    }
                                }
                            }
                        }
                        i13 = Build.VERSION.SDK_INT;
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceG = sVar.g();
                        if (charSequenceG != null || charSequenceG.length() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            if (lVar.f15234b.b(androidx.compose.ui.semantics.k.f15209a)) {
                                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                        }
                        if (lVar.f15234b.b(SemanticsProperties.f15170x)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        r10.setAvailableExtraData(arrayList);
                        hVar = (androidx.compose.ui.semantics.h) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15150c);
                        if (hVar != null) {
                            vVar2 = androidx.compose.ui.semantics.k.f15216h;
                            if (lVar.f15234b.b(vVar2)) {
                                sVar.i("android.widget.SeekBar");
                            } else {
                                sVar.i("android.widget.ProgressBar");
                            }
                            hVar2 = androidx.compose.ui.semantics.h.f15199d;
                            f10 = hVar.f15200a;
                            dVar = hVar.f15201b;
                            if (hVar != hVar2) {
                                r10.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(dVar.f4685b).floatValue(), Float.valueOf(dVar.f4686c).floatValue(), f10));
                            }
                            if (lVar.f15234b.b(vVar2) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7)) {
                                if (f10 < Na.l.x(Float.valueOf(dVar.f4686c).floatValue(), Float.valueOf(dVar.f4685b).floatValue())) {
                                    sVar.b(B0.s.a.f1419k);
                                }
                                if (f10 > Na.l.z(Float.valueOf(dVar.f4685b).floatValue(), Float.valueOf(dVar.f4686c).floatValue())) {
                                    sVar.b(B0.s.a.f1420l);
                                }
                            }
                        }
                        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7) && (aVar13 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15216h)) != null) {
                            sVar.b(new B0.s.a(android.R.id.accessibilityActionSetProgress, aVar13.f15190a));
                        }
                        bVar = (androidx.compose.ui.semantics.b) SemanticsConfigurationKt.a(qVar7.i(), SemanticsProperties.f15153f);
                        if (bVar != null) {
                            sVar.k(B0.s.e.a(bVar.f15192a, bVar.f15193b, 0));
                        } else {
                            arrayList2 = new ArrayList();
                            if (SemanticsConfigurationKt.a(qVar7.i(), SemanticsProperties.f15152e) != null) {
                                listH = androidx.compose.ui.semantics.q.h(qVar7, true, 4);
                                size3 = listH.size();
                                for (i14 = 0; i14 < size3; i14++) {
                                    qVar2 = (androidx.compose.ui.semantics.q) listH.get(i14);
                                    if (qVar2.i().f15234b.b(SemanticsProperties.f15141G)) {
                                        arrayList2.add(qVar2);
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                zA = CollectionInfo_androidKt.a(arrayList2);
                                if (zA) {
                                    size = 1;
                                } else {
                                    size = arrayList2.size();
                                }
                                if (zA) {
                                    size2 = arrayList2.size();
                                } else {
                                    size2 = 1;
                                }
                                sVar.k(B0.s.e.a(size, size2, 0));
                            }
                        }
                        CollectionInfo_androidKt.b(qVar7, sVar);
                        jVar = (androidx.compose.ui.semantics.j) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15165s);
                        androidx.compose.ui.semantics.a aVar19 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15212d);
                        if (jVar != null && aVar19 != null) {
                            if (SemanticsConfigurationKt.a(qVar7.i(), SemanticsProperties.f15153f) == null || SemanticsConfigurationKt.a(qVar7.i(), SemanticsProperties.f15152e) != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (!z15) {
                                sVar.i("android.widget.HorizontalScrollView");
                            }
                            if (jVar.a().invoke().floatValue() > 0.0f) {
                                sVar.n(true);
                            }
                            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7)) {
                                if (AndroidComposeViewAccessibilityDelegateCompat.p(jVar)) {
                                    sVar.b(B0.s.a.f1419k);
                                    if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.g(qVar7)) {
                                        aVar12 = B0.s.a.f1425q;
                                    } else {
                                        aVar12 = B0.s.a.f1427s;
                                    }
                                    sVar.b(aVar12);
                                }
                                if (AndroidComposeViewAccessibilityDelegateCompat.o(jVar)) {
                                    sVar.b(B0.s.a.f1420l);
                                    if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.g(qVar7)) {
                                        aVar11 = B0.s.a.f1427s;
                                    } else {
                                        aVar11 = B0.s.a.f1425q;
                                    }
                                    sVar.b(aVar11);
                                }
                            }
                        }
                        jVar2 = (androidx.compose.ui.semantics.j) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15166t);
                        if (jVar2 != null && aVar19 != null) {
                            if (SemanticsConfigurationKt.a(qVar7.i(), SemanticsProperties.f15153f) == null || SemanticsConfigurationKt.a(qVar7.i(), SemanticsProperties.f15152e) != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                sVar.i("android.widget.ScrollView");
                            }
                            if (jVar2.a().invoke().floatValue() > 0.0f) {
                                sVar.n(true);
                            }
                            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7)) {
                                if (AndroidComposeViewAccessibilityDelegateCompat.p(jVar2)) {
                                    sVar.b(B0.s.a.f1419k);
                                    sVar.b(B0.s.a.f1426r);
                                }
                                if (AndroidComposeViewAccessibilityDelegateCompat.o(jVar2)) {
                                    sVar.b(B0.s.a.f1420l);
                                    sVar.b(B0.s.a.f1424p);
                                }
                            }
                        }
                        if (i13 >= 29) {
                            iVar3 = (androidx.compose.ui.semantics.i) SemanticsConfigurationKt.a(qVar7.f15242d, SemanticsProperties.f15169w);
                            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7)) {
                                if (iVar3 == null) {
                                    zA2 = false;
                                } else {
                                    zA2 = androidx.compose.ui.semantics.i.a(iVar3.f15203a, 8);
                                }
                                if (!zA2) {
                                    androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.a<Ia.a<Boolean>>> vVar9 = androidx.compose.ui.semantics.k.f15231x;
                                    androidx.compose.ui.semantics.l lVar4 = qVar7.f15242d;
                                    aVar7 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar4, vVar9);
                                    if (aVar7 != null) {
                                        sVar.b(new B0.s.a(android.R.id.accessibilityActionPageUp, aVar7.f15190a));
                                    }
                                    aVar8 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar4, androidx.compose.ui.semantics.k.f15233z);
                                    if (aVar8 != null) {
                                        sVar.b(new B0.s.a(android.R.id.accessibilityActionPageDown, aVar8.f15190a));
                                    }
                                    aVar9 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar4, androidx.compose.ui.semantics.k.f15232y);
                                    if (aVar9 != null) {
                                        sVar.b(new B0.s.a(android.R.id.accessibilityActionPageLeft, aVar9.f15190a));
                                    }
                                    aVar10 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar4, androidx.compose.ui.semantics.k.f15207A);
                                    if (aVar10 != null) {
                                        sVar.b(new B0.s.a(android.R.id.accessibilityActionPageRight, aVar10.f15190a));
                                    }
                                }
                            }
                        }
                        charSequence = (CharSequence) SemanticsConfigurationKt.a(qVar7.k(), SemanticsProperties.f15151d);
                        if (i13 >= 28) {
                            r10.setPaneTitle(charSequence);
                        } else {
                            r10.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7)) {
                            aVar4 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(qVar7.k(), androidx.compose.ui.semantics.k.f15226s);
                            if (aVar4 != null) {
                                sVar.b(new B0.s.a(262144, aVar4.f15190a));
                                p293xa.r rVar13 = p293xa.r.f47939a;
                            }
                            aVar5 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(qVar7.k(), androidx.compose.ui.semantics.k.f15227t);
                            if (aVar5 != null) {
                                sVar.b(new B0.s.a(524288, aVar5.f15190a));
                                p293xa.r rVar14 = p293xa.r.f47939a;
                            }
                            aVar6 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(qVar7.k(), androidx.compose.ui.semantics.k.f15228u);
                            if (aVar6 != null) {
                                sVar.b(new B0.s.a(1048576, aVar6.f15190a));
                                p293xa.r rVar15 = p293xa.r.f47939a;
                            }
                            lVarK = qVar7.k();
                            vVar = androidx.compose.ui.semantics.k.f15230w;
                            if (lVarK.f15234b.b(vVar)) {
                                list = (List) qVar7.k().q(vVar);
                                size4 = list.size();
                                a10 = AndroidComposeViewAccessibilityDelegateCompat.f14733M;
                                if (size4 < a10.f9184b) {
                                    throw new IllegalStateException(p005a4.q.c(new StringBuilder("Can't have more than "), a10.f9184b, " custom actions for one widget"));
                                }
                                y10 = new androidx.collection.Y<>(0);
                                hA = androidx.collection.P.a();
                                y11 = androidComposeViewAccessibilityDelegateCompat.f14763s;
                                if (y11.f9140b) {
                                    androidx.collection.Z.a(y11);
                                }
                                if (p233t.a.a(y11.f9143e, i11, y11.f9141c) >= 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    hC = y11.c(i11);
                                    a11 = new androidx.collection.A();
                                    iArr = a10.f9183a;
                                    i16 = a10.f9184b;
                                    for (i17 = 0; i17 < i16; i17++) {
                                        a11.c(iArr[i17]);
                                    }
                                    arrayList3 = new ArrayList();
                                    size6 = list.size();
                                    i18 = 0;
                                    r13 = r10;
                                    while (i18 < size6) {
                                        eVar = (androidx.compose.ui.semantics.e) list.get(i18);
                                        kotlin.jvm.internal.i.b(hC);
                                        int i42 = size6;
                                        if (hC.a(eVar.a()) >= 0) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (z13) {
                                            strA = eVar.a();
                                            iA = hC.a(strA);
                                            if (iA >= 0) {
                                                D9.o.s("There is no key " + ((Object) strA) + " in the map");
                                                throw null;
                                            }
                                            i20 = hC.f9105c[iA];
                                            y10.e(i20, eVar.a());
                                            hA.g(i20, eVar.a());
                                            iArr2 = a11.f9183a;
                                            i21 = a11.f9184b;
                                            i22 = 0;
                                            while (true) {
                                                if (i22 < i21) {
                                                    i22 = -1;
                                                    break;
                                                }
                                                i23 = i21;
                                                if (i20 == iArr2[i22]) {
                                                    break;
                                                }
                                                i22++;
                                                i21 = i23;
                                            }
                                            if (i22 >= 0) {
                                                a11.e(i22);
                                            }
                                            sVar.b(new B0.s.a(i20, eVar.a()));
                                        } else {
                                            arrayList3.add(eVar);
                                        }
                                        i18++;
                                        size6 = i42;
                                        hC = hC;
                                        r13 = r13;
                                        qVar7 = qVar7;
                                    }
                                    qVar3 = qVar7;
                                    r21 = r13;
                                    size7 = arrayList3.size();
                                    for (i19 = 0; i19 < size7; i19++) {
                                        androidx.compose.ui.semantics.e eVar2 = (androidx.compose.ui.semantics.e) arrayList3.get(i19);
                                        int iA2 = a11.a(i19);
                                        y10.e(iA2, eVar2.a());
                                        hA.g(iA2, eVar2.a());
                                        sVar.b(new B0.s.a(iA2, eVar2.a()));
                                    }
                                } else {
                                    qVar3 = qVar7;
                                    r21 = r10;
                                    size5 = list.size();
                                    for (i15 = 0; i15 < size5; i15++) {
                                        androidx.compose.ui.semantics.e eVar3 = (androidx.compose.ui.semantics.e) list.get(i15);
                                        int iA3 = a10.a(i15);
                                        y10.e(iA3, eVar3.a());
                                        hA.g(iA3, eVar3.a());
                                        sVar.b(new B0.s.a(iA3, eVar3.a()));
                                    }
                                }
                                androidComposeViewAccessibilityDelegateCompat.f14762r.e(i11, y10);
                                y11.e(i11, hA);
                                qVar7 = qVar3;
                                r20 = r21;
                            } else {
                                r20 = r10;
                            }
                        } else {
                            r20 = r10;
                        }
                        zH = AndroidComposeViewAccessibilityDelegateCompat_androidKt.h(qVar7, resources4);
                        if (Build.VERSION.SDK_INT >= 28) {
                            ?? r14 = r20;
                            r14.setScreenReaderFocusable(zH);
                            r12 = r14;
                        } else {
                            r11 = r20;
                            extras = r11.getExtras();
                            if (extras != null) {
                                r12 = r11;
                                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (zH ? 1 : 0) | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
                                r12 = r11;
                            }
                        }
                        r12 = r11;
                        iB = androidComposeViewAccessibilityDelegateCompat.f14735B.b(i11);
                        if (iB != -1) {
                            androidViewHolderG2 = K0.g(androidComposeView2.getAndroidViewsHandler$ui_release(), iB);
                            if (androidViewHolderG2 != null) {
                                r12.setTraversalBefore(androidViewHolderG2);
                                androidComposeView = androidComposeView2;
                            } else {
                                androidComposeView = androidComposeView2;
                                r12.setTraversalBefore(androidComposeView, iB);
                            }
                            androidComposeViewAccessibilityDelegateCompat.a(i11, sVar, androidComposeViewAccessibilityDelegateCompat.f14737D, null);
                        } else {
                            androidComposeView = androidComposeView2;
                        }
                        iB2 = androidComposeViewAccessibilityDelegateCompat.f14736C.b(i11);
                        if (iB2 != -1 && (androidViewHolderG = K0.g(androidComposeView.getAndroidViewsHandler$ui_release(), iB2)) != null) {
                            r12.setTraversalAfter(androidViewHolderG);
                            androidComposeViewAccessibilityDelegateCompat.a(i11, sVar, androidComposeViewAccessibilityDelegateCompat.f14738E, null);
                        }
                    } else {
                        i11 = i10;
                    }
                    i12 = 1;
                    r10.setVisibleToUser((K0.e(qVar7) ? 1 : 0) ^ i12);
                    if (((androidx.compose.ui.semantics.g) SemanticsConfigurationKt.a(lVar, SemanticsProperties.j)) != null) {
                        accessibilityNodeInfo2.setLiveRegion(i12);
                        p293xa.r rVar16 = p293xa.r.f47939a;
                    }
                    sVar.j(false);
                    androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.a<Ia.l<List<androidx.compose.ui.text.B>, Boolean>>> vVar10 = androidx.compose.ui.semantics.k.f15209a;
                    aVar = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15210b);
                    if (aVar != null) {
                        boolean zA7 = kotlin.jvm.internal.i.a(SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15141G), Boolean.TRUE);
                        if (iVar2 == null) {
                            zA4 = false;
                        } else {
                            zA4 = androidx.compose.ui.semantics.i.a(iVar2.f15203a, 4);
                        }
                        if (zA4) {
                            z18 = true;
                        } else {
                            if (iVar2 == null) {
                                zA5 = false;
                            } else {
                                zA5 = androidx.compose.ui.semantics.i.a(iVar2.f15203a, 3);
                            }
                            if (zA5) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                        }
                        if (z18) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        sVar.j(z19);
                        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7)) {
                            sVar.b(new B0.s.a(16, aVar.f15190a));
                        }
                        p293xa.r rVar17 = p293xa.r.f47939a;
                    }
                    r10.setLongClickable(false);
                    aVar2 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15211c);
                    if (aVar2 != null) {
                        r10.setLongClickable(true);
                        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7)) {
                            sVar.b(new B0.s.a(32, aVar2.f15190a));
                        }
                        p293xa.r rVar18 = p293xa.r.f47939a;
                    }
                    aVar3 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15223p);
                    if (aVar3 != null) {
                        sVar.b(new B0.s.a(16384, aVar3.f15190a));
                        p293xa.r rVar19 = p293xa.r.f47939a;
                    }
                    if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7)) {
                        aVar15 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.j);
                        if (aVar15 != null) {
                            sVar.b(new B0.s.a(2097152, aVar15.f15190a));
                            p293xa.r rVar20 = p293xa.r.f47939a;
                        }
                        aVar16 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15222o);
                        if (aVar16 != null) {
                            sVar.b(new B0.s.a(android.R.id.accessibilityActionImeEnter, aVar16.f15190a));
                            p293xa.r rVar110 = p293xa.r.f47939a;
                        }
                        aVar17 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15224q);
                        if (aVar17 != null) {
                            sVar.b(new B0.s.a(65536, aVar17.f15190a));
                            p293xa.r rVar111 = p293xa.r.f47939a;
                        }
                        aVar18 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15225r);
                        if (aVar18 != null) {
                            if (r10.isFocused()) {
                                primaryClipDescription = androidComposeView2.getClipboardManager().f15050a.getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    sVar.b(new B0.s.a(32768, aVar18.f15190a));
                                }
                            }
                            p293xa.r rVar112 = p293xa.r.f47939a;
                        }
                    }
                    strK = AndroidComposeViewAccessibilityDelegateCompat.k(qVar7);
                    if (strK != null) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        r10.setTextSelection(androidComposeViewAccessibilityDelegateCompat.i(qVar7), androidComposeViewAccessibilityDelegateCompat.h(qVar7));
                        aVar14 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15217i);
                        if (aVar14 != null) {
                            str = aVar14.f15190a;
                        } else {
                            str = null;
                        }
                        sVar.b(new B0.s.a(131072, str));
                        sVar.a(256);
                        sVar.a(512);
                        r10.setMovementGranularities(11);
                        list2 = (List) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15148a);
                        if (list2 != null) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (z16) {
                            if (lVar.f15234b.b(androidx.compose.ui.semantics.k.f15209a)) {
                                if (lVar.f15234b.b(SemanticsProperties.f15138D)) {
                                    layoutNodeB = AndroidComposeViewAccessibilityDelegateCompat_androidKt.b(qVar7.f15241c, new Ia.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
                                        /* JADX WARN: Code duplicated, block: B:9:0x0018  */
                                        @Override // Ia.l
                                        public final Boolean invoke(LayoutNode layoutNode) {
                                            boolean z22;
                                            androidx.compose.ui.semantics.l lVarF2 = layoutNode.f();
                                            if (lVarF2 != null) {
                                                if (lVarF2.f15236d) {
                                                    z22 = lVarF2.f15234b.b(SemanticsProperties.f15138D);
                                                }
                                            }
                                            return Boolean.valueOf(z22);
                                        }
                                    });
                                    if (layoutNodeB != null) {
                                        lVarF = layoutNodeB.f();
                                        if (lVarF != null) {
                                            zA3 = kotlin.jvm.internal.i.a(SemanticsConfigurationKt.a(lVarF, vVar7), Boolean.TRUE);
                                        } else {
                                            zA3 = false;
                                        }
                                        if (zA3) {
                                        }
                                    }
                                } else {
                                    layoutNodeB = AndroidComposeViewAccessibilityDelegateCompat_androidKt.b(qVar7.f15241c, new Ia.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
                                        /* JADX WARN: Code duplicated, block: B:9:0x0018  */
                                        @Override // Ia.l
                                        public final Boolean invoke(LayoutNode layoutNode) {
                                            boolean z22;
                                            androidx.compose.ui.semantics.l lVarF2 = layoutNode.f();
                                            if (lVarF2 != null) {
                                                if (lVarF2.f15236d) {
                                                    z22 = lVarF2.f15234b.b(SemanticsProperties.f15138D);
                                                }
                                            }
                                            return Boolean.valueOf(z22);
                                        }
                                    });
                                    if (layoutNodeB != null) {
                                        lVarF = layoutNodeB.f();
                                        if (lVarF != null) {
                                            zA3 = kotlin.jvm.internal.i.a(SemanticsConfigurationKt.a(lVarF, vVar7), Boolean.TRUE);
                                        } else {
                                            zA3 = false;
                                        }
                                        if (zA3) {
                                        }
                                    }
                                }
                                if (!z17) {
                                    r10.setMovementGranularities(r10.getMovementGranularities() | 20);
                                }
                            }
                        }
                    }
                    i13 = Build.VERSION.SDK_INT;
                    arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    charSequenceG = sVar.g();
                    if (charSequenceG != null) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        if (lVar.f15234b.b(androidx.compose.ui.semantics.k.f15209a)) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                    }
                    if (lVar.f15234b.b(SemanticsProperties.f15170x)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    r10.setAvailableExtraData(arrayList);
                    hVar = (androidx.compose.ui.semantics.h) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15150c);
                    if (hVar != null) {
                        vVar2 = androidx.compose.ui.semantics.k.f15216h;
                        if (lVar.f15234b.b(vVar2)) {
                            sVar.i("android.widget.SeekBar");
                        } else {
                            sVar.i("android.widget.ProgressBar");
                        }
                        hVar2 = androidx.compose.ui.semantics.h.f15199d;
                        f10 = hVar.f15200a;
                        dVar = hVar.f15201b;
                        if (hVar != hVar2) {
                            r10.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(dVar.f4685b).floatValue(), Float.valueOf(dVar.f4686c).floatValue(), f10));
                        }
                        if (lVar.f15234b.b(vVar2)) {
                            if (f10 < Na.l.x(Float.valueOf(dVar.f4686c).floatValue(), Float.valueOf(dVar.f4685b).floatValue())) {
                                sVar.b(B0.s.a.f1419k);
                            }
                            if (f10 > Na.l.z(Float.valueOf(dVar.f4685b).floatValue(), Float.valueOf(dVar.f4686c).floatValue())) {
                                sVar.b(B0.s.a.f1420l);
                            }
                        }
                    }
                    if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7)) {
                        sVar.b(new B0.s.a(android.R.id.accessibilityActionSetProgress, aVar13.f15190a));
                    }
                    bVar = (androidx.compose.ui.semantics.b) SemanticsConfigurationKt.a(qVar7.i(), SemanticsProperties.f15153f);
                    if (bVar != null) {
                        sVar.k(B0.s.e.a(bVar.f15192a, bVar.f15193b, 0));
                    } else {
                        arrayList2 = new ArrayList();
                        if (SemanticsConfigurationKt.a(qVar7.i(), SemanticsProperties.f15152e) != null) {
                            listH = androidx.compose.ui.semantics.q.h(qVar7, true, 4);
                            size3 = listH.size();
                            while (i14 < size3) {
                                qVar2 = (androidx.compose.ui.semantics.q) listH.get(i14);
                                if (qVar2.i().f15234b.b(SemanticsProperties.f15141G)) {
                                    arrayList2.add(qVar2);
                                }
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            zA = CollectionInfo_androidKt.a(arrayList2);
                            if (zA) {
                                size = 1;
                            } else {
                                size = arrayList2.size();
                            }
                            if (zA) {
                                size2 = arrayList2.size();
                            } else {
                                size2 = 1;
                            }
                            sVar.k(B0.s.e.a(size, size2, 0));
                        }
                    }
                    CollectionInfo_androidKt.b(qVar7, sVar);
                    jVar = (androidx.compose.ui.semantics.j) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15165s);
                    androidx.compose.ui.semantics.a aVar110 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar, androidx.compose.ui.semantics.k.f15212d);
                    if (jVar != null) {
                        if (SemanticsConfigurationKt.a(qVar7.i(), SemanticsProperties.f15153f) == null) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        if (!z15) {
                            sVar.i("android.widget.HorizontalScrollView");
                        }
                        if (jVar.a().invoke().floatValue() > 0.0f) {
                            sVar.n(true);
                        }
                        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7)) {
                            if (AndroidComposeViewAccessibilityDelegateCompat.p(jVar)) {
                                sVar.b(B0.s.a.f1419k);
                                if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.g(qVar7)) {
                                    aVar12 = B0.s.a.f1427s;
                                } else {
                                    aVar12 = B0.s.a.f1425q;
                                }
                                sVar.b(aVar12);
                            }
                            if (AndroidComposeViewAccessibilityDelegateCompat.o(jVar)) {
                                sVar.b(B0.s.a.f1420l);
                                if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.g(qVar7)) {
                                    aVar11 = B0.s.a.f1425q;
                                } else {
                                    aVar11 = B0.s.a.f1427s;
                                }
                                sVar.b(aVar11);
                            }
                        }
                    }
                    jVar2 = (androidx.compose.ui.semantics.j) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15166t);
                    if (jVar2 != null) {
                        if (SemanticsConfigurationKt.a(qVar7.i(), SemanticsProperties.f15153f) == null) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (!z14) {
                            sVar.i("android.widget.ScrollView");
                        }
                        if (jVar2.a().invoke().floatValue() > 0.0f) {
                            sVar.n(true);
                        }
                        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7)) {
                            if (AndroidComposeViewAccessibilityDelegateCompat.p(jVar2)) {
                                sVar.b(B0.s.a.f1419k);
                                sVar.b(B0.s.a.f1426r);
                            }
                            if (AndroidComposeViewAccessibilityDelegateCompat.o(jVar2)) {
                                sVar.b(B0.s.a.f1420l);
                                sVar.b(B0.s.a.f1424p);
                            }
                        }
                    }
                    if (i13 >= 29) {
                        iVar3 = (androidx.compose.ui.semantics.i) SemanticsConfigurationKt.a(qVar7.f15242d, SemanticsProperties.f15169w);
                        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7)) {
                            if (iVar3 == null) {
                                zA2 = false;
                            } else {
                                zA2 = androidx.compose.ui.semantics.i.a(iVar3.f15203a, 8);
                            }
                            if (!zA2) {
                                androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.a<Ia.a<Boolean>>> vVar11 = androidx.compose.ui.semantics.k.f15231x;
                                androidx.compose.ui.semantics.l lVar5 = qVar7.f15242d;
                                aVar7 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar5, vVar11);
                                if (aVar7 != null) {
                                    sVar.b(new B0.s.a(android.R.id.accessibilityActionPageUp, aVar7.f15190a));
                                }
                                aVar8 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar5, androidx.compose.ui.semantics.k.f15233z);
                                if (aVar8 != null) {
                                    sVar.b(new B0.s.a(android.R.id.accessibilityActionPageDown, aVar8.f15190a));
                                }
                                aVar9 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar5, androidx.compose.ui.semantics.k.f15232y);
                                if (aVar9 != null) {
                                    sVar.b(new B0.s.a(android.R.id.accessibilityActionPageLeft, aVar9.f15190a));
                                }
                                aVar10 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(lVar5, androidx.compose.ui.semantics.k.f15207A);
                                if (aVar10 != null) {
                                    sVar.b(new B0.s.a(android.R.id.accessibilityActionPageRight, aVar10.f15190a));
                                }
                            }
                        }
                    }
                    charSequence = (CharSequence) SemanticsConfigurationKt.a(qVar7.k(), SemanticsProperties.f15151d);
                    if (i13 >= 28) {
                        r10.setPaneTitle(charSequence);
                    } else {
                        r10.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                    }
                    if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar7)) {
                        r20 = r10;
                    } else {
                        aVar4 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(qVar7.k(), androidx.compose.ui.semantics.k.f15226s);
                        if (aVar4 != null) {
                            sVar.b(new B0.s.a(262144, aVar4.f15190a));
                            p293xa.r rVar113 = p293xa.r.f47939a;
                        }
                        aVar5 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(qVar7.k(), androidx.compose.ui.semantics.k.f15227t);
                        if (aVar5 != null) {
                            sVar.b(new B0.s.a(524288, aVar5.f15190a));
                            p293xa.r rVar114 = p293xa.r.f47939a;
                        }
                        aVar6 = (androidx.compose.ui.semantics.a) SemanticsConfigurationKt.a(qVar7.k(), androidx.compose.ui.semantics.k.f15228u);
                        if (aVar6 != null) {
                            sVar.b(new B0.s.a(1048576, aVar6.f15190a));
                            p293xa.r rVar115 = p293xa.r.f47939a;
                        }
                        lVarK = qVar7.k();
                        vVar = androidx.compose.ui.semantics.k.f15230w;
                        if (lVarK.f15234b.b(vVar)) {
                            list = (List) qVar7.k().q(vVar);
                            size4 = list.size();
                            a10 = AndroidComposeViewAccessibilityDelegateCompat.f14733M;
                            if (size4 < a10.f9184b) {
                                throw new IllegalStateException(p005a4.q.c(new StringBuilder("Can't have more than "), a10.f9184b, " custom actions for one widget"));
                            }
                            y10 = new androidx.collection.Y<>(0);
                            hA = androidx.collection.P.a();
                            y11 = androidComposeViewAccessibilityDelegateCompat.f14763s;
                            if (y11.f9140b) {
                                androidx.collection.Z.a(y11);
                            }
                            if (p233t.a.a(y11.f9143e, i11, y11.f9141c) >= 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                hC = y11.c(i11);
                                a11 = new androidx.collection.A();
                                iArr = a10.f9183a;
                                i16 = a10.f9184b;
                                while (i17 < i16) {
                                    a11.c(iArr[i17]);
                                }
                                arrayList3 = new ArrayList();
                                size6 = list.size();
                                i18 = 0;
                                r13 = r10;
                                while (i18 < size6) {
                                    eVar = (androidx.compose.ui.semantics.e) list.get(i18);
                                    kotlin.jvm.internal.i.b(hC);
                                    int i43 = size6;
                                    if (hC.a(eVar.a()) >= 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        strA = eVar.a();
                                        iA = hC.a(strA);
                                        if (iA >= 0) {
                                            D9.o.s("There is no key " + ((Object) strA) + " in the map");
                                            throw null;
                                        }
                                        i20 = hC.f9105c[iA];
                                        y10.e(i20, eVar.a());
                                        hA.g(i20, eVar.a());
                                        iArr2 = a11.f9183a;
                                        i21 = a11.f9184b;
                                        i22 = 0;
                                        while (true) {
                                            if (i22 < i21) {
                                                i22 = -1;
                                                break;
                                            }
                                            i23 = i21;
                                            if (i20 == iArr2[i22]) {
                                                break;
                                                break;
                                            }
                                            i22++;
                                            i21 = i23;
                                        }
                                        if (i22 >= 0) {
                                            a11.e(i22);
                                        }
                                        sVar.b(new B0.s.a(i20, eVar.a()));
                                    } else {
                                        arrayList3.add(eVar);
                                    }
                                    i18++;
                                    size6 = i43;
                                    hC = hC;
                                    r13 = r13;
                                    qVar7 = qVar7;
                                }
                                qVar3 = qVar7;
                                r21 = r13;
                                size7 = arrayList3.size();
                                while (i19 < size7) {
                                    androidx.compose.ui.semantics.e eVar4 = (androidx.compose.ui.semantics.e) arrayList3.get(i19);
                                    int iA4 = a11.a(i19);
                                    y10.e(iA4, eVar4.a());
                                    hA.g(iA4, eVar4.a());
                                    sVar.b(new B0.s.a(iA4, eVar4.a()));
                                }
                            } else {
                                qVar3 = qVar7;
                                r21 = r10;
                                size5 = list.size();
                                while (i15 < size5) {
                                    androidx.compose.ui.semantics.e eVar5 = (androidx.compose.ui.semantics.e) list.get(i15);
                                    int iA5 = a10.a(i15);
                                    y10.e(iA5, eVar5.a());
                                    hA.g(iA5, eVar5.a());
                                    sVar.b(new B0.s.a(iA5, eVar5.a()));
                                }
                            }
                            androidComposeViewAccessibilityDelegateCompat.f14762r.e(i11, y10);
                            y11.e(i11, hA);
                            qVar7 = qVar3;
                            r20 = r21;
                        } else {
                            r20 = r10;
                        }
                    }
                    zH = AndroidComposeViewAccessibilityDelegateCompat_androidKt.h(qVar7, resources4);
                    if (Build.VERSION.SDK_INT >= 28) {
                        ?? r15 = r20;
                        r15.setScreenReaderFocusable(zH);
                        r12 = r15;
                    } else {
                        r11 = r20;
                        extras = r11.getExtras();
                        if (extras != null) {
                            r12 = r11;
                            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (zH ? 1 : 0) | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
                            r12 = r11;
                        }
                    }
                    r12 = r11;
                    iB = androidComposeViewAccessibilityDelegateCompat.f14735B.b(i11);
                    if (iB != -1) {
                        androidViewHolderG2 = K0.g(androidComposeView2.getAndroidViewsHandler$ui_release(), iB);
                        if (androidViewHolderG2 != null) {
                            r12.setTraversalBefore(androidViewHolderG2);
                            androidComposeView = androidComposeView2;
                        } else {
                            androidComposeView = androidComposeView2;
                            r12.setTraversalBefore(androidComposeView, iB);
                        }
                        androidComposeViewAccessibilityDelegateCompat.a(i11, sVar, androidComposeViewAccessibilityDelegateCompat.f14737D, null);
                    } else {
                        androidComposeView = androidComposeView2;
                    }
                    iB2 = androidComposeViewAccessibilityDelegateCompat.f14736C.b(i11);
                    if (iB2 != -1) {
                        r12.setTraversalAfter(androidViewHolderG);
                        androidComposeViewAccessibilityDelegateCompat.a(i11, sVar, androidComposeViewAccessibilityDelegateCompat.f14738E, null);
                    }
                }
            }
            if (androidComposeViewAccessibilityDelegateCompat.f14759o) {
                if (i11 == androidComposeViewAccessibilityDelegateCompat.f14755k) {
                    androidComposeViewAccessibilityDelegateCompat.f14757m = sVar;
                }
                if (i11 == androidComposeViewAccessibilityDelegateCompat.f14756l) {
                    androidComposeViewAccessibilityDelegateCompat.f14758n = sVar;
                }
            }
            return sVar;
        }

        @Override // B0.t
        public final B0.s c(int i10) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            if (i10 != 1) {
                if (i10 == 2) {
                    return b(androidComposeViewAccessibilityDelegateCompat.f14755k);
                }
                throw new IllegalArgumentException(J4.i.b(i10, "Unknown focus type: "));
            }
            int i11 = androidComposeViewAccessibilityDelegateCompat.f14756l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:167:0x0320  */
        /* JADX WARN: Code duplicated, block: B:169:0x0324  */
        /* JADX WARN: Code duplicated, block: B:170:0x0326  */
        /* JADX WARN: Code duplicated, block: B:173:0x032b  */
        /* JADX WARN: Code duplicated, block: B:174:0x032d  */
        /* JADX WARN: Code duplicated, block: B:177:0x0333  */
        /* JADX WARN: Code duplicated, block: B:178:0x0335  */
        /* JADX WARN: Code duplicated, block: B:181:0x033b  */
        /* JADX WARN: Code duplicated, block: B:182:0x033d  */
        /* JADX WARN: Code duplicated, block: B:185:0x0343  */
        /* JADX WARN: Code duplicated, block: B:186:0x0345  */
        /* JADX WARN: Code duplicated, block: B:189:0x034b  */
        /* JADX WARN: Code duplicated, block: B:190:0x034d  */
        /* JADX WARN: Code duplicated, block: B:197:0x0359  */
        /* JADX WARN: Code duplicated, block: B:204:0x0365  */
        /* JADX WARN: Code duplicated, block: B:207:0x036a  */
        /* JADX WARN: Code duplicated, block: B:209:0x037c A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:212:0x03b2  */
        /* JADX WARN: Code duplicated, block: B:214:0x03b7  */
        /* JADX WARN: Code duplicated, block: B:216:0x03be  */
        /* JADX WARN: Code duplicated, block: B:219:0x03c5  */
        /* JADX WARN: Code duplicated, block: B:227:0x040f  */
        /* JADX WARN: Code duplicated, block: B:231:0x041c  */
        /* JADX WARN: Code duplicated, block: B:266:0x04ab  */
        /* JADX WARN: Code duplicated, block: B:268:0x04b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:270:0x04b9  */
        /* JADX WARN: Code duplicated, block: B:271:0x04be  */
        /* JADX WARN: Code duplicated, block: B:273:0x04cb A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:274:0x04cd  */
        /* JADX WARN: Code duplicated, block: B:277:0x04d2  */
        /* JADX WARN: Code duplicated, block: B:280:0x04d9  */
        /* JADX WARN: Code duplicated, block: B:282:0x04e1  */
        /* JADX WARN: Code duplicated, block: B:284:0x04e9  */
        /* JADX WARN: Code duplicated, block: B:290:0x0508  */
        /* JADX WARN: Code duplicated, block: B:291:0x0511  */
        /* JADX WARN: Code duplicated, block: B:293:0x0519  */
        /* JADX WARN: Code duplicated, block: B:366:0x0648  */
        /* JADX WARN: Code duplicated, block: B:372:0x0662  */
        /* JADX WARN: Code duplicated, block: B:379:0x0674  */
        /* JADX WARN: Code duplicated, block: B:381:0x0678  */
        /* JADX WARN: Code duplicated, block: B:384:0x068d  */
        /* JADX WARN: Code duplicated, block: B:386:0x0691  */
        /* JADX WARN: Code duplicated, block: B:509:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:528:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:98:0x01c4  */
        /* JADX WARN: Code restructure failed: missing block: B:457:0x0170, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Type inference failed for: r0v186, types: [Ia.a, kotlin.jvm.internal.Lambda] */
        @Override // B0.t
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean d(int r20, int r21, android.os.Bundle r22) {
            /*
                Method dump skipped, instruction units count: 2074
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.c.d(int, int, android.os.Bundle):boolean");
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.compose.ui.semantics.q f14773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f14774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f14775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f14776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f14777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f14778f;

        public d(androidx.compose.ui.semantics.q qVar, int i10, int i11, int i12, int i13, long j) {
            this.f14773a = qVar;
            this.f14774b = i10;
            this.f14775c = i11;
            this.f14776d = i12;
            this.f14777e = i13;
            this.f14778f = j;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.platform.o] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.platform.p] */
    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.f14746a = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f14749d = accessibilityManager;
        this.f14750e = 100L;
        this.f14751f = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.o
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f15073b;
                androidComposeViewAccessibilityDelegateCompat.f14753h = z10 ? androidComposeViewAccessibilityDelegateCompat.f14749d.getEnabledAccessibilityServiceList(-1) : EmptyList.f42983b;
            }
        };
        this.f14752g = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.p
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f15082a;
                androidComposeViewAccessibilityDelegateCompat.f14753h = androidComposeViewAccessibilityDelegateCompat.f14749d.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f14753h = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f14754i = new Handler(Looper.getMainLooper());
        this.j = new c();
        this.f14755k = Integer.MIN_VALUE;
        this.f14756l = Integer.MIN_VALUE;
        this.f14760p = new androidx.collection.B<>();
        this.f14761q = new androidx.collection.B<>();
        this.f14762r = new androidx.collection.Y<>(0);
        this.f14763s = new androidx.collection.Y<>(0);
        this.f14764t = -1;
        this.f14766v = new C0874b<>(0);
        this.f14767w = kotlinx.coroutines.channels.g.a(1, 6, null);
        this.f14768x = true;
        androidx.collection.B b10 = C0884l.f9191a;
        kotlin.jvm.internal.i.c(b10, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f14770z = b10;
        this.f14734A = new androidx.collection.C((Object) null);
        this.f14735B = new C0897z();
        this.f14736C = new C0897z();
        this.f14737D = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f14738E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f14739F = new androidx.compose.ui.text.platform.h();
        this.f14740G = new androidx.collection.B<>();
        androidx.compose.ui.semantics.q qVarA = androidComposeView.getSemanticsOwner().a();
        kotlin.jvm.internal.i.c(b10, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f14741H = new I0(qVarA, b10);
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.f14743J = new RunnableC1240q(0, this);
        this.f14744K = new ArrayList();
        this.f14745L = new Ia.l<H0, p293xa.r>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(H0 h8) {
                H0 h10 = h8;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.this$0;
                androidx.collection.A a10 = AndroidComposeViewAccessibilityDelegateCompat.f14733M;
                androidComposeViewAccessibilityDelegateCompat.getClass();
                if (h10.f14918c.contains(h10)) {
                    androidComposeViewAccessibilityDelegateCompat.f14746a.getSnapshotObserver().b(h10, androidComposeViewAccessibilityDelegateCompat.f14745L, new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(h10, androidComposeViewAccessibilityDelegateCompat));
                }
                return p293xa.r.f47939a;
            }
        };
    }

    public static CharSequence B(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i10 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i10 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i10);
                kotlin.jvm.internal.i.c(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String k(androidx.compose.ui.semantics.q qVar) {
        C1260a c1260a;
        if (qVar == null) {
            return null;
        }
        androidx.compose.ui.semantics.v<List<String>> vVar = SemanticsProperties.f15148a;
        androidx.compose.ui.semantics.l lVar = qVar.f15242d;
        androidx.collection.K<androidx.compose.ui.semantics.v<?>, Object> k10 = lVar.f15234b;
        if (k10.b(vVar)) {
            return p039d0.a.b((List) lVar.q(vVar), ",", null, 62);
        }
        androidx.compose.ui.semantics.v<C1260a> vVar2 = SemanticsProperties.f15138D;
        if (k10.b(vVar2)) {
            C1260a c1260a2 = (C1260a) SemanticsConfigurationKt.a(lVar, vVar2);
            if (c1260a2 != null) {
                return c1260a2.f15408c;
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15172z);
        if (list == null || (c1260a = (C1260a) kotlin.collections.q.P(list)) == null) {
            return null;
        }
        return c1260a.f15408c;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r3v2, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    public static final boolean n(androidx.compose.ui.semantics.j jVar, float f10) {
        ?? r10 = jVar.f15204a;
        return (f10 < 0.0f && ((Number) r10.invoke()).floatValue() > 0.0f) || (f10 > 0.0f && ((Number) r10.invoke()).floatValue() < ((Number) jVar.f15205b.invoke()).floatValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r3v1, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    public static final boolean o(androidx.compose.ui.semantics.j jVar) {
        ?? r10 = jVar.f15204a;
        float fFloatValue = ((Number) r10.invoke()).floatValue();
        boolean z10 = jVar.f15206c;
        return (fFloatValue > 0.0f && !z10) || (((Number) r10.invoke()).floatValue() < ((Number) jVar.f15205b.invoke()).floatValue() && z10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    public static final boolean p(androidx.compose.ui.semantics.j jVar) {
        ?? r10 = jVar.f15204a;
        float fFloatValue = ((Number) r10.invoke()).floatValue();
        float fFloatValue2 = ((Number) jVar.f15205b.invoke()).floatValue();
        boolean z10 = jVar.f15206c;
        return (fFloatValue < fFloatValue2 && !z10) || (((Number) r10.invoke()).floatValue() > 0.0f && z10);
    }

    public static /* synthetic */ void u(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        androidComposeViewAccessibilityDelegateCompat.t(i10, i11, num, null);
    }

    public final boolean A(androidx.compose.ui.semantics.q qVar, int i10, int i11, boolean z10) {
        String strK;
        androidx.compose.ui.semantics.l lVar = qVar.f15242d;
        androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.a<Ia.q<Integer, Integer, Boolean, Boolean>>> vVar = androidx.compose.ui.semantics.k.f15217i;
        if (lVar.f15234b.b(vVar) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(qVar)) {
            Ia.q qVar2 = (Ia.q) ((androidx.compose.ui.semantics.a) qVar.f15242d.q(vVar)).f15191b;
            if (qVar2 != null) {
                return ((Boolean) qVar2.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
            return false;
        }
        if ((i10 == i11 && i11 == this.f14764t) || (strK = k(qVar)) == null) {
            return false;
        }
        if (i10 < 0 || i10 != i11 || i11 > strK.length()) {
            i10 = -1;
        }
        this.f14764t = i10;
        boolean z11 = strK.length() > 0;
        int i12 = qVar.f15245g;
        s(g(q(i12), z11 ? Integer.valueOf(this.f14764t) : null, z11 ? Integer.valueOf(this.f14764t) : null, z11 ? Integer.valueOf(strK.length()) : null, strK));
        w(i12);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:25:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x008a A[LOOP:0: B:5:0x001e->B:26:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x0093 A[EDGE_INSN: B:84:0x0093->B:27:0x0093 BREAK  A[LOOP:0: B:5:0x001e->B:26:0x008a], SYNTHETIC] */
    public final void C() {
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i10;
        int[] iArr2;
        int i11;
        int iNumberOfTrailingZeros;
        I0 i0B;
        String str;
        androidx.collection.C c10 = new androidx.collection.C((Object) null);
        androidx.collection.C c11 = this.f14734A;
        int[] iArr3 = c11.f9193b;
        long[] jArr3 = c11.f9192a;
        int length = jArr3.length - 2;
        androidx.collection.B<I0> b10 = this.f14740G;
        char c12 = 7;
        long j = -9187201950435737472L;
        int i12 = 8;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j10 = jArr3[i13];
                if ((((~j10) << c12) & j10 & j) != j) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j10 & 255) < 128) {
                            int i16 = iArr3[(i13 << 3) + i15];
                            J0 j0B = j().b(i16);
                            androidx.compose.ui.semantics.q qVar = j0B != null ? j0B.f14934a : null;
                            if (qVar == null) {
                                c10.b(i16);
                                i0B = b10.b(i16);
                                if (i0B != null) {
                                    str = (String) SemanticsConfigurationKt.a(i0B.f14927a, SemanticsProperties.f15151d);
                                } else {
                                    str = null;
                                }
                                v(str, i16, 32);
                            } else if (!qVar.f15242d.f15234b.b(SemanticsProperties.f15151d)) {
                                c10.b(i16);
                                i0B = b10.b(i16);
                                if (i0B != null) {
                                    str = (String) SemanticsConfigurationKt.a(i0B.f14927a, SemanticsProperties.f15151d);
                                } else {
                                    str = null;
                                }
                                v(str, i16, 32);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                    c12 = 7;
                    j = -9187201950435737472L;
                } else if (i13 != length) {
                    break;
                    break;
                } else {
                    i13++;
                    c12 = 7;
                    j = -9187201950435737472L;
                }
            }
        }
        int[] iArr4 = c10.f9193b;
        long[] jArr4 = c10.f9192a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i17 = 0;
            while (true) {
                long j11 = jArr4[i17];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j11 & 255) < 128) {
                            int i20 = iArr4[(i17 << 3) + i19];
                            int iHashCode = Integer.hashCode(i20) * (-862048943);
                            int i21 = iHashCode ^ (iHashCode << 16);
                            int i22 = i21 & 127;
                            int i23 = c11.f9194c;
                            int i24 = (i21 >>> 7) & i23;
                            int i25 = 0;
                            while (true) {
                                long[] jArr5 = c11.f9192a;
                                int i26 = i24 >> 3;
                                jArr2 = jArr4;
                                int i27 = (i24 & 7) << 3;
                                long j12 = (jArr5[i26] >>> i27) | ((jArr5[i26 + 1] << (64 - i27)) & ((-i27) >> 63));
                                iArr2 = iArr4;
                                i11 = length2;
                                long j13 = (((long) i22) * 72340172838076673L) ^ j12;
                                long j14 = (j13 - 72340172838076673L) & (~j13) & (-9187201950435737472L);
                                while (j14 != 0) {
                                    iNumberOfTrailingZeros = (i24 + (Long.numberOfTrailingZeros(j14) >> 3)) & i23;
                                    int i28 = i22;
                                    if (c11.f9193b[iNumberOfTrailingZeros] == i20) {
                                        break;
                                    }
                                    j14 &= j14 - 1;
                                    i22 = i28;
                                }
                                int i29 = i22;
                                if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i25 += 8;
                                i24 = (i24 + i25) & i23;
                                iArr4 = iArr2;
                                length2 = i11;
                                jArr4 = jArr2;
                                i22 = i29;
                            }
                            int i30 = iNumberOfTrailingZeros;
                            if (i30 >= 0) {
                                c11.f(i30);
                            }
                            i10 = 8;
                        } else {
                            jArr2 = jArr4;
                            i10 = i12;
                            iArr2 = iArr4;
                            i11 = length2;
                        }
                        j11 >>= i10;
                        i19++;
                        i12 = i10;
                        iArr4 = iArr2;
                        length2 = i11;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    iArr = iArr4;
                    int i31 = length2;
                    if (i18 != i12) {
                        break;
                    } else {
                        length2 = i31;
                    }
                } else {
                    jArr = jArr4;
                    iArr = iArr4;
                }
                if (i17 == length2) {
                    break;
                }
                i17++;
                iArr4 = iArr;
                jArr4 = jArr;
                i12 = 8;
            }
        }
        b10.c();
        AbstractC0883k<J0> abstractC0883kJ = j();
        int[] iArr5 = abstractC0883kJ.f9187b;
        Object[] objArr = abstractC0883kJ.f9188c;
        long[] jArr6 = abstractC0883kJ.f9186a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i32 = 0;
            while (true) {
                long j15 = jArr6[i32];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i33 = 8 - ((~(i32 - length3)) >>> 31);
                    for (int i34 = 0; i34 < i33; i34++) {
                        if ((j15 & 255) < 128) {
                            int i35 = (i32 << 3) + i34;
                            int i36 = iArr5[i35];
                            J0 j16 = (J0) objArr[i35];
                            androidx.compose.ui.semantics.l lVar = j16.f14934a.f15242d;
                            androidx.compose.ui.semantics.v<String> vVar = SemanticsProperties.f15151d;
                            boolean zB = lVar.f15234b.b(vVar);
                            androidx.compose.ui.semantics.q qVar2 = j16.f14934a;
                            if (zB && c11.b(i36)) {
                                v((String) qVar2.f15242d.q(vVar), i36, 16);
                            }
                            b10.h(i36, new I0(qVar2, j()));
                        }
                        j15 >>= 8;
                    }
                    if (i33 != 8) {
                        break;
                    }
                }
                if (i32 == length3) {
                    break;
                } else {
                    i32++;
                }
            }
        }
        this.f14741H = new I0(this.f14746a.getSemanticsOwner().a(), j());
    }

    public final void a(int i10, B0.s sVar, String str, Bundle bundle) {
        androidx.compose.ui.semantics.q qVar;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
        J0 j0B = j().b(i10);
        if (j0B == null || (qVar = j0B.f14934a) == null) {
            return;
        }
        String strK = k(qVar);
        boolean zA = kotlin.jvm.internal.i.a(str, androidComposeViewAccessibilityDelegateCompat.f14737D);
        AccessibilityNodeInfo accessibilityNodeInfo = sVar.f1411a;
        if (zA) {
            int iB = androidComposeViewAccessibilityDelegateCompat.f14735B.b(i10);
            if (iB != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iB);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.i.a(str, androidComposeViewAccessibilityDelegateCompat.f14738E)) {
            int iB2 = androidComposeViewAccessibilityDelegateCompat.f14736C.b(i10);
            if (iB2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iB2);
                return;
            }
            return;
        }
        androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.a<Ia.l<List<androidx.compose.ui.text.B>, Boolean>>> vVar = androidx.compose.ui.semantics.k.f15209a;
        androidx.compose.ui.semantics.l lVar = qVar.f15242d;
        androidx.collection.K<androidx.compose.ui.semantics.v<?>, Object> k10 = lVar.f15234b;
        if (!k10.b(vVar) || bundle == null || !kotlin.jvm.internal.i.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            androidx.compose.ui.semantics.v<String> vVar2 = SemanticsProperties.f15170x;
            if (!k10.b(vVar2) || bundle == null || !kotlin.jvm.internal.i.a(str, "androidx.compose.ui.semantics.testTag")) {
                if (kotlin.jvm.internal.i.a(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, qVar.f15245g);
                    return;
                }
                return;
            } else {
                String str2 = (String) SemanticsConfigurationKt.a(lVar, vVar2);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i12 > 0 && i11 >= 0) {
            if (i11 < (strK != null ? strK.length() : BrazeLogger.SUPPRESS)) {
                androidx.compose.ui.text.B bD = K0.d(lVar);
                if (bD == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i13 = 0;
                while (i13 < i12) {
                    int i14 = i11 + i13;
                    RectF rectF = null;
                    if (i14 >= bD.f15300a.f15276a.f15408c.length()) {
                        arrayList.add(null);
                        i11 = i11;
                        i13 = i13;
                    } else {
                        I.f fVarB = bD.b(i14);
                        NodeCoordinator nodeCoordinatorC = qVar.c();
                        long jG0 = 0;
                        if (nodeCoordinatorC != null) {
                            if (!nodeCoordinatorC.v1().f13997o) {
                                nodeCoordinatorC = null;
                            }
                            if (nodeCoordinatorC != null) {
                                jG0 = nodeCoordinatorC.g0(0L);
                            }
                        }
                        I.f fVarH = fVarB.h(jG0);
                        I.f fVarE = qVar.e();
                        I.f fVarD = fVarH.f(fVarE) ? fVarH.d(fVarE) : null;
                        if (fVarD != null) {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fVarD.f3757a)) << 32) | (((long) Float.floatToRawIntBits(fVarD.f3758b)) & 4294967295L);
                            AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.f14746a;
                            long jB = androidComposeView.B(jFloatToRawIntBits);
                            long jB2 = androidComposeView.B((((long) Float.floatToRawIntBits(fVarD.f3760d)) & 4294967295L) | (((long) Float.floatToRawIntBits(fVarD.f3759c)) << 32));
                            rectF = new RectF(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jB & 4294967295L)), Float.intBitsToFloat((int) (jB2 >> 32)), Float.intBitsToFloat((int) (jB2 & 4294967295L)));
                        }
                        arrayList.add(rectF);
                    }
                    i13++;
                    androidComposeViewAccessibilityDelegateCompat = this;
                    i11 = i11;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect b(J0 j10) {
        Rect rect = j10.f14935b;
        float f10 = rect.left;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(rect.top)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        AndroidComposeView androidComposeView = this.f14746a;
        long jB = androidComposeView.B(jFloatToRawIntBits);
        long jB2 = androidComposeView.B((((long) Float.floatToRawIntBits(rect.right)) << 32) | (((long) Float.floatToRawIntBits(rect.bottom)) & 4294967295L));
        return new Rect((int) Math.floor(Float.intBitsToFloat((int) (jB >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (jB & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (jB2 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (jB2 & 4294967295L))));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0036, B:25:0x006c, B:29:0x0081, B:31:0x0089, B:34:0x0094, B:36:0x009a, B:37:0x00a9, B:39:0x00b1, B:40:0x00cd, B:42:0x00dc, B:45:0x00ea, B:20:0x0054), top: B:58:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0036, B:25:0x006c, B:29:0x0081, B:31:0x0089, B:34:0x0094, B:36:0x009a, B:37:0x00a9, B:39:0x00b1, B:40:0x00cd, B:42:0x00dc, B:45:0x00ea, B:20:0x0054), top: B:58:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x009a A[Catch: all -> 0x003d, LOOP:0: B:35:0x0098->B:36:0x009a, LOOP_END, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0036, B:25:0x006c, B:29:0x0081, B:31:0x0089, B:34:0x0094, B:36:0x009a, B:37:0x00a9, B:39:0x00b1, B:40:0x00cd, B:42:0x00dc, B:45:0x00ea, B:20:0x0054), top: B:58:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0036, B:25:0x006c, B:29:0x0081, B:31:0x0089, B:34:0x0094, B:36:0x009a, B:37:0x00a9, B:39:0x00b1, B:40:0x00cd, B:42:0x00dc, B:45:0x00ea, B:20:0x0054), top: B:58:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0036, B:25:0x006c, B:29:0x0081, B:31:0x0089, B:34:0x0094, B:36:0x009a, B:37:0x00a9, B:39:0x00b1, B:40:0x00cd, B:42:0x00dc, B:45:0x00ea, B:20:0x0054), top: B:58:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:47:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0106 -> B:48:0x0109). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ea A[DONT_INVERT, PHI: r10
      0x00ea: PHI (r10v2 boolean) = (r10v1 boolean), (r10v4 boolean) binds: [B:18:0x0064, B:48:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec A[LOOP:0: B:17:0x0056->B:50:0x00ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2 A[EDGE_INSN: B:57:0x00f2->B:51:0x00f2 BREAK  A[LOOP:0: B:17:0x0056->B:50:0x00ec], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v17, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r6v14, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    public final boolean d(int i10, long j, boolean z10) {
        androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.j> vVar;
        int i11;
        androidx.compose.ui.semantics.j jVar;
        int i12 = 0;
        if (!kotlin.jvm.internal.i.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        AbstractC0883k<J0> abstractC0883kJ = j();
        if (!I.d.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
            if (z10) {
                vVar = SemanticsProperties.f15166t;
            } else {
                if (z10) {
                    throw new NoWhenBranchMatchedException();
                }
                vVar = SemanticsProperties.f15165s;
            }
            Object[] objArr = abstractC0883kJ.f9188c;
            long[] jArr = abstractC0883kJ.f9186a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                boolean z11 = false;
                while (true) {
                    long j10 = jArr[i13];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i13 != length) {
                            break;
                            break;
                        }
                        i13++;
                        i12 = 0;
                    } else {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = i12;
                        while (i16 < i15) {
                            if ((j10 & 255) < 128) {
                                J0 j11 = (J0) objArr[(i13 << 3) + i16];
                                if (androidx.compose.ui.graphics.g0.d(j11.f14935b).a(j) && (jVar = (androidx.compose.ui.semantics.j) SemanticsConfigurationKt.a(j11.f14934a.f15242d, vVar)) != null) {
                                    boolean z12 = jVar.f15206c;
                                    int i17 = z12 ? -i10 : i10;
                                    if (i10 == 0 && z12) {
                                        i17 = -1;
                                    }
                                    ?? r10 = jVar.f15204a;
                                    if (i17 >= 0 ? ((Number) r10.invoke()).floatValue() < ((Number) jVar.f15205b.invoke()).floatValue() : ((Number) r10.invoke()).floatValue() > 0.0f) {
                                        z11 = true;
                                    }
                                }
                                i11 = 8;
                            } else {
                                i11 = i14;
                            }
                            j10 >>= i11;
                            i16++;
                            i14 = i11;
                        }
                        if (i15 != i14) {
                            break;
                        }
                        if (i13 != length) {
                            break;
                        }
                        i13++;
                        i12 = 0;
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public final void e() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (l()) {
                r(this.f14746a.getSemanticsOwner().a(), this.f14741H);
            }
            p293xa.r rVar = p293xa.r.f47939a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                x(j());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    C();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent f(int i10, int i11) {
        J0 j0B;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.f14746a;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i10);
        if (l() && (j0B = j().b(i10)) != null) {
            accessibilityEventObtain.setPassword(j0B.f14934a.f15242d.f15234b.b(SemanticsProperties.f15143I));
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent g(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventF = f(i10, 8192);
        if (num != null) {
            accessibilityEventF.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventF.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventF.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventF.getText().add(charSequence);
        }
        return accessibilityEventF;
    }

    @Override // androidx.core.view.C1286a
    public final B0.t getAccessibilityNodeProvider(View view) {
        return this.j;
    }

    public final int h(androidx.compose.ui.semantics.q qVar) {
        androidx.compose.ui.semantics.l lVar = qVar.f15242d;
        androidx.compose.ui.semantics.v<List<String>> vVar = SemanticsProperties.f15148a;
        if (!lVar.f15234b.b(SemanticsProperties.f15148a)) {
            androidx.compose.ui.semantics.v<androidx.compose.ui.text.E> vVar2 = SemanticsProperties.f15139E;
            androidx.compose.ui.semantics.l lVar2 = qVar.f15242d;
            if (lVar2.f15234b.b(vVar2)) {
                return (int) (4294967295L & ((androidx.compose.ui.text.E) lVar2.q(vVar2)).f15316a);
            }
        }
        return this.f14764t;
    }

    public final int i(androidx.compose.ui.semantics.q qVar) {
        androidx.compose.ui.semantics.l lVar = qVar.f15242d;
        androidx.compose.ui.semantics.v<List<String>> vVar = SemanticsProperties.f15148a;
        if (!lVar.f15234b.b(SemanticsProperties.f15148a)) {
            androidx.compose.ui.semantics.v<androidx.compose.ui.text.E> vVar2 = SemanticsProperties.f15139E;
            androidx.compose.ui.semantics.l lVar2 = qVar.f15242d;
            if (lVar2.f15234b.b(vVar2)) {
                return (int) (((androidx.compose.ui.text.E) lVar2.q(vVar2)).f15316a >> 32);
            }
        }
        return this.f14764t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC0883k<J0> j() {
        if (this.f14768x) {
            this.f14768x = false;
            AndroidComposeView androidComposeView = this.f14746a;
            this.f14770z = K0.b(androidComposeView.getSemanticsOwner());
            if (l()) {
                androidx.collection.B b10 = this.f14770z;
                Resources resources = androidComposeView.getContext().getResources();
                Comparator<androidx.compose.ui.semantics.q>[] comparatorArr = AndroidComposeViewAccessibilityDelegateCompat_androidKt.f14781a;
                C0897z c0897z = this.f14735B;
                c0897z.c();
                C0897z c0897z2 = this.f14736C;
                c0897z2.c();
                J0 j10 = (J0) b10.b(-1);
                androidx.compose.ui.semantics.q qVar = j10 != null ? j10.f14934a : null;
                kotlin.jvm.internal.i.b(qVar);
                ArrayList arrayListI = AndroidComposeViewAccessibilityDelegateCompat_androidKt.i(AndroidComposeViewAccessibilityDelegateCompat_androidKt.g(qVar), M1.k(qVar), b10, resources);
                int iR = kotlin.collections.l.r(arrayListI);
                if (1 <= iR) {
                    int i10 = 1;
                    while (true) {
                        int i11 = ((androidx.compose.ui.semantics.q) arrayListI.get(i10 - 1)).f15245g;
                        int i12 = ((androidx.compose.ui.semantics.q) arrayListI.get(i10)).f15245g;
                        c0897z.f(i11, i12);
                        c0897z2.f(i12, i11);
                        if (i10 == iR) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return this.f14770z;
    }

    public final boolean l() {
        return this.f14749d.isEnabled() && !this.f14753h.isEmpty();
    }

    public final void m(LayoutNode layoutNode) {
        if (this.f14766v.add(layoutNode)) {
            this.f14767w.n(p293xa.r.f47939a);
        }
    }

    public final int q(int i10) {
        if (i10 == this.f14746a.getSemanticsOwner().a().f15245g) {
            return -1;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x008e A[LOOP:1: B:16:0x0051->B:29:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[EDGE_INSN: B:43:0x0090->B:30:0x0090 BREAK  A[LOOP:1: B:16:0x0051->B:29:0x008e], SYNTHETIC] */
    public final void r(androidx.compose.ui.semantics.q qVar, I0 i10) {
        int[] iArr = C0886n.f9196a;
        androidx.collection.C c10 = new androidx.collection.C((Object) null);
        List listH = androidx.compose.ui.semantics.q.h(qVar, true, 4);
        int size = listH.size();
        int i11 = 0;
        while (true) {
            LayoutNode layoutNode = qVar.f15241c;
            if (i11 >= size) {
                androidx.collection.C c11 = i10.f14928b;
                int[] iArr2 = c11.f9193b;
                long[] jArr = c11.f9192a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j = jArr[i12];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i12 != length) {
                                break;
                                break;
                            }
                            i12++;
                        } else {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((j & 255) < 128 && !c10.a(iArr2[(i12 << 3) + i14])) {
                                    m(layoutNode);
                                    return;
                                }
                                j >>= 8;
                            }
                            if (i13 != 8) {
                                break;
                            } else if (i12 != length) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                List listH2 = androidx.compose.ui.semantics.q.h(qVar, true, 4);
                int size2 = listH2.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    androidx.compose.ui.semantics.q qVar2 = (androidx.compose.ui.semantics.q) listH2.get(i15);
                    if (j().a(qVar2.f15245g)) {
                        I0 i0B = this.f14740G.b(qVar2.f15245g);
                        kotlin.jvm.internal.i.b(i0B);
                        r(qVar2, i0B);
                    }
                }
                return;
            }
            androidx.compose.ui.semantics.q qVar3 = (androidx.compose.ui.semantics.q) listH.get(i11);
            if (j().a(qVar3.f15245g)) {
                androidx.collection.C c12 = i10.f14928b;
                int i16 = qVar3.f15245g;
                if (!c12.a(i16)) {
                    m(layoutNode);
                    return;
                }
                c10.b(i16);
            }
            i11++;
        }
    }

    public final boolean s(AccessibilityEvent accessibilityEvent) {
        if (!l()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f14759o = true;
        }
        try {
            return ((Boolean) ((AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1) this.f14748c).invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f14759o = false;
        }
    }

    public final boolean t(int i10, int i11, Integer num, List<String> list) {
        if (i10 == Integer.MIN_VALUE || !l()) {
            return false;
        }
        AccessibilityEvent accessibilityEventF = f(i10, i11);
        if (num != null) {
            accessibilityEventF.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventF.setContentDescription(p039d0.a.b(list, ",", null, 62));
        }
        return s(accessibilityEventF);
    }

    public final void v(String str, int i10, int i11) {
        AccessibilityEvent accessibilityEventF = f(q(i10), 32);
        accessibilityEventF.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventF.getText().add(str);
        }
        s(accessibilityEventF);
    }

    public final void w(int i10) {
        d dVar = this.f14769y;
        if (dVar != null) {
            androidx.compose.ui.semantics.q qVar = dVar.f14773a;
            if (i10 != qVar.f15245g) {
                return;
            }
            if (SystemClock.uptimeMillis() - dVar.f14778f <= 1000) {
                AccessibilityEvent accessibilityEventF = f(q(qVar.f15245g), 131072);
                accessibilityEventF.setFromIndex(dVar.f14776d);
                accessibilityEventF.setToIndex(dVar.f14777e);
                accessibilityEventF.setAction(dVar.f14774b);
                accessibilityEventF.setMovementGranularity(dVar.f14775c);
                accessibilityEventF.getText().add(k(qVar));
                s(accessibilityEventF);
            }
        }
        this.f14769y = null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x031c  */
    /* JADX WARN: Code duplicated, block: B:105:0x032e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0330  */
    /* JADX WARN: Code duplicated, block: B:110:0x0338  */
    /* JADX WARN: Code duplicated, block: B:113:0x0346 A[LOOP:4: B:108:0x0334->B:113:0x0346, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x038a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0393  */
    /* JADX WARN: Code duplicated, block: B:137:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:144:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:145:0x0418  */
    /* JADX WARN: Code duplicated, block: B:146:0x043b  */
    /* JADX WARN: Code duplicated, block: B:148:0x045a  */
    /* JADX WARN: Code duplicated, block: B:155:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:157:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:158:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:160:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:163:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:164:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:166:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:168:0x0501  */
    /* JADX WARN: Code duplicated, block: B:170:0x051b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0523  */
    /* JADX WARN: Code duplicated, block: B:174:0x0531  */
    /* JADX WARN: Code duplicated, block: B:176:0x0540 A[LOOP:6: B:175:0x053e->B:176:0x0540, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:179:0x055d A[LOOP:7: B:178:0x055b->B:179:0x055d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x0578  */
    /* JADX WARN: Code duplicated, block: B:186:0x057a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0587  */
    /* JADX WARN: Code duplicated, block: B:192:0x058b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0595  */
    /* JADX WARN: Code duplicated, block: B:195:0x0597  */
    /* JADX WARN: Code duplicated, block: B:198:0x059d  */
    /* JADX WARN: Code duplicated, block: B:201:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:256:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x0344 A[EDGE_INSN: B:257:0x0344->B:112:0x0344 BREAK  A[LOOP:4: B:108:0x0334->B:113:0x0346], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0115  */
    /* JADX WARN: Code duplicated, block: B:48:0x0122  */
    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:51:0x0164  */
    /* JADX WARN: Code duplicated, block: B:53:0x016c  */
    /* JADX WARN: Code duplicated, block: B:54:0x016e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0178  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:64:0x0203  */
    /* JADX WARN: Code duplicated, block: B:66:0x020f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0211  */
    /* JADX WARN: Code duplicated, block: B:69:0x0219  */
    /* JADX WARN: Code duplicated, block: B:71:0x0225  */
    /* JADX WARN: Code duplicated, block: B:73:0x0248  */
    /* JADX WARN: Code duplicated, block: B:74:0x024d  */
    /* JADX WARN: Code duplicated, block: B:77:0x025c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0261  */
    /* JADX WARN: Code duplicated, block: B:80:0x0264  */
    /* JADX WARN: Code duplicated, block: B:82:0x026b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0289  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:88:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:90:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:93:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0308  */
    /* JADX WARN: Code duplicated, block: B:98:0x0311  */
    /* JADX WARN: Not found block with instruction: 0x032a: MOVE (r0v23 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] (LINE:811) */
    public final void x(AbstractC0883k<J0> abstractC0883k) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int[] iArr;
        long[] jArr;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr2;
        long[] jArr2;
        int i14;
        int i15;
        int i16;
        int i17;
        I0 i0B;
        androidx.compose.ui.semantics.l lVar;
        int i18;
        boolean z10;
        boolean z11;
        int i19;
        Object[] objArr;
        long[] jArr3;
        int i20;
        Object[] objArr2;
        androidx.collection.K<androidx.compose.ui.semantics.v<?>, Object> k10;
        androidx.compose.ui.semantics.l lVar2;
        int i21;
        int i22;
        int i23;
        char c10;
        ArrayList arrayList5;
        boolean z12;
        androidx.compose.ui.semantics.v<String> vVar;
        boolean zA;
        androidx.collection.K<androidx.compose.ui.semantics.v<?>, Object> k11;
        boolean zA2;
        androidx.compose.ui.semantics.v<Boolean> vVar2;
        boolean zA3;
        LayoutNode layoutNode;
        androidx.compose.ui.semantics.v<C1260a> vVar3;
        String str;
        ArrayList arrayList6;
        androidx.compose.ui.semantics.v<androidx.compose.ui.text.E> vVar4;
        boolean zA4;
        int i24;
        boolean zA5;
        androidx.compose.ui.semantics.v<List<androidx.compose.ui.semantics.e>> vVar5;
        androidx.compose.ui.semantics.a aVar;
        Object objA;
        androidx.compose.ui.semantics.a aVar2;
        boolean z13;
        boolean z14;
        List list;
        List list2;
        LinkedHashSet linkedHashSet;
        int size;
        int i25;
        LinkedHashSet linkedHashSet2;
        int size2;
        int i26;
        H0 h0A;
        C1260a c1260a;
        String str2;
        C1260a c1260a2;
        CharSequence charSequence;
        CharSequence charSequenceB;
        int length;
        int length2;
        int i27;
        int i28;
        int i29;
        boolean zB;
        boolean z15;
        boolean z16;
        AccessibilityEvent accessibilityEventG;
        androidx.compose.ui.semantics.i iVar;
        boolean zA6;
        char c11;
        Object obj;
        AccessibilityEvent accessibilityEventF;
        List list3;
        String strB;
        List list4;
        String strB2;
        String str3;
        AbstractC0883k<J0> abstractC0883k2 = abstractC0883k;
        ArrayList arrayList7 = this.f14744K;
        ArrayList arrayList8 = new ArrayList(arrayList7);
        arrayList7.clear();
        int[] iArr3 = abstractC0883k2.f9187b;
        long[] jArr4 = abstractC0883k2.f9186a;
        int length3 = jArr4.length - 2;
        if (length3 < 0) {
            return;
        }
        int i30 = 0;
        while (true) {
            long j = jArr4[i30];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i31 = 8;
                int i32 = 8 - ((~(i30 - length3)) >>> 31);
                long j10 = j;
                int i33 = 0;
                while (i33 < i32) {
                    if ((j10 & 255) >= 128 || (i0B = this.f14740G.b((i17 = iArr3[(i30 << 3) + i33]))) == null) {
                        i12 = i33;
                        i13 = i32;
                        arrayList3 = arrayList8;
                        arrayList4 = arrayList7;
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        i14 = length3;
                        i15 = i31;
                        i16 = i30;
                    } else {
                        J0 j0B = abstractC0883k2.b(i17);
                        androidx.compose.ui.semantics.q qVar = j0B != null ? j0B.f14934a : null;
                        if (qVar == null) {
                            throw C4.v.g("no value for specified key");
                        }
                        androidx.compose.ui.semantics.l lVar3 = qVar.f15242d;
                        androidx.collection.K<androidx.compose.ui.semantics.v<?>, Object> k12 = lVar3.f15234b;
                        Object[] objArr3 = k12.f9128b;
                        Object[] objArr4 = k12.f9129c;
                        iArr2 = iArr3;
                        long[] jArr5 = k12.f9127a;
                        i12 = i33;
                        int length4 = jArr5.length - 2;
                        androidx.compose.ui.semantics.l lVar4 = i0B.f14927a;
                        jArr2 = jArr4;
                        if (length4 >= 0) {
                            int i34 = i32;
                            androidx.collection.K<androidx.compose.ui.semantics.v<?>, Object> k13 = k12;
                            int i35 = 0;
                            z10 = false;
                            while (true) {
                                long j11 = jArr5[i35];
                                i14 = length3;
                                androidx.compose.ui.semantics.l lVar5 = lVar3;
                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i36 = 8 - ((~(i35 - length4)) >>> 31);
                                    long j12 = j11;
                                    int i37 = 0;
                                    while (i37 < i36) {
                                        if ((j12 & 255) < 128) {
                                            int i38 = (i35 << 3) + i37;
                                            Object obj2 = objArr3[i38];
                                            Object obj3 = objArr4[i38];
                                            androidx.compose.ui.semantics.v vVar6 = (androidx.compose.ui.semantics.v) obj2;
                                            i22 = length4;
                                            androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.j> vVar7 = SemanticsProperties.f15165s;
                                            if (kotlin.jvm.internal.i.a(vVar6, vVar7)) {
                                                i23 = i30;
                                            } else {
                                                i23 = i30;
                                                if (!kotlin.jvm.internal.i.a(vVar6, SemanticsProperties.f15166t)) {
                                                    z12 = false;
                                                }
                                                if (z12 && kotlin.jvm.internal.i.a(obj3, SemanticsConfigurationKt.a(lVar4, vVar6))) {
                                                    i22 = i22;
                                                    i23 = i23;
                                                } else {
                                                    vVar = SemanticsProperties.f15151d;
                                                    zA = kotlin.jvm.internal.i.a(vVar6, vVar);
                                                    objArr4 = objArr4;
                                                    k11 = lVar4.f15234b;
                                                    if (zA) {
                                                        kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                                                        str3 = (String) obj3;
                                                        if (k11.b(vVar)) {
                                                            v(str3, i17, 8);
                                                            arrayList8 = arrayList8;
                                                            jArr5 = jArr5;
                                                            i35 = i35;
                                                            objArr3 = objArr3;
                                                            i36 = i36;
                                                            i37 = i37;
                                                            i34 = i34;
                                                            k13 = k13;
                                                            lVar5 = lVar5;
                                                            i22 = i22;
                                                            i23 = i23;
                                                            lVar4 = lVar4;
                                                            i17 = i17;
                                                            arrayList5 = arrayList7;
                                                            c10 = '\b';
                                                        } else {
                                                            arrayList8 = arrayList8;
                                                            jArr5 = jArr5;
                                                            objArr3 = objArr3;
                                                            lVar5 = lVar5;
                                                            i17 = i17;
                                                            arrayList5 = arrayList7;
                                                            c10 = '\b';
                                                        }
                                                        z14 = z10;
                                                    } else {
                                                        if (kotlin.jvm.internal.i.a(vVar6, SemanticsProperties.f15149b)) {
                                                            zA2 = true;
                                                        } else {
                                                            zA2 = kotlin.jvm.internal.i.a(vVar6, SemanticsProperties.f15142H);
                                                        }
                                                        if (zA2) {
                                                            c11 = '\b';
                                                            u(this, q(i17), 2048, 64, 8);
                                                            u(this, q(i17), 2048, 0, 8);
                                                            arrayList8 = arrayList8;
                                                            jArr5 = jArr5;
                                                            objArr3 = objArr3;
                                                            lVar5 = lVar5;
                                                        } else {
                                                            arrayList8 = arrayList8;
                                                            if (kotlin.jvm.internal.i.a(vVar6, SemanticsProperties.f15150c)) {
                                                                u(this, q(i17), 2048, 64, 8);
                                                                u(this, q(i17), 2048, 0, 8);
                                                                jArr5 = jArr5;
                                                                i35 = i35;
                                                                objArr3 = objArr3;
                                                                i36 = i36;
                                                                i37 = i37;
                                                                i34 = i34;
                                                                k13 = k13;
                                                                lVar5 = lVar5;
                                                                i22 = i22;
                                                                i23 = i23;
                                                                lVar4 = lVar4;
                                                                i17 = i17;
                                                                arrayList5 = arrayList7;
                                                                c10 = '\b';
                                                            } else {
                                                                vVar2 = SemanticsProperties.f15141G;
                                                                zA3 = kotlin.jvm.internal.i.a(vVar6, vVar2);
                                                                jArr5 = jArr5;
                                                                layoutNode = qVar.f15241c;
                                                                objArr3 = objArr3;
                                                                if (zA3) {
                                                                    lVar5 = lVar5;
                                                                    iVar = (androidx.compose.ui.semantics.i) SemanticsConfigurationKt.a(lVar5, SemanticsProperties.f15169w);
                                                                    if (iVar == null) {
                                                                        zA6 = false;
                                                                    } else {
                                                                        zA6 = androidx.compose.ui.semantics.i.a(iVar.f15203a, 4);
                                                                    }
                                                                    if (zA6) {
                                                                        c11 = '\b';
                                                                        obj = null;
                                                                        u(this, q(i17), 2048, 64, 8);
                                                                        u(this, q(i17), 2048, 0, 8);
                                                                    } else if (kotlin.jvm.internal.i.a(SemanticsConfigurationKt.a(lVar5, vVar2), Boolean.TRUE)) {
                                                                        accessibilityEventF = f(q(i17), 4);
                                                                        androidx.compose.ui.semantics.q qVar2 = new androidx.compose.ui.semantics.q(qVar.f15239a, true, layoutNode, lVar5);
                                                                        list3 = (List) SemanticsConfigurationKt.a(qVar2.i(), SemanticsProperties.f15148a);
                                                                        if (list3 != null) {
                                                                            strB = p039d0.a.b(list3, ",", null, 62);
                                                                        } else {
                                                                            strB = null;
                                                                        }
                                                                        list4 = (List) SemanticsConfigurationKt.a(qVar2.i(), SemanticsProperties.f15172z);
                                                                        if (list4 != null) {
                                                                            strB2 = p039d0.a.b(list4, ",", null, 62);
                                                                        } else {
                                                                            strB2 = null;
                                                                        }
                                                                        if (strB != null) {
                                                                            accessibilityEventF.setContentDescription(strB);
                                                                            p293xa.r rVar = p293xa.r.f47939a;
                                                                        }
                                                                        if (strB2 != null) {
                                                                            accessibilityEventF.getText().add(strB2);
                                                                        }
                                                                        s(accessibilityEventF);
                                                                    } else {
                                                                        obj = null;
                                                                        c11 = '\b';
                                                                        u(this, q(i17), 2048, 0, 8);
                                                                    }
                                                                } else {
                                                                    lVar5 = lVar5;
                                                                    if (kotlin.jvm.internal.i.a(vVar6, SemanticsProperties.f15148a)) {
                                                                        int iQ = q(i17);
                                                                        kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                        t(iQ, 2048, 4, (List) obj3);
                                                                    } else {
                                                                        vVar3 = SemanticsProperties.f15138D;
                                                                        str = "";
                                                                        if (kotlin.jvm.internal.i.a(vVar6, vVar3)) {
                                                                            k13 = k13;
                                                                            if (k13.b(androidx.compose.ui.semantics.k.j)) {
                                                                                c1260a2 = (C1260a) SemanticsConfigurationKt.a(lVar4, vVar3);
                                                                                if (c1260a2 == null) {
                                                                                    c1260a2 = "";
                                                                                }
                                                                                charSequence = (C1260a) SemanticsConfigurationKt.a(lVar5, vVar3);
                                                                                if (charSequence == null) {
                                                                                    charSequence = "";
                                                                                }
                                                                                charSequenceB = B(charSequence);
                                                                                length = c1260a2.length();
                                                                                length2 = charSequence.length();
                                                                                if (length > length2) {
                                                                                    i27 = length2;
                                                                                } else {
                                                                                    i27 = length;
                                                                                }
                                                                                i35 = i35;
                                                                                i28 = 0;
                                                                                while (true) {
                                                                                    i36 = i36;
                                                                                    if (i28 < i27) {
                                                                                        i37 = i37;
                                                                                        break;
                                                                                    }
                                                                                    i37 = i37;
                                                                                    if (c1260a2.charAt(i28) != charSequence.charAt(i28)) {
                                                                                        break;
                                                                                    }
                                                                                    i28++;
                                                                                    i36 = i36;
                                                                                    i37 = i37;
                                                                                }
                                                                                arrayList6 = arrayList7;
                                                                                i29 = 0;
                                                                                while (i29 < i27 - i28 && c1260a2.charAt((length - 1) - i29) == charSequence.charAt((length2 - 1) - i29)) {
                                                                                    i29++;
                                                                                }
                                                                                int i39 = (length - i29) - i28;
                                                                                int i40 = (length2 - i29) - i28;
                                                                                androidx.compose.ui.semantics.v<p293xa.r> vVar8 = SemanticsProperties.f15143I;
                                                                                boolean zB2 = k11.b(vVar8);
                                                                                boolean zB3 = k13.b(vVar8);
                                                                                zB = k11.b(SemanticsProperties.f15138D);
                                                                                if (zB || zB2 || !zB3) {
                                                                                    z15 = false;
                                                                                } else {
                                                                                    z15 = true;
                                                                                }
                                                                                if (zB || !zB2 || zB3) {
                                                                                    z16 = false;
                                                                                } else {
                                                                                    z16 = true;
                                                                                }
                                                                                if (!z15 || z16) {
                                                                                    c10 = '\b';
                                                                                    accessibilityEventG = g(q(i17), 0, 0, Integer.valueOf(length2), charSequenceB);
                                                                                } else {
                                                                                    accessibilityEventG = f(q(i17), 16);
                                                                                    accessibilityEventG.setFromIndex(i28);
                                                                                    accessibilityEventG.setRemovedCount(i39);
                                                                                    accessibilityEventG.setAddedCount(i40);
                                                                                    accessibilityEventG.setBeforeText(c1260a2);
                                                                                    accessibilityEventG.getText().add(charSequenceB);
                                                                                    c10 = '\b';
                                                                                }
                                                                                accessibilityEventG.setClassName("android.widget.EditText");
                                                                                s(accessibilityEventG);
                                                                                if (z15 || z16) {
                                                                                    long j13 = ((androidx.compose.ui.text.E) lVar5.q(SemanticsProperties.f15139E)).f15316a;
                                                                                    accessibilityEventG.setFromIndex((int) (j13 >> 32));
                                                                                    accessibilityEventG.setToIndex((int) (j13 & 4294967295L));
                                                                                    s(accessibilityEventG);
                                                                                }
                                                                            } else {
                                                                                i17 = i17;
                                                                                k13 = k13;
                                                                                arrayList6 = arrayList7;
                                                                                i35 = i35;
                                                                                i36 = i36;
                                                                                i37 = i37;
                                                                                i34 = i34;
                                                                                i22 = i22;
                                                                                i23 = i23;
                                                                                c10 = '\b';
                                                                                u(this, q(i17), 2048, 2, 8);
                                                                            }
                                                                            i23 = i23;
                                                                        } else {
                                                                            i17 = i17;
                                                                            arrayList6 = arrayList7;
                                                                            i35 = i35;
                                                                            i36 = i36;
                                                                            i37 = i37;
                                                                            i34 = i34;
                                                                            k13 = k13;
                                                                            i22 = i22;
                                                                            i23 = i23;
                                                                            c10 = '\b';
                                                                            lVar4 = lVar4;
                                                                            vVar4 = SemanticsProperties.f15139E;
                                                                            zA4 = kotlin.jvm.internal.i.a(vVar6, vVar4);
                                                                            i24 = qVar.f15245g;
                                                                            if (zA4) {
                                                                                c1260a = (C1260a) SemanticsConfigurationKt.a(lVar5, vVar3);
                                                                                if (c1260a != null && (str2 = c1260a.f15408c) != null) {
                                                                                    str = str2;
                                                                                }
                                                                                androidx.compose.ui.text.E e10 = (androidx.compose.ui.text.E) lVar5.q(vVar4);
                                                                                int iQ2 = q(i17);
                                                                                long j14 = e10.f15316a;
                                                                                s(g(iQ2, Integer.valueOf((int) (j14 >> 32)), Integer.valueOf((int) (j14 & 4294967295L)), Integer.valueOf(str.length()), B(str)));
                                                                                w(i24);
                                                                            } else {
                                                                                if (kotlin.jvm.internal.i.a(vVar6, vVar7)) {
                                                                                    zA5 = true;
                                                                                } else {
                                                                                    zA5 = kotlin.jvm.internal.i.a(vVar6, SemanticsProperties.f15166t);
                                                                                }
                                                                                if (zA5) {
                                                                                    m(layoutNode);
                                                                                    arrayList5 = arrayList6;
                                                                                    h0A = K0.a(i17, arrayList5);
                                                                                    kotlin.jvm.internal.i.b(h0A);
                                                                                    h0A.f14921f = (androidx.compose.ui.semantics.j) SemanticsConfigurationKt.a(lVar5, vVar7);
                                                                                    h0A.f14922g = (androidx.compose.ui.semantics.j) SemanticsConfigurationKt.a(lVar5, SemanticsProperties.f15166t);
                                                                                    if (h0A.f14918c.contains(h0A)) {
                                                                                        this.f14746a.getSnapshotObserver().b(h0A, this.f14745L, new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(h0A, this));
                                                                                    }
                                                                                } else {
                                                                                    arrayList5 = arrayList6;
                                                                                    if (kotlin.jvm.internal.i.a(vVar6, SemanticsProperties.f15157k)) {
                                                                                        kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                                                                                        if (((Boolean) obj3).booleanValue()) {
                                                                                            s(f(q(i24), 8));
                                                                                        }
                                                                                        u(this, q(i24), 2048, 0, 8);
                                                                                    } else {
                                                                                        vVar5 = androidx.compose.ui.semantics.k.f15230w;
                                                                                        if (kotlin.jvm.internal.i.a(vVar6, vVar5)) {
                                                                                            list = (List) lVar5.q(vVar5);
                                                                                            list2 = (List) SemanticsConfigurationKt.a(lVar4, vVar5);
                                                                                            if (list2 != null) {
                                                                                                linkedHashSet = new LinkedHashSet();
                                                                                                size = list.size();
                                                                                                for (i25 = 0; i25 < size; i25++) {
                                                                                                    linkedHashSet.add(((androidx.compose.ui.semantics.e) list.get(i25)).f15197a);
                                                                                                }
                                                                                                linkedHashSet2 = new LinkedHashSet();
                                                                                                size2 = list2.size();
                                                                                                for (i26 = 0; i26 < size2; i26++) {
                                                                                                    linkedHashSet2.add(((androidx.compose.ui.semantics.e) list2.get(i26)).f15197a);
                                                                                                }
                                                                                                if (!linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                                    z14 = false;
                                                                                                }
                                                                                            } else if (!list.isEmpty()) {
                                                                                            }
                                                                                            z14 = true;
                                                                                        } else {
                                                                                            if (obj3 instanceof androidx.compose.ui.semantics.a) {
                                                                                                aVar = (androidx.compose.ui.semantics.a) obj3;
                                                                                                objA = SemanticsConfigurationKt.a(lVar4, vVar6);
                                                                                                Comparator<androidx.compose.ui.semantics.q>[] comparatorArr = AndroidComposeViewAccessibilityDelegateCompat_androidKt.f14781a;
                                                                                                if (aVar != objA) {
                                                                                                    if (objA instanceof androidx.compose.ui.semantics.a) {
                                                                                                        aVar2 = (androidx.compose.ui.semantics.a) objA;
                                                                                                        if (kotlin.jvm.internal.i.a(aVar.f15190a, aVar2.f15190a)) {
                                                                                                            T t8 = aVar2.f15191b;
                                                                                                            T t10 = aVar.f15191b;
                                                                                                            z13 = (t10 == 0 || t8 == 0) && (t10 == 0 || t8 != 0);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (!z13) {
                                                                                                    z14 = false;
                                                                                                }
                                                                                            }
                                                                                            z14 = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        arrayList5 = arrayList6;
                                                                    }
                                                                }
                                                                arrayList5 = arrayList7;
                                                                c10 = '\b';
                                                            }
                                                            z14 = z10;
                                                        }
                                                        arrayList5 = arrayList7;
                                                        c10 = c11;
                                                        z14 = z10;
                                                    }
                                                    z10 = z14;
                                                }
                                                j12 >>= c10;
                                                arrayList7 = arrayList5;
                                                lVar5 = lVar5;
                                                lVar4 = lVar4;
                                                i17 = i17;
                                                i30 = i23;
                                                k13 = k13;
                                                objArr4 = objArr4;
                                                arrayList8 = arrayList8;
                                                jArr5 = jArr5;
                                                objArr3 = objArr3;
                                                i35 = i35;
                                                i36 = i36;
                                                i34 = i34;
                                                int i41 = i22;
                                                i37++;
                                                length4 = i41;
                                            }
                                            H0 h0A2 = K0.a(i17, arrayList8);
                                            if (h0A2 != null) {
                                                z12 = false;
                                            } else {
                                                h0A2 = new H0(i17, arrayList7);
                                                z12 = true;
                                            }
                                            arrayList7.add(h0A2);
                                            if (z12) {
                                            }
                                            vVar = SemanticsProperties.f15151d;
                                            zA = kotlin.jvm.internal.i.a(vVar6, vVar);
                                            objArr4 = objArr4;
                                            k11 = lVar4.f15234b;
                                            if (zA) {
                                                kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                                                str3 = (String) obj3;
                                                if (k11.b(vVar)) {
                                                    v(str3, i17, 8);
                                                    arrayList8 = arrayList8;
                                                    jArr5 = jArr5;
                                                    i35 = i35;
                                                    objArr3 = objArr3;
                                                    i36 = i36;
                                                    i37 = i37;
                                                    i34 = i34;
                                                    k13 = k13;
                                                    lVar5 = lVar5;
                                                    i22 = i22;
                                                    i23 = i23;
                                                    lVar4 = lVar4;
                                                    i17 = i17;
                                                    arrayList5 = arrayList7;
                                                    c10 = '\b';
                                                } else {
                                                    arrayList8 = arrayList8;
                                                    jArr5 = jArr5;
                                                    objArr3 = objArr3;
                                                    lVar5 = lVar5;
                                                    i17 = i17;
                                                    arrayList5 = arrayList7;
                                                    c10 = '\b';
                                                }
                                                z14 = z10;
                                            } else {
                                                if (kotlin.jvm.internal.i.a(vVar6, SemanticsProperties.f15149b)) {
                                                    zA2 = true;
                                                } else {
                                                    zA2 = kotlin.jvm.internal.i.a(vVar6, SemanticsProperties.f15142H);
                                                }
                                                if (zA2) {
                                                    c11 = '\b';
                                                    u(this, q(i17), 2048, 64, 8);
                                                    u(this, q(i17), 2048, 0, 8);
                                                    arrayList8 = arrayList8;
                                                    jArr5 = jArr5;
                                                    objArr3 = objArr3;
                                                    lVar5 = lVar5;
                                                } else {
                                                    arrayList8 = arrayList8;
                                                    if (kotlin.jvm.internal.i.a(vVar6, SemanticsProperties.f15150c)) {
                                                        u(this, q(i17), 2048, 64, 8);
                                                        u(this, q(i17), 2048, 0, 8);
                                                        jArr5 = jArr5;
                                                        i35 = i35;
                                                        objArr3 = objArr3;
                                                        i36 = i36;
                                                        i37 = i37;
                                                        i34 = i34;
                                                        k13 = k13;
                                                        lVar5 = lVar5;
                                                        i22 = i22;
                                                        i23 = i23;
                                                        lVar4 = lVar4;
                                                        i17 = i17;
                                                        arrayList5 = arrayList7;
                                                        c10 = '\b';
                                                    } else {
                                                        vVar2 = SemanticsProperties.f15141G;
                                                        zA3 = kotlin.jvm.internal.i.a(vVar6, vVar2);
                                                        jArr5 = jArr5;
                                                        layoutNode = qVar.f15241c;
                                                        objArr3 = objArr3;
                                                        if (zA3) {
                                                            lVar5 = lVar5;
                                                            iVar = (androidx.compose.ui.semantics.i) SemanticsConfigurationKt.a(lVar5, SemanticsProperties.f15169w);
                                                            if (iVar == null) {
                                                                zA6 = false;
                                                            } else {
                                                                zA6 = androidx.compose.ui.semantics.i.a(iVar.f15203a, 4);
                                                            }
                                                            if (zA6) {
                                                                c11 = '\b';
                                                                obj = null;
                                                                u(this, q(i17), 2048, 64, 8);
                                                                u(this, q(i17), 2048, 0, 8);
                                                            } else if (kotlin.jvm.internal.i.a(SemanticsConfigurationKt.a(lVar5, vVar2), Boolean.TRUE)) {
                                                                accessibilityEventF = f(q(i17), 4);
                                                                androidx.compose.ui.semantics.q qVar3 = new androidx.compose.ui.semantics.q(qVar.f15239a, true, layoutNode, lVar5);
                                                                list3 = (List) SemanticsConfigurationKt.a(qVar3.i(), SemanticsProperties.f15148a);
                                                                if (list3 != null) {
                                                                    strB = p039d0.a.b(list3, ",", null, 62);
                                                                } else {
                                                                    strB = null;
                                                                }
                                                                list4 = (List) SemanticsConfigurationKt.a(qVar3.i(), SemanticsProperties.f15172z);
                                                                if (list4 != null) {
                                                                    strB2 = p039d0.a.b(list4, ",", null, 62);
                                                                } else {
                                                                    strB2 = null;
                                                                }
                                                                if (strB != null) {
                                                                    accessibilityEventF.setContentDescription(strB);
                                                                    p293xa.r rVar2 = p293xa.r.f47939a;
                                                                }
                                                                if (strB2 != null) {
                                                                    accessibilityEventF.getText().add(strB2);
                                                                }
                                                                s(accessibilityEventF);
                                                            } else {
                                                                obj = null;
                                                                c11 = '\b';
                                                                u(this, q(i17), 2048, 0, 8);
                                                            }
                                                        } else {
                                                            lVar5 = lVar5;
                                                            if (kotlin.jvm.internal.i.a(vVar6, SemanticsProperties.f15148a)) {
                                                                int iQ3 = q(i17);
                                                                kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                t(iQ3, 2048, 4, (List) obj3);
                                                            } else {
                                                                vVar3 = SemanticsProperties.f15138D;
                                                                str = "";
                                                                if (kotlin.jvm.internal.i.a(vVar6, vVar3)) {
                                                                    k13 = k13;
                                                                    if (k13.b(androidx.compose.ui.semantics.k.j)) {
                                                                        c1260a2 = (C1260a) SemanticsConfigurationKt.a(lVar4, vVar3);
                                                                        if (c1260a2 == null) {
                                                                            c1260a2 = "";
                                                                        }
                                                                        charSequence = (C1260a) SemanticsConfigurationKt.a(lVar5, vVar3);
                                                                        if (charSequence == null) {
                                                                            charSequence = "";
                                                                        }
                                                                        charSequenceB = B(charSequence);
                                                                        length = c1260a2.length();
                                                                        length2 = charSequence.length();
                                                                        if (length > length2) {
                                                                            i27 = length2;
                                                                        } else {
                                                                            i27 = length;
                                                                        }
                                                                        i35 = i35;
                                                                        i28 = 0;
                                                                        while (true) {
                                                                            i36 = i36;
                                                                            if (i28 < i27) {
                                                                                i37 = i37;
                                                                                break;
                                                                            }
                                                                            i37 = i37;
                                                                            if (c1260a2.charAt(i28) != charSequence.charAt(i28)) {
                                                                                break;
                                                                                break;
                                                                            } else {
                                                                                i28++;
                                                                                i36 = i36;
                                                                                i37 = i37;
                                                                            }
                                                                        }
                                                                        arrayList6 = arrayList7;
                                                                        i29 = 0;
                                                                        while (i29 < i27 - i28) {
                                                                            i29++;
                                                                        }
                                                                        int i310 = (length - i29) - i28;
                                                                        int i42 = (length2 - i29) - i28;
                                                                        androidx.compose.ui.semantics.v<p293xa.r> vVar9 = SemanticsProperties.f15143I;
                                                                        boolean zB4 = k11.b(vVar9);
                                                                        boolean zB5 = k13.b(vVar9);
                                                                        zB = k11.b(SemanticsProperties.f15138D);
                                                                        if (zB) {
                                                                            z15 = false;
                                                                        } else {
                                                                            z15 = false;
                                                                        }
                                                                        if (zB) {
                                                                            z16 = false;
                                                                        } else {
                                                                            z16 = false;
                                                                        }
                                                                        if (z15) {
                                                                            c10 = '\b';
                                                                            accessibilityEventG = g(q(i17), 0, 0, Integer.valueOf(length2), charSequenceB);
                                                                        } else {
                                                                            c10 = '\b';
                                                                            accessibilityEventG = g(q(i17), 0, 0, Integer.valueOf(length2), charSequenceB);
                                                                        }
                                                                        accessibilityEventG.setClassName("android.widget.EditText");
                                                                        s(accessibilityEventG);
                                                                        if (z15) {
                                                                            long j15 = ((androidx.compose.ui.text.E) lVar5.q(SemanticsProperties.f15139E)).f15316a;
                                                                            accessibilityEventG.setFromIndex((int) (j15 >> 32));
                                                                            accessibilityEventG.setToIndex((int) (j15 & 4294967295L));
                                                                            s(accessibilityEventG);
                                                                        } else {
                                                                            long j16 = ((androidx.compose.ui.text.E) lVar5.q(SemanticsProperties.f15139E)).f15316a;
                                                                            accessibilityEventG.setFromIndex((int) (j16 >> 32));
                                                                            accessibilityEventG.setToIndex((int) (j16 & 4294967295L));
                                                                            s(accessibilityEventG);
                                                                        }
                                                                    } else {
                                                                        i17 = i17;
                                                                        k13 = k13;
                                                                        arrayList6 = arrayList7;
                                                                        i35 = i35;
                                                                        i36 = i36;
                                                                        i37 = i37;
                                                                        i34 = i34;
                                                                        i22 = i22;
                                                                        i23 = i23;
                                                                        c10 = '\b';
                                                                        u(this, q(i17), 2048, 2, 8);
                                                                    }
                                                                    i23 = i23;
                                                                } else {
                                                                    i17 = i17;
                                                                    arrayList6 = arrayList7;
                                                                    i35 = i35;
                                                                    i36 = i36;
                                                                    i37 = i37;
                                                                    i34 = i34;
                                                                    k13 = k13;
                                                                    i22 = i22;
                                                                    i23 = i23;
                                                                    c10 = '\b';
                                                                    lVar4 = lVar4;
                                                                    vVar4 = SemanticsProperties.f15139E;
                                                                    zA4 = kotlin.jvm.internal.i.a(vVar6, vVar4);
                                                                    i24 = qVar.f15245g;
                                                                    if (zA4) {
                                                                        c1260a = (C1260a) SemanticsConfigurationKt.a(lVar5, vVar3);
                                                                        if (c1260a != null) {
                                                                            str = str2;
                                                                        }
                                                                        androidx.compose.ui.text.E e11 = (androidx.compose.ui.text.E) lVar5.q(vVar4);
                                                                        int iQ4 = q(i17);
                                                                        long j17 = e11.f15316a;
                                                                        s(g(iQ4, Integer.valueOf((int) (j17 >> 32)), Integer.valueOf((int) (j17 & 4294967295L)), Integer.valueOf(str.length()), B(str)));
                                                                        w(i24);
                                                                    } else {
                                                                        if (kotlin.jvm.internal.i.a(vVar6, vVar7)) {
                                                                            zA5 = true;
                                                                        } else {
                                                                            zA5 = kotlin.jvm.internal.i.a(vVar6, SemanticsProperties.f15166t);
                                                                        }
                                                                        if (zA5) {
                                                                            m(layoutNode);
                                                                            arrayList5 = arrayList6;
                                                                            h0A = K0.a(i17, arrayList5);
                                                                            kotlin.jvm.internal.i.b(h0A);
                                                                            h0A.f14921f = (androidx.compose.ui.semantics.j) SemanticsConfigurationKt.a(lVar5, vVar7);
                                                                            h0A.f14922g = (androidx.compose.ui.semantics.j) SemanticsConfigurationKt.a(lVar5, SemanticsProperties.f15166t);
                                                                            if (h0A.f14918c.contains(h0A)) {
                                                                                this.f14746a.getSnapshotObserver().b(h0A, this.f14745L, new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(h0A, this));
                                                                            }
                                                                        } else {
                                                                            arrayList5 = arrayList6;
                                                                            if (kotlin.jvm.internal.i.a(vVar6, SemanticsProperties.f15157k)) {
                                                                                kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                                                                                if (((Boolean) obj3).booleanValue()) {
                                                                                    s(f(q(i24), 8));
                                                                                }
                                                                                u(this, q(i24), 2048, 0, 8);
                                                                            } else {
                                                                                vVar5 = androidx.compose.ui.semantics.k.f15230w;
                                                                                if (kotlin.jvm.internal.i.a(vVar6, vVar5)) {
                                                                                    list = (List) lVar5.q(vVar5);
                                                                                    list2 = (List) SemanticsConfigurationKt.a(lVar4, vVar5);
                                                                                    if (list2 != null) {
                                                                                        linkedHashSet = new LinkedHashSet();
                                                                                        size = list.size();
                                                                                        while (i25 < size) {
                                                                                            linkedHashSet.add(((androidx.compose.ui.semantics.e) list.get(i25)).f15197a);
                                                                                        }
                                                                                        linkedHashSet2 = new LinkedHashSet();
                                                                                        size2 = list2.size();
                                                                                        while (i26 < size2) {
                                                                                            linkedHashSet2.add(((androidx.compose.ui.semantics.e) list2.get(i26)).f15197a);
                                                                                        }
                                                                                        if (!linkedHashSet.containsAll(linkedHashSet2)) {
                                                                                        }
                                                                                    } else if (!list.isEmpty()) {
                                                                                    }
                                                                                    z14 = true;
                                                                                } else {
                                                                                    if (obj3 instanceof androidx.compose.ui.semantics.a) {
                                                                                        aVar = (androidx.compose.ui.semantics.a) obj3;
                                                                                        objA = SemanticsConfigurationKt.a(lVar4, vVar6);
                                                                                        Comparator<androidx.compose.ui.semantics.q>[] comparatorArr2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.f14781a;
                                                                                        if (aVar != objA) {
                                                                                            if (objA instanceof androidx.compose.ui.semantics.a) {
                                                                                                aVar2 = (androidx.compose.ui.semantics.a) objA;
                                                                                                if (kotlin.jvm.internal.i.a(aVar.f15190a, aVar2.f15190a)) {
                                                                                                    T t11 = aVar2.f15191b;
                                                                                                    T t12 = aVar.f15191b;
                                                                                                    if (t12 == 0) {
                                                                                                    }
                                                                                                    j12 >>= c10;
                                                                                                    arrayList7 = arrayList5;
                                                                                                    lVar5 = lVar5;
                                                                                                    lVar4 = lVar4;
                                                                                                    i17 = i17;
                                                                                                    i30 = i23;
                                                                                                    k13 = k13;
                                                                                                    objArr4 = objArr4;
                                                                                                    arrayList8 = arrayList8;
                                                                                                    jArr5 = jArr5;
                                                                                                    objArr3 = objArr3;
                                                                                                    i35 = i35;
                                                                                                    i36 = i36;
                                                                                                    i34 = i34;
                                                                                                    int i43 = i22;
                                                                                                    i37++;
                                                                                                    length4 = i43;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (!z13) {
                                                                                            z14 = false;
                                                                                        }
                                                                                    }
                                                                                    z14 = true;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                arrayList5 = arrayList6;
                                                            }
                                                        }
                                                        arrayList5 = arrayList7;
                                                        c10 = '\b';
                                                    }
                                                    z14 = z10;
                                                }
                                                arrayList5 = arrayList7;
                                                c10 = c11;
                                                z14 = z10;
                                            }
                                            z10 = z14;
                                            j12 >>= c10;
                                            arrayList7 = arrayList5;
                                            lVar5 = lVar5;
                                            lVar4 = lVar4;
                                            i17 = i17;
                                            i30 = i23;
                                            k13 = k13;
                                            objArr4 = objArr4;
                                            arrayList8 = arrayList8;
                                            jArr5 = jArr5;
                                            objArr3 = objArr3;
                                            i35 = i35;
                                            i36 = i36;
                                            i34 = i34;
                                            int i44 = i22;
                                            i37++;
                                            length4 = i44;
                                        } else {
                                            i22 = length4;
                                            i23 = i30;
                                        }
                                        arrayList5 = arrayList7;
                                        c10 = '\b';
                                        j12 >>= c10;
                                        arrayList7 = arrayList5;
                                        lVar5 = lVar5;
                                        lVar4 = lVar4;
                                        i17 = i17;
                                        i30 = i23;
                                        k13 = k13;
                                        objArr4 = objArr4;
                                        arrayList8 = arrayList8;
                                        jArr5 = jArr5;
                                        objArr3 = objArr3;
                                        i35 = i35;
                                        i36 = i36;
                                        i34 = i34;
                                        int i45 = i22;
                                        i37++;
                                        length4 = i45;
                                    }
                                    i19 = length4;
                                    objArr = objArr4;
                                    arrayList3 = arrayList8;
                                    jArr3 = jArr5;
                                    i20 = i35;
                                    objArr2 = objArr3;
                                    int i46 = i36;
                                    i13 = i34;
                                    k10 = k13;
                                    lVar2 = lVar5;
                                    lVar = lVar4;
                                    i18 = i17;
                                    i16 = i30;
                                    arrayList4 = arrayList7;
                                    i21 = 1;
                                    i15 = 8;
                                    if (i46 != 8) {
                                        break;
                                    }
                                } else {
                                    i19 = length4;
                                    i16 = i30;
                                    objArr = objArr4;
                                    arrayList3 = arrayList8;
                                    jArr3 = jArr5;
                                    i20 = i35;
                                    objArr2 = objArr3;
                                    i13 = i34;
                                    k10 = k13;
                                    lVar2 = lVar5;
                                    lVar = lVar4;
                                    i18 = i17;
                                    arrayList4 = arrayList7;
                                    i21 = 1;
                                    i15 = 8;
                                }
                                int i47 = i20;
                                if (i47 == i19) {
                                    break;
                                }
                                int i48 = i47 + i21;
                                arrayList7 = arrayList4;
                                lVar4 = lVar;
                                i17 = i18;
                                i30 = i16;
                                k13 = k10;
                                length3 = i14;
                                objArr4 = objArr;
                                jArr5 = jArr3;
                                objArr3 = objArr2;
                                i34 = i13;
                                i35 = i48;
                                length4 = i19;
                                lVar3 = lVar2;
                                arrayList8 = arrayList3;
                            }
                        } else {
                            lVar = lVar4;
                            i18 = i17;
                            i13 = i32;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList7;
                            i14 = length3;
                            i15 = 8;
                            i16 = i30;
                            z10 = false;
                        }
                        if (!z10) {
                            Comparator<androidx.compose.ui.semantics.q>[] comparatorArr3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.f14781a;
                            Iterator<Map.Entry<? extends androidx.compose.ui.semantics.v<?>, ? extends Object>> it = lVar.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z11 = false;
                                    break;
                                }
                                if (!qVar.i().f15234b.b(it.next().getKey())) {
                                    z11 = true;
                                    break;
                                }
                            }
                            z10 = z11;
                        }
                        if (z10) {
                            u(this, q(i18), 2048, 0, i15);
                        }
                    }
                    j10 >>= i15;
                    abstractC0883k2 = abstractC0883k;
                    i33 = i12 + 1;
                    i31 = i15;
                    i30 = i16;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                    length3 = i14;
                    arrayList8 = arrayList3;
                    i32 = i13;
                    arrayList7 = arrayList4;
                }
                arrayList = arrayList8;
                arrayList2 = arrayList7;
                iArr = iArr3;
                jArr = jArr4;
                i10 = length3;
                i11 = i30;
                if (i32 != i31) {
                    return;
                }
            } else {
                arrayList = arrayList8;
                arrayList2 = arrayList7;
                iArr = iArr3;
                jArr = jArr4;
                i10 = length3;
                i11 = i30;
            }
            int i49 = i10;
            if (i11 == i49) {
                return;
            }
            i30 = i11 + 1;
            abstractC0883k2 = abstractC0883k;
            arrayList7 = arrayList2;
            length3 = i49;
            iArr3 = iArr;
            jArr4 = jArr;
            arrayList8 = arrayList;
        }
    }

    public final void y(LayoutNode layoutNode, androidx.collection.C c10) {
        androidx.compose.ui.semantics.l lVarF;
        LayoutNode layoutNodeB;
        if (layoutNode.c() && !this.f14746a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.f14389G.d(8)) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.b(layoutNode, new Ia.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                    @Override // Ia.l
                    public final Boolean invoke(LayoutNode layoutNode2) {
                        return Boolean.valueOf(layoutNode2.f14389G.d(8));
                    }
                });
            }
            if (layoutNode == null || (lVarF = layoutNode.f()) == null) {
                return;
            }
            if (!lVarF.f15236d && (layoutNodeB = AndroidComposeViewAccessibilityDelegateCompat_androidKt.b(layoutNode, new Ia.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                @Override // Ia.l
                public final Boolean invoke(LayoutNode layoutNode2) {
                    androidx.compose.ui.semantics.l lVarF2 = layoutNode2.f();
                    boolean z10 = false;
                    if (lVarF2 != null && lVarF2.f15236d) {
                        z10 = true;
                    }
                    return Boolean.valueOf(z10);
                }
            })) != null) {
                layoutNode = layoutNodeB;
            }
            int i10 = layoutNode.f14401c;
            if (c10.b(i10)) {
                u(this, q(i10), 2048, 1, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r0v18, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    public final void z(LayoutNode layoutNode) {
        if (layoutNode.c() && !this.f14746a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int i10 = layoutNode.f14401c;
            androidx.compose.ui.semantics.j jVarB = this.f14760p.b(i10);
            androidx.compose.ui.semantics.j jVarB2 = this.f14761q.b(i10);
            if (jVarB == null && jVarB2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventF = f(i10, 4096);
            if (jVarB != null) {
                accessibilityEventF.setScrollX((int) ((Number) jVarB.f15204a.invoke()).floatValue());
                accessibilityEventF.setMaxScrollX((int) ((Number) jVarB.f15205b.invoke()).floatValue());
            }
            if (jVarB2 != null) {
                accessibilityEventF.setScrollY((int) ((Number) jVarB2.f15204a.invoke()).floatValue());
                accessibilityEventF.setMaxScrollY((int) ((Number) jVarB2.f15205b.invoke()).floatValue());
            }
            s(accessibilityEventF);
        }
    }
}
