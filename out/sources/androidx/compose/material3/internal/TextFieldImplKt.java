package androidx.compose.material3.internal;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.C0902b;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.b0;
import androidx.compose.animation.core.d0;
import androidx.compose.animation.core.e0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TypographyKt;
import androidx.compose.material3.q0;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.Q0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.graphics.c0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.InterfaceC1172s;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.G;
import androidx.compose.ui.text.input.D;
import androidx.compose.ui.text.input.E;
import com.google.android.gms.internal.measurement.C1787c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldImplKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12498b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f12503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f12504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final androidx.compose.ui.h f12505i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f12497a = p013b0.b.a(0, 0, 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12499c = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12500d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f12501e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f12502f = 24;

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12511a;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[InputPhase.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f12511a = iArr2;
        }
    }

    static {
        float f10 = 16;
        f12498b = f10;
        f12503g = f10;
        f12504h = f10;
        float f11 = 48;
        f12505i = W.a(f11, f11, androidx.compose.ui.h.a.f13984b);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0137  */
    /* JADX WARN: Code duplicated, block: B:103:0x013d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0143  */
    /* JADX WARN: Code duplicated, block: B:106:0x0146  */
    /* JADX WARN: Code duplicated, block: B:109:0x014f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0154  */
    /* JADX WARN: Code duplicated, block: B:113:0x015a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0161  */
    /* JADX WARN: Code duplicated, block: B:118:0x0166  */
    /* JADX WARN: Code duplicated, block: B:121:0x016f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0174  */
    /* JADX WARN: Code duplicated, block: B:125:0x017a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0180  */
    /* JADX WARN: Code duplicated, block: B:131:0x0189  */
    /* JADX WARN: Code duplicated, block: B:133:0x0192  */
    /* JADX WARN: Code duplicated, block: B:135:0x0198  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:143:0x01af  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:158:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:161:0x01df  */
    /* JADX WARN: Code duplicated, block: B:165:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:166:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:168:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:170:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:171:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:175:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:176:0x0202  */
    /* JADX WARN: Code duplicated, block: B:178:0x0206  */
    /* JADX WARN: Code duplicated, block: B:180:0x020c  */
    /* JADX WARN: Code duplicated, block: B:181:0x020f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0217  */
    /* JADX WARN: Code duplicated, block: B:186:0x021a  */
    /* JADX WARN: Code duplicated, block: B:188:0x021e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0224  */
    /* JADX WARN: Code duplicated, block: B:191:0x0227  */
    /* JADX WARN: Code duplicated, block: B:201:0x025b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x025d  */
    /* JADX WARN: Code duplicated, block: B:203:0x025f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0263  */
    /* JADX WARN: Code duplicated, block: B:206:0x0265  */
    /* JADX WARN: Code duplicated, block: B:208:0x0269  */
    /* JADX WARN: Code duplicated, block: B:209:0x026b  */
    /* JADX WARN: Code duplicated, block: B:211:0x026f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0271  */
    /* JADX WARN: Code duplicated, block: B:214:0x0275  */
    /* JADX WARN: Code duplicated, block: B:215:0x0277  */
    /* JADX WARN: Code duplicated, block: B:217:0x027b  */
    /* JADX WARN: Code duplicated, block: B:218:0x027d  */
    /* JADX WARN: Code duplicated, block: B:220:0x0281  */
    /* JADX WARN: Code duplicated, block: B:221:0x0284  */
    /* JADX WARN: Code duplicated, block: B:223:0x0288  */
    /* JADX WARN: Code duplicated, block: B:224:0x028b  */
    /* JADX WARN: Code duplicated, block: B:226:0x028f  */
    /* JADX WARN: Code duplicated, block: B:227:0x0292  */
    /* JADX WARN: Code duplicated, block: B:230:0x029a  */
    /* JADX WARN: Code duplicated, block: B:231:0x029c  */
    /* JADX WARN: Code duplicated, block: B:234:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:235:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:238:0x02af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:244:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:246:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:248:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:249:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:251:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:252:0x02fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x0300  */
    /* JADX WARN: Code duplicated, block: B:254:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:255:0x0305  */
    /* JADX WARN: Code duplicated, block: B:256:0x0308  */
    /* JADX WARN: Code duplicated, block: B:259:0x032d  */
    /* JADX WARN: Code duplicated, block: B:261:0x0337  */
    /* JADX WARN: Code duplicated, block: B:269:0x0354  */
    /* JADX WARN: Code duplicated, block: B:275:0x0362  */
    /* JADX WARN: Code duplicated, block: B:281:0x036f  */
    /* JADX WARN: Code duplicated, block: B:282:0x0371  */
    /* JADX WARN: Code duplicated, block: B:285:0x0397  */
    /* JADX WARN: Code duplicated, block: B:287:0x039a  */
    /* JADX WARN: Code duplicated, block: B:289:0x039d  */
    /* JADX WARN: Code duplicated, block: B:290:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:292:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:295:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:297:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:300:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:302:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:303:0x03db  */
    /* JADX WARN: Code duplicated, block: B:306:0x041d  */
    /* JADX WARN: Code duplicated, block: B:308:0x0420  */
    /* JADX WARN: Code duplicated, block: B:311:0x0426  */
    /* JADX WARN: Code duplicated, block: B:313:0x042c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:315:0x042f  */
    /* JADX WARN: Code duplicated, block: B:318:0x044b  */
    /* JADX WARN: Code duplicated, block: B:320:0x044e  */
    /* JADX WARN: Code duplicated, block: B:323:0x0454  */
    /* JADX WARN: Code duplicated, block: B:325:0x045a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:327:0x045d  */
    /* JADX WARN: Code duplicated, block: B:330:0x049f  */
    /* JADX WARN: Code duplicated, block: B:332:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:334:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:335:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:337:0x04af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:338:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:341:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:343:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:345:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:346:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:348:0x04da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:349:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:352:0x0521  */
    /* JADX WARN: Code duplicated, block: B:354:0x0525  */
    /* JADX WARN: Code duplicated, block: B:357:0x0539 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:358:0x053b  */
    /* JADX WARN: Code duplicated, block: B:361:0x055c  */
    /* JADX WARN: Code duplicated, block: B:362:0x0561  */
    /* JADX WARN: Code duplicated, block: B:365:0x0582  */
    /* JADX WARN: Code duplicated, block: B:367:0x0586  */
    /* JADX WARN: Code duplicated, block: B:370:0x05d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:371:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:374:0x0642  */
    /* JADX WARN: Code duplicated, block: B:376:0x0645  */
    /* JADX WARN: Code duplicated, block: B:379:0x0667  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:380:0x066c  */
    /* JADX WARN: Code duplicated, block: B:382:0x0670  */
    /* JADX WARN: Code duplicated, block: B:383:0x0673 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:384:0x0675  */
    /* JADX WARN: Code duplicated, block: B:385:0x0678  */
    /* JADX WARN: Code duplicated, block: B:388:0x0680  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:391:0x0698  */
    /* JADX WARN: Code duplicated, block: B:396:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:399:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:400:0x06cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:401:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:402:0x06d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:403:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:404:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:407:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:408:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:411:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:414:0x0724  */
    /* JADX WARN: Code duplicated, block: B:417:0x072c  */
    /* JADX WARN: Code duplicated, block: B:418:0x072f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:419:0x0731  */
    /* JADX WARN: Code duplicated, block: B:420:0x0734 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:421:0x0736  */
    /* JADX WARN: Code duplicated, block: B:422:0x0739  */
    /* JADX WARN: Code duplicated, block: B:425:0x0743  */
    /* JADX WARN: Code duplicated, block: B:428:0x0769  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:431:0x0771  */
    /* JADX WARN: Code duplicated, block: B:432:0x0774 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:433:0x0776  */
    /* JADX WARN: Code duplicated, block: B:434:0x0779 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:435:0x077b  */
    /* JADX WARN: Code duplicated, block: B:436:0x077e  */
    /* JADX WARN: Code duplicated, block: B:439:0x0788  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:440:0x078e  */
    /* JADX WARN: Code duplicated, block: B:443:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:444:0x07a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:445:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:446:0x07ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:447:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:448:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:451:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:452:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:455:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:456:0x07da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:457:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:458:0x07df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:459:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:460:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:463:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:465:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:468:0x080d  */
    /* JADX WARN: Code duplicated, block: B:470:0x0810  */
    /* JADX WARN: Code duplicated, block: B:471:0x0821  */
    /* JADX WARN: Code duplicated, block: B:473:0x082d  */
    /* JADX WARN: Code duplicated, block: B:476:0x0859 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:477:0x085b  */
    /* JADX WARN: Code duplicated, block: B:479:0x0896  */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:483:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:485:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x009e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0106  */
    /* JADX WARN: Code duplicated, block: B:85:0x0109  */
    /* JADX WARN: Code duplicated, block: B:89:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    /* JADX WARN: Code duplicated, block: B:92:0x011f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0125  */
    /* JADX WARN: Code duplicated, block: B:95:0x0128  */
    /* JADX WARN: Code duplicated, block: B:99:0x0132 A[PHI: r25
      0x0132: PHI (r25v18 int) = (r25v0 int), (r25v3 int), (r25v4 int) binds: [B:98:0x0130, B:106:0x0146, B:105:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(final TextFieldType textFieldType, final String str, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, final E e10, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8, boolean z10, boolean z11, boolean z12, final androidx.compose.foundation.interaction.j jVar, final L l10, final TextFieldColors textFieldColors, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar10;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar14;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        InterfaceC1084f.a.C0153a c0153a;
        Object objE;
        String str2;
        boolean zBooleanValue;
        InputPhase inputPhase;
        long j;
        int i38;
        final F f10;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19;
        final F f11;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar20;
        boolean z19;
        long jB;
        long jB2;
        long j10;
        boolean z20;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21;
        int iOrdinal;
        float f12;
        float f13;
        boolean z21;
        int iOrdinal2;
        boolean z22;
        float f14;
        ?? r10;
        final boolean z23;
        int iOrdinal3;
        float f15;
        boolean z24;
        int iOrdinal4;
        float f16;
        ?? r12;
        final Transition.d dVarD;
        int iOrdinal5;
        float f17;
        boolean z25;
        int iOrdinal6;
        ?? r11;
        Transition.d dVarD2;
        InputPhase inputPhase2;
        int[] iArr;
        long j11;
        androidx.compose.ui.graphics.colorspace.c cVarF;
        boolean zK;
        Object objF;
        InputPhase inputPhase3;
        long j12;
        boolean z26;
        InputPhase inputPhase4;
        long j13;
        final Transition.d dVarD3;
        androidx.compose.ui.graphics.colorspace.c cVarF2;
        boolean zK2;
        Object objF2;
        final Transition.d dVarD4;
        final float fFloatValue;
        ComposableLambdaImpl composableLambdaImplB;
        TextFieldColors textFieldColors2;
        long j14;
        Object objF3;
        boolean z27;
        ComposableLambdaImpl composableLambdaImplB2;
        long j15;
        Object objF4;
        final Transition.d dVar;
        boolean z28;
        ComposableLambdaImpl composableLambdaImplB3;
        long j16;
        boolean z29;
        ComposableLambdaImpl composableLambdaImplB4;
        final long j17;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar22;
        ComposableLambdaImpl composableLambdaImplB5;
        boolean z30;
        final long j18;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar23;
        ComposableLambdaImpl composableLambdaImplB6;
        boolean z31;
        final long j19;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar24;
        ComposableLambdaImpl composableLambdaImplB7;
        int iOrdinal7;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar25;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar26;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar27;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar28;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar29;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30;
        Object objF5;
        final X x10;
        boolean zG;
        Object objF6;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(1514469103);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = i10 | (c1086gP.K(textFieldType) ? 4 : 2);
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= c1086gP.K(str) ? 32 : 16;
        }
        int i39 = i13;
        if ((i12 & 4) == 0) {
            if ((i10 & 384) == 0) {
                i39 |= c1086gP.k(pVar) ? 256 : 128;
            }
            if ((i12 & 8) != 0) {
                i39 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c1086gP.K(e10)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i39 |= i14;
            }
            if ((i12 & 16) != 0) {
                i39 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c1086gP.k(pVar2)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i39 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                i39 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(pVar3)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i39 |= i17;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i39 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(pVar4)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i39 |= i19;
            }
            i20 = i12 & 128;
            if (i20 != 0) {
                i39 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.k(pVar5)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i39 |= i21;
            }
            i22 = i12 & 256;
            if (i22 != 0) {
                i39 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.k(pVar6)) {
                    i23 = 67108864;
                } else {
                    i23 = 33554432;
                }
                i39 |= i23;
            }
            i24 = i12 & 512;
            i25 = 805306368;
            if (i24 == 0) {
                i39 |= i25;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(pVar7)) {
                    i25 = 536870912;
                } else {
                    i25 = 268435456;
                }
                i39 |= i25;
            }
            i26 = i12 & 1024;
            if (i26 != 0) {
                i27 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                i27 = i11 | (c1086gP.k(pVar8) ? 4 : 2);
            } else {
                i27 = i11;
            }
            i28 = i12 & 2048;
            if (i28 != 0) {
                i27 |= 48;
            } else if ((i11 & 48) == 0) {
                i27 |= c1086gP.c(z10) ? 32 : 16;
            }
            i29 = i27;
            i30 = i12 & 4096;
            if (i30 != 0) {
                i29 |= 384;
                i31 = i30;
            } else {
                i31 = i30;
                if ((i11 & 384) != 0) {
                    if (c1086gP.c(z11)) {
                        i32 = 256;
                    } else {
                        i32 = 128;
                    }
                    i29 |= i32;
                }
            }
            i33 = i12 & 8192;
            if (i33 != 0) {
                i29 |= 3072;
            } else if ((i11 & 3072) != 0) {
                if (c1086gP.c(z12)) {
                    i34 = 2048;
                } else {
                    i34 = 1024;
                }
                i29 |= i34;
            }
            if ((i12 & 16384) != 0) {
                i29 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i29 |= c1086gP.K(jVar) ? 16384 : 8192;
            }
            if ((32768 & i12) != 0) {
                i29 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (c1086gP.K(l10)) {
                    i35 = 131072;
                } else {
                    i35 = 65536;
                }
                i29 |= i35;
            }
            if ((i12 & 65536) != 0) {
                i29 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c1086gP.K(textFieldColors)) {
                    i36 = 1048576;
                } else {
                    i36 = 524288;
                }
                i29 |= i36;
            }
            if ((i12 & 131072) != 0) {
                i29 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (c1086gP.k(pVar9)) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i29 |= i37;
            }
            if ((306783379 & i39) != 306783378 && (4793491 & i29) == 4793490 && c1086gP.s()) {
                c1086gP.w();
                pVar30 = pVar3;
                pVar29 = pVar4;
                pVar28 = pVar5;
                pVar26 = pVar6;
                pVar27 = pVar7;
                pVar25 = pVar8;
                z13 = z10;
                z14 = z11;
                z15 = z12;
            } else {
                if (i16 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar3;
                }
                if (i18 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i20 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar5;
                }
                if (i22 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar6;
                }
                if (i24 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar7;
                }
                if (i26 != 0) {
                    pVar15 = null;
                } else {
                    pVar15 = pVar8;
                }
                if (i28 != 0) {
                    z13 = false;
                } else {
                    z13 = z10;
                }
                if (i31 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i33 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if ((i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i39 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17;
                Object objF7 = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (!z18 || objF7 == c0153a) {
                    objE = e10.e(new C1260a(6, str, null));
                    c1086gP.E(objE);
                } else {
                    objE = objF7;
                }
                str2 = ((D) objE).f15484a.f15408c;
                zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(jVar, c1086gP, (i29 >> 12) & 14).getValue()).booleanValue();
                if (zBooleanValue) {
                    inputPhase = InputPhase.f12493b;
                } else if (str2.length() == 0) {
                    inputPhase = InputPhase.f12494c;
                } else {
                    inputPhase = InputPhase.f12495d;
                }
                InputPhase inputPhase5 = inputPhase;
                if (!z14) {
                    j = textFieldColors.f12368z;
                } else if (z15) {
                    j = textFieldColors.f12327A;
                } else if (zBooleanValue) {
                    j = textFieldColors.f12366x;
                } else {
                    j = textFieldColors.f12367y;
                }
                q0 q0Var = (q0) c1086gP.x(TypographyKt.f12404a);
                i38 = i29;
                f10 = q0Var.j;
                pVar16 = pVar15;
                pVar17 = pVar11;
                long jB3 = f10.b();
                pVar18 = pVar12;
                pVar19 = pVar13;
                long j20 = H.f13504l;
                boolean zC = H.c(jB3, j20);
                f11 = q0Var.f12698l;
                pVar20 = pVar10;
                z19 = !(zC || H.c(f11.b(), j20)) || (!H.c(f10.b(), j20) && H.c(f11.b(), j20));
                jB = f11.b();
                if (z19 && jB == 16) {
                    jB = j;
                }
                jB2 = f10.b();
                if (z19 && jB2 == 16) {
                    jB2 = j;
                }
                j10 = jB;
                if (pVar2 != null) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                pVar21 = pVar14;
                Transition transitionF = TransitionKt.f(inputPhase5, "TextFieldInputState", c1086gP, 48, 0);
                e0 e0Var = VectorConvertersKt.f9477a;
                b0<S> b0Var = transitionF.f9429a;
                InputPhase inputPhase6 = (InputPhase) b0Var.a();
                c1086gP.L(-2036730335);
                iOrdinal = inputPhase6.ordinal();
                f12 = 1.0f;
                if (iOrdinal == 0) {
                    f13 = 1.0f;
                    z21 = false;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f13 = 1.0f;
                    z21 = false;
                } else {
                    z21 = false;
                    f13 = 0.0f;
                }
                c1086gP.T(z21);
                Float fValueOf = Float.valueOf(f13);
                C1085f0 c1085f0 = transitionF.f9432d;
                InputPhase inputPhase7 = (InputPhase) c1085f0.getValue();
                c1086gP.L(-2036730335);
                iOrdinal2 = inputPhase7.ordinal();
                if (iOrdinal2 != 0) {
                    z22 = zBooleanValue;
                    if (iOrdinal2 == 1) {
                        r10 = 0;
                        f14 = 0.0f;
                    } else if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c1086gP.T(r10);
                    z23 = z19;
                    Transition.d dVarD5 = TransitionKt.d(transitionF, fValueOf, Float.valueOf(f14), TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.f12507h.invoke(transitionF.f(), c1086gP, Integer.valueOf((int) r10)), e0Var, c1086gP, 196608);
                    InputPhase inputPhase8 = (InputPhase) b0Var.a();
                    c1086gP.L(1435837472);
                    iOrdinal3 = inputPhase8.ordinal();
                    if (iOrdinal3 == 0) {
                        f15 = 1.0f;
                        z24 = false;
                    } else {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z20) {
                            f15 = 1.0f;
                            z24 = false;
                        }
                        z24 = false;
                        f15 = 0.0f;
                    }
                    c1086gP.T(z24);
                    Float fValueOf2 = Float.valueOf(f15);
                    InputPhase inputPhase9 = (InputPhase) c1085f0.getValue();
                    c1086gP.L(1435837472);
                    iOrdinal4 = inputPhase9.ordinal();
                    if (iOrdinal4 == 0) {
                        f16 = 1.0f;
                        r12 = 0;
                    } else {
                        if (iOrdinal4 != 1) {
                            if (iOrdinal4 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z20) {
                            f16 = 1.0f;
                            r12 = 0;
                        }
                        r12 = 0;
                        f16 = 0.0f;
                    }
                    c1086gP.T(r12);
                    dVarD = TransitionKt.d(transitionF, fValueOf2, Float.valueOf(f16), TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.f12509h.invoke(transitionF.f(), c1086gP, Integer.valueOf((int) r12)), e0Var, c1086gP, 196608);
                    InputPhase inputPhase10 = (InputPhase) b0Var.a();
                    c1086gP.L(1128033978);
                    iOrdinal5 = inputPhase10.ordinal();
                    if (iOrdinal5 == 0) {
                        f17 = 1.0f;
                        z25 = false;
                    } else {
                        if (iOrdinal5 != 1) {
                            if (iOrdinal5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z20) {
                            z25 = false;
                            f17 = 0.0f;
                        }
                        f17 = 1.0f;
                        z25 = false;
                    }
                    c1086gP.T(z25);
                    Float fValueOf3 = Float.valueOf(f17);
                    InputPhase inputPhase11 = (InputPhase) c1085f0.getValue();
                    c1086gP.L(1128033978);
                    iOrdinal6 = inputPhase11.ordinal();
                    if (iOrdinal6 == 0) {
                        r11 = 0;
                    } else {
                        if (iOrdinal6 != 1) {
                            if (iOrdinal6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z20) {
                            r11 = 0;
                            f12 = 0.0f;
                        }
                        r11 = 0;
                    }
                    c1086gP.T(r11);
                    dVarD2 = TransitionKt.d(transitionF, fValueOf3, Float.valueOf(f12), TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.f12510h.invoke(transitionF.f(), c1086gP, Integer.valueOf((int) r11)), e0Var, c1086gP, 196608);
                    inputPhase2 = (InputPhase) c1085f0.getValue();
                    c1086gP.L(-107432127);
                    iArr = a.f12511a;
                    if (iArr[inputPhase2.ordinal()] == 1) {
                        j11 = j10;
                    } else {
                        j11 = jB2;
                    }
                    c1086gP.T(false);
                    cVarF = H.f(j11);
                    zK = c1086gP.K(cVarF);
                    objF = c1086gP.f();
                    if (zK || objF == c0153a) {
                        objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                        c1086gP.E(objF);
                    }
                    d0 d0Var = (d0) objF;
                    inputPhase3 = (InputPhase) b0Var.a();
                    c1086gP.L(-107432127);
                    if (iArr[inputPhase3.ordinal()] == 1) {
                        z26 = false;
                        j12 = j10;
                    } else {
                        j12 = jB2;
                        z26 = false;
                    }
                    c1086gP.T(z26);
                    H h8 = new H(j12);
                    inputPhase4 = (InputPhase) c1085f0.getValue();
                    c1086gP.L(-107432127);
                    if (iArr[inputPhase4.ordinal()] == 1) {
                        j13 = j10;
                    } else {
                        j13 = jB2;
                    }
                    c1086gP.T(false);
                    dVarD3 = TransitionKt.d(transitionF, h8, new H(j13), TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.f12508h.invoke(transitionF.f(), c1086gP, 0), d0Var, c1086gP, 196608);
                    c1086gP.L(1023351670);
                    c1086gP.T(false);
                    cVarF2 = H.f(j);
                    zK2 = c1086gP.K(cVarF2);
                    objF2 = c1086gP.f();
                    if (zK2 || objF2 == c0153a) {
                        objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                        c1086gP.E(objF2);
                    }
                    d0 d0Var2 = (d0) objF2;
                    c1086gP.L(1023351670);
                    c1086gP.T(false);
                    H h10 = new H(j);
                    c1086gP.L(1023351670);
                    c1086gP.T(false);
                    dVarD4 = TransitionKt.d(transitionF, h10, new H(j), TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.f12506h.invoke(transitionF.f(), c1086gP, 0), d0Var2, c1086gP, 196608);
                    fFloatValue = ((Number) dVarD5.f9457k.getValue()).floatValue();
                    c1086gP.L(-156998101);
                    if (pVar2 == null) {
                        composableLambdaImplB = null;
                    } else {
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1236585568, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    F fA = G.a(f10, f11, fFloatValue);
                                    TextFieldImplKt.b(dVarD4.getValue().f13506a, z23 ? F.a(fA, dVarD3.getValue().f13506a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214) : fA, pVar2, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    c1086gP.T(false);
                    if (z14) {
                        textFieldColors2 = textFieldColors;
                        if (z15) {
                            j14 = textFieldColors2.f12331E;
                        } else if (z22) {
                            j14 = textFieldColors2.f12328B;
                        } else {
                            j14 = textFieldColors2.f12329C;
                        }
                    } else {
                        textFieldColors2 = textFieldColors;
                        j14 = textFieldColors2.f12330D;
                    }
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.e(new Ia.a<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Boolean invoke() {
                                return Boolean.valueOf(dVarD.getValue().floatValue() > 0.0f);
                            }
                        }, Q0.f12888a);
                        c1086gP.E(objF3);
                    }
                    N0 n10 = (N0) objF3;
                    c1086gP.L(-156965270);
                    if (pVar20 == null && str2.length() == 0 && ((Boolean) n10.getValue()).booleanValue()) {
                        final long j21 = j14;
                        composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(-660524084, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // Ia.q
                            public final p293xa.r invoke(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                                androidx.compose.ui.h hVar2 = hVar;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= interfaceC1084f3.K(hVar2) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    boolean zK3 = interfaceC1084f3.K(dVarD);
                                    final N0<Float> n11 = dVarD;
                                    Object objF8 = interfaceC1084f3.f();
                                    if (zK3 || objF8 == InterfaceC1084f.a.f12980a) {
                                        objF8 = new Ia.l<U, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(U u10) {
                                                u10.b(n11.getValue().floatValue());
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF8);
                                    }
                                    androidx.compose.ui.h hVarA = T.a(hVar2, (Ia.l) objF8);
                                    long j22 = j21;
                                    F f18 = f10;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar20;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar32 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar32);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    TextFieldImplKt.b(j22, f18, pVar31, interfaceC1084f3, 0);
                                    interfaceC1084f3.J();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                        z27 = false;
                    } else {
                        z27 = false;
                        composableLambdaImplB2 = null;
                    }
                    c1086gP.T(z27);
                    if (!z14) {
                        j15 = textFieldColors2.f12338L;
                    } else if (z15) {
                        j15 = textFieldColors2.f12339M;
                    } else if (z22) {
                        j15 = textFieldColors2.f12336J;
                    } else {
                        j15 = textFieldColors2.f12337K;
                    }
                    objF4 = c1086gP.f();
                    if (objF4 == c0153a) {
                        dVar = dVarD2;
                        objF4 = J0.e(new Ia.a<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Boolean invoke() {
                                return Boolean.valueOf(dVar.getValue().floatValue() > 0.0f);
                            }
                        }, Q0.f12888a);
                        c1086gP.E(objF4);
                    } else {
                        dVar = dVarD2;
                    }
                    N0 n11 = (N0) objF4;
                    c1086gP.L(-156940524);
                    if (pVar19 == null && ((Boolean) n11.getValue()).booleanValue()) {
                        final Transition.d dVar2 = dVar;
                        final long j22 = j15;
                        composableLambdaImplB3 = androidx.compose.runtime.internal.a.b(274398694, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                                    boolean zK3 = interfaceC1084f3.K(dVar2);
                                    final N0<Float> n12 = dVar2;
                                    Object objF8 = interfaceC1084f3.f();
                                    if (zK3 || objF8 == InterfaceC1084f.a.f12980a) {
                                        objF8 = new Ia.l<U, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(U u10) {
                                                u10.b(n12.getValue().floatValue());
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF8);
                                    }
                                    androidx.compose.ui.h hVarA = T.a(aVar, (Ia.l) objF8);
                                    long j23 = j22;
                                    F f18 = f10;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar19;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar2);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar32 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar32);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    TextFieldImplKt.b(j23, f18, pVar31, interfaceC1084f3, 0);
                                    interfaceC1084f3.J();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                        z28 = false;
                    } else {
                        z28 = false;
                        composableLambdaImplB3 = null;
                    }
                    c1086gP.T(z28);
                    if (!z14) {
                        j16 = textFieldColors2.f12342P;
                    } else if (z15) {
                        j16 = textFieldColors2.f12343Q;
                    } else if (z22) {
                        j16 = textFieldColors2.f12340N;
                    } else {
                        j16 = textFieldColors2.f12341O;
                    }
                    c1086gP.L(-156921964);
                    if (pVar21 == null && ((Boolean) n11.getValue()).booleanValue()) {
                        final Transition.d dVar3 = dVar;
                        final long j23 = j16;
                        composableLambdaImplB4 = androidx.compose.runtime.internal.a.b(-1526229403, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                                    boolean zK3 = interfaceC1084f3.K(dVar3);
                                    final N0<Float> n12 = dVar3;
                                    Object objF8 = interfaceC1084f3.f();
                                    if (zK3 || objF8 == InterfaceC1084f.a.f12980a) {
                                        objF8 = new Ia.l<U, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(U u10) {
                                                u10.b(n12.getValue().floatValue());
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF8);
                                    }
                                    androidx.compose.ui.h hVarA = T.a(aVar, (Ia.l) objF8);
                                    long j24 = j23;
                                    F f18 = f10;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar21;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar2);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar32 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar32);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    TextFieldImplKt.b(j24, f18, pVar31, interfaceC1084f3, 0);
                                    interfaceC1084f3.J();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                        z29 = false;
                    } else {
                        z29 = false;
                        composableLambdaImplB4 = null;
                    }
                    c1086gP.T(z29);
                    if (!z14) {
                        j17 = textFieldColors2.f12360r;
                    } else if (z15) {
                        j17 = textFieldColors2.f12361s;
                    } else if (z22) {
                        j17 = textFieldColors2.f12358p;
                    } else {
                        j17 = textFieldColors2.f12359q;
                    }
                    c1086gP.L(-156902962);
                    if (pVar17 == null) {
                        pVar22 = pVar17;
                        z30 = false;
                        composableLambdaImplB5 = null;
                    } else {
                        pVar22 = pVar17;
                        composableLambdaImplB5 = androidx.compose.runtime.internal.a.b(-130107406, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    TextFieldImplKt.c(j17, pVar22, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                        z30 = false;
                    }
                    c1086gP.T(z30);
                    if (!z14) {
                        j18 = textFieldColors2.f12364v;
                    } else if (z15) {
                        j18 = textFieldColors2.f12365w;
                    } else if (z22) {
                        j18 = textFieldColors2.f12362t;
                    } else {
                        j18 = textFieldColors2.f12363u;
                    }
                    c1086gP.L(-156893937);
                    if (pVar18 == null) {
                        pVar23 = pVar18;
                        z31 = false;
                        composableLambdaImplB6 = null;
                    } else {
                        pVar23 = pVar18;
                        composableLambdaImplB6 = androidx.compose.runtime.internal.a.b(2079816678, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    TextFieldImplKt.c(j18, pVar23, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                        z31 = false;
                    }
                    c1086gP.T(z31);
                    if (!z14) {
                        j19 = textFieldColors2.f12334H;
                    } else if (z15) {
                        j19 = textFieldColors2.f12335I;
                    } else if (z22) {
                        j19 = textFieldColors2.f12332F;
                    } else {
                        j19 = textFieldColors2.f12333G;
                    }
                    c1086gP.L(-156884470);
                    if (pVar16 == null) {
                        pVar24 = pVar16;
                        composableLambdaImplB7 = null;
                    } else {
                        pVar24 = pVar16;
                        composableLambdaImplB7 = androidx.compose.runtime.internal.a.b(1263707005, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    TextFieldImplKt.b(j19, f11, pVar24, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    c1086gP.T(false);
                    iOrdinal7 = textFieldType.ordinal();
                    if (iOrdinal7 != 0) {
                        c1086gP.L(-568105095);
                        TextFieldKt.b(androidx.compose.ui.h.a.f13984b, pVar, composableLambdaImplB, composableLambdaImplB2, composableLambdaImplB5, composableLambdaImplB6, composableLambdaImplB3, composableLambdaImplB4, z13, fFloatValue, androidx.compose.runtime.internal.a.b(1750327932, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h hVarB = C1171q.b(androidx.compose.ui.h.a.f13984b, "Container");
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar9;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar32 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar32);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar31, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), composableLambdaImplB7, l10, c1086gP, ((i39 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | ((i38 << 21) & 234881024), ((i38 >> 9) & 896) | 6);
                        c1086gP.T(false);
                        p293xa.r rVar = p293xa.r.f47939a;
                    } else if (iOrdinal7 != 1) {
                        c1086gP.L(-565271199);
                        c1086gP.T(false);
                        p293xa.r rVar2 = p293xa.r.f47939a;
                    } else {
                        c1086gP.L(-567018607);
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = J0.f(new I.h(0L));
                            c1086gP.E(objF5);
                        }
                        x10 = (X) objF5;
                        ComposableLambdaImpl composableLambdaImplB8 = androidx.compose.runtime.internal.a.b(157291737, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1

                            /* JADX INFO: renamed from: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1$1, reason: invalid class name */
                            /* JADX INFO: compiled from: TextFieldImpl.kt */
                            final /* synthetic */ class AnonymousClass1 extends MutablePropertyReference0Impl {
                                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, Oa.i
                                public final Object get() {
                                    return ((X) this.receiver).getValue();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h hVarE = OutlinedTextFieldKt.e(C1171q.b(androidx.compose.ui.h.a.f13984b, "Container"), new AnonymousClass1(x10, X.class, "value", "getValue()Ljava/lang/Object;", 0), l10);
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar9;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarE);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar32 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar32);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar31, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        zG = c1086gP.g(fFloatValue);
                        objF6 = c1086gP.f();
                        if (zG || objF6 == c0153a) {
                            objF6 = new Ia.l<I.h, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(I.h hVar) {
                                    long j24 = hVar.f3769a;
                                    float fD = I.h.d(j24) * fFloatValue;
                                    float fB = I.h.b(j24) * fFloatValue;
                                    if (I.h.d(x10.getValue().f3769a) != fD || I.h.b(x10.getValue().f3769a) != fB) {
                                        x10.setValue(new I.h(Cb.a.b(fD, fB)));
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF6);
                        }
                        OutlinedTextFieldKt.b(aVar, pVar, composableLambdaImplB2, composableLambdaImplB, composableLambdaImplB5, composableLambdaImplB6, composableLambdaImplB3, composableLambdaImplB4, z13, fFloatValue, (Ia.l) objF6, composableLambdaImplB8, composableLambdaImplB7, l10, c1086gP, ((i39 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | ((i38 << 21) & 234881024), ((i38 >> 6) & 7168) | 48);
                        c1086gP.T(false);
                        p293xa.r rVar3 = p293xa.r.f47939a;
                    }
                    pVar25 = pVar24;
                    pVar26 = pVar19;
                    pVar27 = pVar21;
                    pVar28 = pVar23;
                    pVar29 = pVar22;
                    pVar30 = pVar20;
                } else {
                    z22 = zBooleanValue;
                }
                f14 = 1.0f;
                r10 = 0;
                c1086gP.T(r10);
                z23 = z19;
                Transition.d dVarD6 = TransitionKt.d(transitionF, fValueOf, Float.valueOf(f14), TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.f12507h.invoke(transitionF.f(), c1086gP, Integer.valueOf((int) r10)), e0Var, c1086gP, 196608);
                InputPhase inputPhase12 = (InputPhase) b0Var.a();
                c1086gP.L(1435837472);
                iOrdinal3 = inputPhase12.ordinal();
                if (iOrdinal3 == 0) {
                    f15 = 1.0f;
                    z24 = false;
                } else {
                    if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z20) {
                        f15 = 1.0f;
                        z24 = false;
                    }
                    z24 = false;
                    f15 = 0.0f;
                }
                c1086gP.T(z24);
                Float fValueOf4 = Float.valueOf(f15);
                InputPhase inputPhase13 = (InputPhase) c1085f0.getValue();
                c1086gP.L(1435837472);
                iOrdinal4 = inputPhase13.ordinal();
                if (iOrdinal4 == 0) {
                    f16 = 1.0f;
                    r12 = 0;
                } else {
                    if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z20) {
                        f16 = 1.0f;
                        r12 = 0;
                    }
                    r12 = 0;
                    f16 = 0.0f;
                }
                c1086gP.T(r12);
                dVarD = TransitionKt.d(transitionF, fValueOf4, Float.valueOf(f16), TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.f12509h.invoke(transitionF.f(), c1086gP, Integer.valueOf((int) r12)), e0Var, c1086gP, 196608);
                InputPhase inputPhase14 = (InputPhase) b0Var.a();
                c1086gP.L(1128033978);
                iOrdinal5 = inputPhase14.ordinal();
                if (iOrdinal5 == 0) {
                    f17 = 1.0f;
                    z25 = false;
                } else {
                    if (iOrdinal5 != 1) {
                        if (iOrdinal5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z20) {
                        z25 = false;
                        f17 = 0.0f;
                    }
                    f17 = 1.0f;
                    z25 = false;
                }
                c1086gP.T(z25);
                Float fValueOf5 = Float.valueOf(f17);
                InputPhase inputPhase15 = (InputPhase) c1085f0.getValue();
                c1086gP.L(1128033978);
                iOrdinal6 = inputPhase15.ordinal();
                if (iOrdinal6 == 0) {
                    r11 = 0;
                } else {
                    if (iOrdinal6 != 1) {
                        if (iOrdinal6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z20) {
                        r11 = 0;
                        f12 = 0.0f;
                    }
                    r11 = 0;
                }
                c1086gP.T(r11);
                dVarD2 = TransitionKt.d(transitionF, fValueOf5, Float.valueOf(f12), TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.f12510h.invoke(transitionF.f(), c1086gP, Integer.valueOf((int) r11)), e0Var, c1086gP, 196608);
                inputPhase2 = (InputPhase) c1085f0.getValue();
                c1086gP.L(-107432127);
                iArr = a.f12511a;
                if (iArr[inputPhase2.ordinal()] == 1) {
                    j11 = j10;
                } else {
                    j11 = jB2;
                }
                c1086gP.T(false);
                cVarF = H.f(j11);
                zK = c1086gP.K(cVarF);
                objF = c1086gP.f();
                if (zK) {
                    objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                    c1086gP.E(objF);
                } else {
                    objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                    c1086gP.E(objF);
                }
                d0 d0Var3 = (d0) objF;
                inputPhase3 = (InputPhase) b0Var.a();
                c1086gP.L(-107432127);
                if (iArr[inputPhase3.ordinal()] == 1) {
                    z26 = false;
                    j12 = j10;
                } else {
                    j12 = jB2;
                    z26 = false;
                }
                c1086gP.T(z26);
                H h11 = new H(j12);
                inputPhase4 = (InputPhase) c1085f0.getValue();
                c1086gP.L(-107432127);
                if (iArr[inputPhase4.ordinal()] == 1) {
                    j13 = j10;
                } else {
                    j13 = jB2;
                }
                c1086gP.T(false);
                dVarD3 = TransitionKt.d(transitionF, h11, new H(j13), TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.f12508h.invoke(transitionF.f(), c1086gP, 0), d0Var3, c1086gP, 196608);
                c1086gP.L(1023351670);
                c1086gP.T(false);
                cVarF2 = H.f(j);
                zK2 = c1086gP.K(cVarF2);
                objF2 = c1086gP.f();
                if (zK2) {
                    objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                    c1086gP.E(objF2);
                } else {
                    objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                    c1086gP.E(objF2);
                }
                d0 d0Var4 = (d0) objF2;
                c1086gP.L(1023351670);
                c1086gP.T(false);
                H h12 = new H(j);
                c1086gP.L(1023351670);
                c1086gP.T(false);
                dVarD4 = TransitionKt.d(transitionF, h12, new H(j), TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.f12506h.invoke(transitionF.f(), c1086gP, 0), d0Var4, c1086gP, 196608);
                fFloatValue = ((Number) dVarD6.f9457k.getValue()).floatValue();
                c1086gP.L(-156998101);
                if (pVar2 == null) {
                    composableLambdaImplB = null;
                } else {
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1236585568, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                F fA = G.a(f10, f11, fFloatValue);
                                TextFieldImplKt.b(dVarD4.getValue().f13506a, z23 ? F.a(fA, dVarD3.getValue().f13506a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214) : fA, pVar2, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                }
                c1086gP.T(false);
                if (z14) {
                    textFieldColors2 = textFieldColors;
                    j14 = textFieldColors2.f12330D;
                } else {
                    textFieldColors2 = textFieldColors;
                    if (z15) {
                        j14 = textFieldColors2.f12331E;
                    } else if (z22) {
                        j14 = textFieldColors2.f12328B;
                    } else {
                        j14 = textFieldColors2.f12329C;
                    }
                }
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = J0.e(new Ia.a<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Boolean invoke() {
                            return Boolean.valueOf(dVarD.getValue().floatValue() > 0.0f);
                        }
                    }, Q0.f12888a);
                    c1086gP.E(objF3);
                }
                N0 n12 = (N0) objF3;
                c1086gP.L(-156965270);
                if (pVar20 == null) {
                    z27 = false;
                    composableLambdaImplB2 = null;
                } else {
                    z27 = false;
                    composableLambdaImplB2 = null;
                }
                c1086gP.T(z27);
                if (!z14) {
                    j15 = textFieldColors2.f12338L;
                } else if (z15) {
                    j15 = textFieldColors2.f12339M;
                } else if (z22) {
                    j15 = textFieldColors2.f12336J;
                } else {
                    j15 = textFieldColors2.f12337K;
                }
                objF4 = c1086gP.f();
                if (objF4 == c0153a) {
                    dVar = dVarD2;
                    objF4 = J0.e(new Ia.a<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Boolean invoke() {
                            return Boolean.valueOf(dVar.getValue().floatValue() > 0.0f);
                        }
                    }, Q0.f12888a);
                    c1086gP.E(objF4);
                } else {
                    dVar = dVarD2;
                }
                N0 n13 = (N0) objF4;
                c1086gP.L(-156940524);
                if (pVar19 == null) {
                    z28 = false;
                    composableLambdaImplB3 = null;
                } else {
                    z28 = false;
                    composableLambdaImplB3 = null;
                }
                c1086gP.T(z28);
                if (!z14) {
                    j16 = textFieldColors2.f12342P;
                } else if (z15) {
                    j16 = textFieldColors2.f12343Q;
                } else if (z22) {
                    j16 = textFieldColors2.f12340N;
                } else {
                    j16 = textFieldColors2.f12341O;
                }
                c1086gP.L(-156921964);
                if (pVar21 == null) {
                    z29 = false;
                    composableLambdaImplB4 = null;
                } else {
                    z29 = false;
                    composableLambdaImplB4 = null;
                }
                c1086gP.T(z29);
                if (!z14) {
                    j17 = textFieldColors2.f12360r;
                } else if (z15) {
                    j17 = textFieldColors2.f12361s;
                } else if (z22) {
                    j17 = textFieldColors2.f12358p;
                } else {
                    j17 = textFieldColors2.f12359q;
                }
                c1086gP.L(-156902962);
                if (pVar17 == null) {
                    pVar22 = pVar17;
                    z30 = false;
                    composableLambdaImplB5 = null;
                } else {
                    pVar22 = pVar17;
                    composableLambdaImplB5 = androidx.compose.runtime.internal.a.b(-130107406, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                TextFieldImplKt.c(j17, pVar22, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    z30 = false;
                }
                c1086gP.T(z30);
                if (!z14) {
                    j18 = textFieldColors2.f12364v;
                } else if (z15) {
                    j18 = textFieldColors2.f12365w;
                } else if (z22) {
                    j18 = textFieldColors2.f12362t;
                } else {
                    j18 = textFieldColors2.f12363u;
                }
                c1086gP.L(-156893937);
                if (pVar18 == null) {
                    pVar23 = pVar18;
                    z31 = false;
                    composableLambdaImplB6 = null;
                } else {
                    pVar23 = pVar18;
                    composableLambdaImplB6 = androidx.compose.runtime.internal.a.b(2079816678, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                TextFieldImplKt.c(j18, pVar23, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    z31 = false;
                }
                c1086gP.T(z31);
                if (!z14) {
                    j19 = textFieldColors2.f12334H;
                } else if (z15) {
                    j19 = textFieldColors2.f12335I;
                } else if (z22) {
                    j19 = textFieldColors2.f12332F;
                } else {
                    j19 = textFieldColors2.f12333G;
                }
                c1086gP.L(-156884470);
                if (pVar16 == null) {
                    pVar24 = pVar16;
                    composableLambdaImplB7 = null;
                } else {
                    pVar24 = pVar16;
                    composableLambdaImplB7 = androidx.compose.runtime.internal.a.b(1263707005, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                TextFieldImplKt.b(j19, f11, pVar24, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                }
                c1086gP.T(false);
                iOrdinal7 = textFieldType.ordinal();
                if (iOrdinal7 != 0) {
                    c1086gP.L(-568105095);
                    TextFieldKt.b(androidx.compose.ui.h.a.f13984b, pVar, composableLambdaImplB, composableLambdaImplB2, composableLambdaImplB5, composableLambdaImplB6, composableLambdaImplB3, composableLambdaImplB4, z13, fFloatValue, androidx.compose.runtime.internal.a.b(1750327932, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarB = C1171q.b(androidx.compose.ui.h.a.f13984b, "Container");
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar9;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar2);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar32 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar32);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar31, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), composableLambdaImplB7, l10, c1086gP, ((i39 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | ((i38 << 21) & 234881024), ((i38 >> 9) & 896) | 6);
                    c1086gP.T(false);
                    p293xa.r rVar4 = p293xa.r.f47939a;
                } else if (iOrdinal7 != 1) {
                    c1086gP.L(-565271199);
                    c1086gP.T(false);
                    p293xa.r rVar5 = p293xa.r.f47939a;
                } else {
                    c1086gP.L(-567018607);
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = J0.f(new I.h(0L));
                        c1086gP.E(objF5);
                    }
                    x10 = (X) objF5;
                    ComposableLambdaImpl composableLambdaImplB9 = androidx.compose.runtime.internal.a.b(157291737, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1

                        /* JADX INFO: renamed from: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: TextFieldImpl.kt */
                        final /* synthetic */ class AnonymousClass1 extends MutablePropertyReference0Impl {
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, Oa.i
                            public final Object get() {
                                return ((X) this.receiver).getValue();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarE = OutlinedTextFieldKt.e(C1171q.b(androidx.compose.ui.h.a.f13984b, "Container"), new AnonymousClass1(x10, X.class, "value", "getValue()Ljava/lang/Object;", 0), l10);
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar9;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarE);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar2);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar32 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar32);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar31, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                    zG = c1086gP.g(fFloatValue);
                    objF6 = c1086gP.f();
                    if (zG) {
                        objF6 = new Ia.l<I.h, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(I.h hVar) {
                                long j24 = hVar.f3769a;
                                float fD = I.h.d(j24) * fFloatValue;
                                float fB = I.h.b(j24) * fFloatValue;
                                if (I.h.d(x10.getValue().f3769a) != fD || I.h.b(x10.getValue().f3769a) != fB) {
                                    x10.setValue(new I.h(Cb.a.b(fD, fB)));
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF6);
                    } else {
                        objF6 = new Ia.l<I.h, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(I.h hVar) {
                                long j24 = hVar.f3769a;
                                float fD = I.h.d(j24) * fFloatValue;
                                float fB = I.h.b(j24) * fFloatValue;
                                if (I.h.d(x10.getValue().f3769a) != fD || I.h.b(x10.getValue().f3769a) != fB) {
                                    x10.setValue(new I.h(Cb.a.b(fD, fB)));
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF6);
                    }
                    OutlinedTextFieldKt.b(aVar2, pVar, composableLambdaImplB2, composableLambdaImplB, composableLambdaImplB5, composableLambdaImplB6, composableLambdaImplB3, composableLambdaImplB4, z13, fFloatValue, (Ia.l) objF6, composableLambdaImplB9, composableLambdaImplB7, l10, c1086gP, ((i39 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | ((i38 << 21) & 234881024), ((i38 >> 6) & 7168) | 48);
                    c1086gP.T(false);
                    p293xa.r rVar6 = p293xa.r.f47939a;
                }
                pVar25 = pVar24;
                pVar26 = pVar19;
                pVar27 = pVar21;
                pVar28 = pVar23;
                pVar29 = pVar22;
                pVar30 = pVar20;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z32 = z13;
                final boolean z33 = z14;
                final boolean z34 = z15;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextFieldImplKt.a(textFieldType, str, pVar, e10, pVar2, pVar30, pVar29, pVar28, pVar26, pVar27, pVar25, z32, z33, z34, jVar, l10, textFieldColors, pVar9, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i39 |= 384;
        if ((i12 & 8) != 0) {
            i39 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c1086gP.K(e10)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i39 |= i14;
        }
        if ((i12 & 16) != 0) {
            i39 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c1086gP.k(pVar2)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i39 |= i15;
        }
        i16 = i12 & 32;
        if (i16 != 0) {
            i39 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (c1086gP.k(pVar3)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i39 |= i17;
        }
        i18 = i12 & 64;
        if (i18 != 0) {
            i39 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c1086gP.k(pVar4)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i39 |= i19;
        }
        i20 = i12 & 128;
        if (i20 != 0) {
            i39 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.k(pVar5)) {
                i21 = 8388608;
            } else {
                i21 = 4194304;
            }
            i39 |= i21;
        }
        i22 = i12 & 256;
        if (i22 != 0) {
            i39 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.k(pVar6)) {
                i23 = 67108864;
            } else {
                i23 = 33554432;
            }
            i39 |= i23;
        }
        i24 = i12 & 512;
        i25 = 805306368;
        if (i24 == 0) {
            i39 |= i25;
        } else if ((i10 & 805306368) == 0) {
            if (c1086gP.k(pVar7)) {
                i25 = 536870912;
            } else {
                i25 = 268435456;
            }
            i39 |= i25;
        }
        i26 = i12 & 1024;
        if (i26 != 0) {
            i27 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i27 = i11 | (c1086gP.k(pVar8) ? 4 : 2);
        } else {
            i27 = i11;
        }
        i28 = i12 & 2048;
        if (i28 != 0) {
            i27 |= 48;
        } else if ((i11 & 48) == 0) {
            i27 |= c1086gP.c(z10) ? 32 : 16;
        }
        i29 = i27;
        i30 = i12 & 4096;
        if (i30 != 0) {
            i29 |= 384;
            i31 = i30;
        } else {
            i31 = i30;
            if ((i11 & 384) != 0) {
                if (c1086gP.c(z11)) {
                    i32 = 256;
                } else {
                    i32 = 128;
                }
                i29 |= i32;
            }
        }
        i33 = i12 & 8192;
        if (i33 != 0) {
            i29 |= 3072;
        } else if ((i11 & 3072) != 0) {
            if (c1086gP.c(z12)) {
                i34 = 2048;
            } else {
                i34 = 1024;
            }
            i29 |= i34;
        }
        if ((i12 & 16384) != 0) {
            i29 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i29 |= c1086gP.K(jVar) ? 16384 : 8192;
        }
        if ((32768 & i12) != 0) {
            i29 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (c1086gP.K(l10)) {
                i35 = 131072;
            } else {
                i35 = 65536;
            }
            i29 |= i35;
        }
        if ((i12 & 65536) != 0) {
            i29 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (c1086gP.K(textFieldColors)) {
                i36 = 1048576;
            } else {
                i36 = 524288;
            }
            i29 |= i36;
        }
        if ((i12 & 131072) != 0) {
            i29 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            if (c1086gP.k(pVar9)) {
                i37 = 8388608;
            } else {
                i37 = 4194304;
            }
            i29 |= i37;
        }
        if ((306783379 & i39) != 306783378) {
            if (i16 != 0) {
                pVar10 = null;
            } else {
                pVar10 = pVar3;
            }
            if (i18 != 0) {
                pVar11 = null;
            } else {
                pVar11 = pVar4;
            }
            if (i20 != 0) {
                pVar12 = null;
            } else {
                pVar12 = pVar5;
            }
            if (i22 != 0) {
                pVar13 = null;
            } else {
                pVar13 = pVar6;
            }
            if (i24 != 0) {
                pVar14 = null;
            } else {
                pVar14 = pVar7;
            }
            if (i26 != 0) {
                pVar15 = null;
            } else {
                pVar15 = pVar8;
            }
            if (i28 != 0) {
                z13 = false;
            } else {
                z13 = z10;
            }
            if (i31 != 0) {
                z14 = true;
            } else {
                z14 = z11;
            }
            if (i33 != 0) {
                z15 = false;
            } else {
                z15 = z12;
            }
            if ((i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((i39 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z16 | z17;
            Object objF8 = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (z18) {
                objE = e10.e(new C1260a(6, str, null));
                c1086gP.E(objE);
            } else {
                objE = e10.e(new C1260a(6, str, null));
                c1086gP.E(objE);
            }
            str2 = ((D) objE).f15484a.f15408c;
            zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(jVar, c1086gP, (i29 >> 12) & 14).getValue()).booleanValue();
            if (zBooleanValue) {
                inputPhase = InputPhase.f12493b;
            } else if (str2.length() == 0) {
                inputPhase = InputPhase.f12494c;
            } else {
                inputPhase = InputPhase.f12495d;
            }
            InputPhase inputPhase16 = inputPhase;
            if (!z14) {
                j = textFieldColors.f12368z;
            } else if (z15) {
                j = textFieldColors.f12327A;
            } else if (zBooleanValue) {
                j = textFieldColors.f12366x;
            } else {
                j = textFieldColors.f12367y;
            }
            q0 q0Var2 = (q0) c1086gP.x(TypographyKt.f12404a);
            i38 = i29;
            f10 = q0Var2.j;
            pVar16 = pVar15;
            pVar17 = pVar11;
            long jB4 = f10.b();
            pVar18 = pVar12;
            pVar19 = pVar13;
            long j24 = H.f13504l;
            boolean zC2 = H.c(jB4, j24);
            f11 = q0Var2.f12698l;
            pVar20 = pVar10;
            if (zC2) {
            }
            jB = f11.b();
            if (z19) {
                jB = j;
            }
            jB2 = f10.b();
            if (z19) {
                jB2 = j;
            }
            j10 = jB;
            if (pVar2 != null) {
                z20 = true;
            } else {
                z20 = false;
            }
            pVar21 = pVar14;
            Transition transitionF2 = TransitionKt.f(inputPhase16, "TextFieldInputState", c1086gP, 48, 0);
            e0 e0Var2 = VectorConvertersKt.f9477a;
            b0<S> b0Var2 = transitionF2.f9429a;
            InputPhase inputPhase17 = (InputPhase) b0Var2.a();
            c1086gP.L(-2036730335);
            iOrdinal = inputPhase17.ordinal();
            f12 = 1.0f;
            if (iOrdinal == 0) {
                f13 = 1.0f;
                z21 = false;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f13 = 1.0f;
                z21 = false;
            } else {
                z21 = false;
                f13 = 0.0f;
            }
            c1086gP.T(z21);
            Float fValueOf6 = Float.valueOf(f13);
            C1085f0 c1085f1 = transitionF2.f9432d;
            InputPhase inputPhase18 = (InputPhase) c1085f1.getValue();
            c1086gP.L(-2036730335);
            iOrdinal2 = inputPhase18.ordinal();
            if (iOrdinal2 != 0) {
                z22 = zBooleanValue;
                if (iOrdinal2 == 1) {
                    r10 = 0;
                    f14 = 0.0f;
                } else if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c1086gP.T(r10);
                z23 = z19;
                Transition.d dVarD7 = TransitionKt.d(transitionF2, fValueOf6, Float.valueOf(f14), TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.f12507h.invoke(transitionF2.f(), c1086gP, Integer.valueOf((int) r10)), e0Var2, c1086gP, 196608);
                InputPhase inputPhase19 = (InputPhase) b0Var2.a();
                c1086gP.L(1435837472);
                iOrdinal3 = inputPhase19.ordinal();
                if (iOrdinal3 == 0) {
                    f15 = 1.0f;
                    z24 = false;
                } else {
                    if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z20) {
                        f15 = 1.0f;
                        z24 = false;
                    }
                    z24 = false;
                    f15 = 0.0f;
                }
                c1086gP.T(z24);
                Float fValueOf7 = Float.valueOf(f15);
                InputPhase inputPhase110 = (InputPhase) c1085f1.getValue();
                c1086gP.L(1435837472);
                iOrdinal4 = inputPhase110.ordinal();
                if (iOrdinal4 == 0) {
                    f16 = 1.0f;
                    r12 = 0;
                } else {
                    if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z20) {
                        f16 = 1.0f;
                        r12 = 0;
                    }
                    r12 = 0;
                    f16 = 0.0f;
                }
                c1086gP.T(r12);
                dVarD = TransitionKt.d(transitionF2, fValueOf7, Float.valueOf(f16), TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.f12509h.invoke(transitionF2.f(), c1086gP, Integer.valueOf((int) r12)), e0Var2, c1086gP, 196608);
                InputPhase inputPhase111 = (InputPhase) b0Var2.a();
                c1086gP.L(1128033978);
                iOrdinal5 = inputPhase111.ordinal();
                if (iOrdinal5 == 0) {
                    f17 = 1.0f;
                    z25 = false;
                } else {
                    if (iOrdinal5 != 1) {
                        if (iOrdinal5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z20) {
                        z25 = false;
                        f17 = 0.0f;
                    }
                    f17 = 1.0f;
                    z25 = false;
                }
                c1086gP.T(z25);
                Float fValueOf8 = Float.valueOf(f17);
                InputPhase inputPhase112 = (InputPhase) c1085f1.getValue();
                c1086gP.L(1128033978);
                iOrdinal6 = inputPhase112.ordinal();
                if (iOrdinal6 == 0) {
                    r11 = 0;
                } else {
                    if (iOrdinal6 != 1) {
                        if (iOrdinal6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z20) {
                        r11 = 0;
                        f12 = 0.0f;
                    }
                    r11 = 0;
                }
                c1086gP.T(r11);
                dVarD2 = TransitionKt.d(transitionF2, fValueOf8, Float.valueOf(f12), TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.f12510h.invoke(transitionF2.f(), c1086gP, Integer.valueOf((int) r11)), e0Var2, c1086gP, 196608);
                inputPhase2 = (InputPhase) c1085f1.getValue();
                c1086gP.L(-107432127);
                iArr = a.f12511a;
                if (iArr[inputPhase2.ordinal()] == 1) {
                    j11 = j10;
                } else {
                    j11 = jB2;
                }
                c1086gP.T(false);
                cVarF = H.f(j11);
                zK = c1086gP.K(cVarF);
                objF = c1086gP.f();
                if (zK) {
                    objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                    c1086gP.E(objF);
                } else {
                    objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                    c1086gP.E(objF);
                }
                d0 d0Var5 = (d0) objF;
                inputPhase3 = (InputPhase) b0Var2.a();
                c1086gP.L(-107432127);
                if (iArr[inputPhase3.ordinal()] == 1) {
                    z26 = false;
                    j12 = j10;
                } else {
                    j12 = jB2;
                    z26 = false;
                }
                c1086gP.T(z26);
                H h13 = new H(j12);
                inputPhase4 = (InputPhase) c1085f1.getValue();
                c1086gP.L(-107432127);
                if (iArr[inputPhase4.ordinal()] == 1) {
                    j13 = j10;
                } else {
                    j13 = jB2;
                }
                c1086gP.T(false);
                dVarD3 = TransitionKt.d(transitionF2, h13, new H(j13), TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.f12508h.invoke(transitionF2.f(), c1086gP, 0), d0Var5, c1086gP, 196608);
                c1086gP.L(1023351670);
                c1086gP.T(false);
                cVarF2 = H.f(j);
                zK2 = c1086gP.K(cVarF2);
                objF2 = c1086gP.f();
                if (zK2) {
                    objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                    c1086gP.E(objF2);
                } else {
                    objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                    c1086gP.E(objF2);
                }
                d0 d0Var6 = (d0) objF2;
                c1086gP.L(1023351670);
                c1086gP.T(false);
                H h14 = new H(j);
                c1086gP.L(1023351670);
                c1086gP.T(false);
                dVarD4 = TransitionKt.d(transitionF2, h14, new H(j), TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.f12506h.invoke(transitionF2.f(), c1086gP, 0), d0Var6, c1086gP, 196608);
                fFloatValue = ((Number) dVarD7.f9457k.getValue()).floatValue();
                c1086gP.L(-156998101);
                if (pVar2 == null) {
                    composableLambdaImplB = null;
                } else {
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1236585568, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                F fA = G.a(f10, f11, fFloatValue);
                                TextFieldImplKt.b(dVarD4.getValue().f13506a, z23 ? F.a(fA, dVarD3.getValue().f13506a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214) : fA, pVar2, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                }
                c1086gP.T(false);
                if (z14) {
                    textFieldColors2 = textFieldColors;
                    j14 = textFieldColors2.f12330D;
                } else {
                    textFieldColors2 = textFieldColors;
                    if (z15) {
                        j14 = textFieldColors2.f12331E;
                    } else if (z22) {
                        j14 = textFieldColors2.f12328B;
                    } else {
                        j14 = textFieldColors2.f12329C;
                    }
                }
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = J0.e(new Ia.a<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Boolean invoke() {
                            return Boolean.valueOf(dVarD.getValue().floatValue() > 0.0f);
                        }
                    }, Q0.f12888a);
                    c1086gP.E(objF3);
                }
                N0 n14 = (N0) objF3;
                c1086gP.L(-156965270);
                if (pVar20 == null) {
                    z27 = false;
                    composableLambdaImplB2 = null;
                } else {
                    z27 = false;
                    composableLambdaImplB2 = null;
                }
                c1086gP.T(z27);
                if (!z14) {
                    j15 = textFieldColors2.f12338L;
                } else if (z15) {
                    j15 = textFieldColors2.f12339M;
                } else if (z22) {
                    j15 = textFieldColors2.f12336J;
                } else {
                    j15 = textFieldColors2.f12337K;
                }
                objF4 = c1086gP.f();
                if (objF4 == c0153a) {
                    dVar = dVarD2;
                    objF4 = J0.e(new Ia.a<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Boolean invoke() {
                            return Boolean.valueOf(dVar.getValue().floatValue() > 0.0f);
                        }
                    }, Q0.f12888a);
                    c1086gP.E(objF4);
                } else {
                    dVar = dVarD2;
                }
                N0 n15 = (N0) objF4;
                c1086gP.L(-156940524);
                if (pVar19 == null) {
                    z28 = false;
                    composableLambdaImplB3 = null;
                } else {
                    z28 = false;
                    composableLambdaImplB3 = null;
                }
                c1086gP.T(z28);
                if (!z14) {
                    j16 = textFieldColors2.f12342P;
                } else if (z15) {
                    j16 = textFieldColors2.f12343Q;
                } else if (z22) {
                    j16 = textFieldColors2.f12340N;
                } else {
                    j16 = textFieldColors2.f12341O;
                }
                c1086gP.L(-156921964);
                if (pVar21 == null) {
                    z29 = false;
                    composableLambdaImplB4 = null;
                } else {
                    z29 = false;
                    composableLambdaImplB4 = null;
                }
                c1086gP.T(z29);
                if (!z14) {
                    j17 = textFieldColors2.f12360r;
                } else if (z15) {
                    j17 = textFieldColors2.f12361s;
                } else if (z22) {
                    j17 = textFieldColors2.f12358p;
                } else {
                    j17 = textFieldColors2.f12359q;
                }
                c1086gP.L(-156902962);
                if (pVar17 == null) {
                    pVar22 = pVar17;
                    z30 = false;
                    composableLambdaImplB5 = null;
                } else {
                    pVar22 = pVar17;
                    composableLambdaImplB5 = androidx.compose.runtime.internal.a.b(-130107406, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                TextFieldImplKt.c(j17, pVar22, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    z30 = false;
                }
                c1086gP.T(z30);
                if (!z14) {
                    j18 = textFieldColors2.f12364v;
                } else if (z15) {
                    j18 = textFieldColors2.f12365w;
                } else if (z22) {
                    j18 = textFieldColors2.f12362t;
                } else {
                    j18 = textFieldColors2.f12363u;
                }
                c1086gP.L(-156893937);
                if (pVar18 == null) {
                    pVar23 = pVar18;
                    z31 = false;
                    composableLambdaImplB6 = null;
                } else {
                    pVar23 = pVar18;
                    composableLambdaImplB6 = androidx.compose.runtime.internal.a.b(2079816678, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                TextFieldImplKt.c(j18, pVar23, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    z31 = false;
                }
                c1086gP.T(z31);
                if (!z14) {
                    j19 = textFieldColors2.f12334H;
                } else if (z15) {
                    j19 = textFieldColors2.f12335I;
                } else if (z22) {
                    j19 = textFieldColors2.f12332F;
                } else {
                    j19 = textFieldColors2.f12333G;
                }
                c1086gP.L(-156884470);
                if (pVar16 == null) {
                    pVar24 = pVar16;
                    composableLambdaImplB7 = null;
                } else {
                    pVar24 = pVar16;
                    composableLambdaImplB7 = androidx.compose.runtime.internal.a.b(1263707005, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                TextFieldImplKt.b(j19, f11, pVar24, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                }
                c1086gP.T(false);
                iOrdinal7 = textFieldType.ordinal();
                if (iOrdinal7 != 0) {
                    c1086gP.L(-568105095);
                    TextFieldKt.b(androidx.compose.ui.h.a.f13984b, pVar, composableLambdaImplB, composableLambdaImplB2, composableLambdaImplB5, composableLambdaImplB6, composableLambdaImplB3, composableLambdaImplB4, z13, fFloatValue, androidx.compose.runtime.internal.a.b(1750327932, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarB = C1171q.b(androidx.compose.ui.h.a.f13984b, "Container");
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar9;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar3);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar32 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar32);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar31, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), composableLambdaImplB7, l10, c1086gP, ((i39 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | ((i38 << 21) & 234881024), ((i38 >> 9) & 896) | 6);
                    c1086gP.T(false);
                    p293xa.r rVar7 = p293xa.r.f47939a;
                } else if (iOrdinal7 != 1) {
                    c1086gP.L(-565271199);
                    c1086gP.T(false);
                    p293xa.r rVar8 = p293xa.r.f47939a;
                } else {
                    c1086gP.L(-567018607);
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = J0.f(new I.h(0L));
                        c1086gP.E(objF5);
                    }
                    x10 = (X) objF5;
                    ComposableLambdaImpl composableLambdaImplB10 = androidx.compose.runtime.internal.a.b(157291737, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1

                        /* JADX INFO: renamed from: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: TextFieldImpl.kt */
                        final /* synthetic */ class AnonymousClass1 extends MutablePropertyReference0Impl {
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, Oa.i
                            public final Object get() {
                                return ((X) this.receiver).getValue();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarE = OutlinedTextFieldKt.e(C1171q.b(androidx.compose.ui.h.a.f13984b, "Container"), new AnonymousClass1(x10, X.class, "value", "getValue()Ljava/lang/Object;", 0), l10);
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar9;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarE);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar3);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar32 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar32);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar31, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
                    zG = c1086gP.g(fFloatValue);
                    objF6 = c1086gP.f();
                    if (zG) {
                        objF6 = new Ia.l<I.h, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(I.h hVar) {
                                long j25 = hVar.f3769a;
                                float fD = I.h.d(j25) * fFloatValue;
                                float fB = I.h.b(j25) * fFloatValue;
                                if (I.h.d(x10.getValue().f3769a) != fD || I.h.b(x10.getValue().f3769a) != fB) {
                                    x10.setValue(new I.h(Cb.a.b(fD, fB)));
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF6);
                    } else {
                        objF6 = new Ia.l<I.h, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(I.h hVar) {
                                long j25 = hVar.f3769a;
                                float fD = I.h.d(j25) * fFloatValue;
                                float fB = I.h.b(j25) * fFloatValue;
                                if (I.h.d(x10.getValue().f3769a) != fD || I.h.b(x10.getValue().f3769a) != fB) {
                                    x10.setValue(new I.h(Cb.a.b(fD, fB)));
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF6);
                    }
                    OutlinedTextFieldKt.b(aVar3, pVar, composableLambdaImplB2, composableLambdaImplB, composableLambdaImplB5, composableLambdaImplB6, composableLambdaImplB3, composableLambdaImplB4, z13, fFloatValue, (Ia.l) objF6, composableLambdaImplB10, composableLambdaImplB7, l10, c1086gP, ((i39 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | ((i38 << 21) & 234881024), ((i38 >> 6) & 7168) | 48);
                    c1086gP.T(false);
                    p293xa.r rVar9 = p293xa.r.f47939a;
                }
                pVar25 = pVar24;
                pVar26 = pVar19;
                pVar27 = pVar21;
                pVar28 = pVar23;
                pVar29 = pVar22;
                pVar30 = pVar20;
            } else {
                z22 = zBooleanValue;
            }
            f14 = 1.0f;
            r10 = 0;
            c1086gP.T(r10);
            z23 = z19;
            Transition.d dVarD8 = TransitionKt.d(transitionF2, fValueOf6, Float.valueOf(f14), TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.f12507h.invoke(transitionF2.f(), c1086gP, Integer.valueOf((int) r10)), e0Var2, c1086gP, 196608);
            InputPhase inputPhase113 = (InputPhase) b0Var2.a();
            c1086gP.L(1435837472);
            iOrdinal3 = inputPhase113.ordinal();
            if (iOrdinal3 == 0) {
                f15 = 1.0f;
                z24 = false;
            } else {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z20) {
                    f15 = 1.0f;
                    z24 = false;
                }
                z24 = false;
                f15 = 0.0f;
            }
            c1086gP.T(z24);
            Float fValueOf9 = Float.valueOf(f15);
            InputPhase inputPhase114 = (InputPhase) c1085f1.getValue();
            c1086gP.L(1435837472);
            iOrdinal4 = inputPhase114.ordinal();
            if (iOrdinal4 == 0) {
                f16 = 1.0f;
                r12 = 0;
            } else {
                if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z20) {
                    f16 = 1.0f;
                    r12 = 0;
                }
                r12 = 0;
                f16 = 0.0f;
            }
            c1086gP.T(r12);
            dVarD = TransitionKt.d(transitionF2, fValueOf9, Float.valueOf(f16), TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.f12509h.invoke(transitionF2.f(), c1086gP, Integer.valueOf((int) r12)), e0Var2, c1086gP, 196608);
            InputPhase inputPhase115 = (InputPhase) b0Var2.a();
            c1086gP.L(1128033978);
            iOrdinal5 = inputPhase115.ordinal();
            if (iOrdinal5 == 0) {
                f17 = 1.0f;
                z25 = false;
            } else {
                if (iOrdinal5 != 1) {
                    if (iOrdinal5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z20) {
                    z25 = false;
                    f17 = 0.0f;
                }
                f17 = 1.0f;
                z25 = false;
            }
            c1086gP.T(z25);
            Float fValueOf10 = Float.valueOf(f17);
            InputPhase inputPhase116 = (InputPhase) c1085f1.getValue();
            c1086gP.L(1128033978);
            iOrdinal6 = inputPhase116.ordinal();
            if (iOrdinal6 == 0) {
                r11 = 0;
            } else {
                if (iOrdinal6 != 1) {
                    if (iOrdinal6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z20) {
                    r11 = 0;
                    f12 = 0.0f;
                }
                r11 = 0;
            }
            c1086gP.T(r11);
            dVarD2 = TransitionKt.d(transitionF2, fValueOf10, Float.valueOf(f12), TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.f12510h.invoke(transitionF2.f(), c1086gP, Integer.valueOf((int) r11)), e0Var2, c1086gP, 196608);
            inputPhase2 = (InputPhase) c1085f1.getValue();
            c1086gP.L(-107432127);
            iArr = a.f12511a;
            if (iArr[inputPhase2.ordinal()] == 1) {
                j11 = j10;
            } else {
                j11 = jB2;
            }
            c1086gP.T(false);
            cVarF = H.f(j11);
            zK = c1086gP.K(cVarF);
            objF = c1086gP.f();
            if (zK) {
                objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                c1086gP.E(objF);
            } else {
                objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                c1086gP.E(objF);
            }
            d0 d0Var7 = (d0) objF;
            inputPhase3 = (InputPhase) b0Var2.a();
            c1086gP.L(-107432127);
            if (iArr[inputPhase3.ordinal()] == 1) {
                z26 = false;
                j12 = j10;
            } else {
                j12 = jB2;
                z26 = false;
            }
            c1086gP.T(z26);
            H h15 = new H(j12);
            inputPhase4 = (InputPhase) c1085f1.getValue();
            c1086gP.L(-107432127);
            if (iArr[inputPhase4.ordinal()] == 1) {
                j13 = j10;
            } else {
                j13 = jB2;
            }
            c1086gP.T(false);
            dVarD3 = TransitionKt.d(transitionF2, h15, new H(j13), TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.f12508h.invoke(transitionF2.f(), c1086gP, 0), d0Var7, c1086gP, 196608);
            c1086gP.L(1023351670);
            c1086gP.T(false);
            cVarF2 = H.f(j);
            zK2 = c1086gP.K(cVarF2);
            objF2 = c1086gP.f();
            if (zK2) {
                objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                c1086gP.E(objF2);
            } else {
                objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                c1086gP.E(objF2);
            }
            d0 d0Var8 = (d0) objF2;
            c1086gP.L(1023351670);
            c1086gP.T(false);
            H h16 = new H(j);
            c1086gP.L(1023351670);
            c1086gP.T(false);
            dVarD4 = TransitionKt.d(transitionF2, h16, new H(j), TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.f12506h.invoke(transitionF2.f(), c1086gP, 0), d0Var8, c1086gP, 196608);
            fFloatValue = ((Number) dVarD8.f9457k.getValue()).floatValue();
            c1086gP.L(-156998101);
            if (pVar2 == null) {
                composableLambdaImplB = null;
            } else {
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1236585568, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            F fA = G.a(f10, f11, fFloatValue);
                            TextFieldImplKt.b(dVarD4.getValue().f13506a, z23 ? F.a(fA, dVarD3.getValue().f13506a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214) : fA, pVar2, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
            }
            c1086gP.T(false);
            if (z14) {
                textFieldColors2 = textFieldColors;
                j14 = textFieldColors2.f12330D;
            } else {
                textFieldColors2 = textFieldColors;
                if (z15) {
                    j14 = textFieldColors2.f12331E;
                } else if (z22) {
                    j14 = textFieldColors2.f12328B;
                } else {
                    j14 = textFieldColors2.f12329C;
                }
            }
            objF3 = c1086gP.f();
            if (objF3 == c0153a) {
                objF3 = J0.e(new Ia.a<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Boolean invoke() {
                        return Boolean.valueOf(dVarD.getValue().floatValue() > 0.0f);
                    }
                }, Q0.f12888a);
                c1086gP.E(objF3);
            }
            N0 n16 = (N0) objF3;
            c1086gP.L(-156965270);
            if (pVar20 == null) {
                z27 = false;
                composableLambdaImplB2 = null;
            } else {
                z27 = false;
                composableLambdaImplB2 = null;
            }
            c1086gP.T(z27);
            if (!z14) {
                j15 = textFieldColors2.f12338L;
            } else if (z15) {
                j15 = textFieldColors2.f12339M;
            } else if (z22) {
                j15 = textFieldColors2.f12336J;
            } else {
                j15 = textFieldColors2.f12337K;
            }
            objF4 = c1086gP.f();
            if (objF4 == c0153a) {
                dVar = dVarD2;
                objF4 = J0.e(new Ia.a<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Boolean invoke() {
                        return Boolean.valueOf(dVar.getValue().floatValue() > 0.0f);
                    }
                }, Q0.f12888a);
                c1086gP.E(objF4);
            } else {
                dVar = dVarD2;
            }
            N0 n17 = (N0) objF4;
            c1086gP.L(-156940524);
            if (pVar19 == null) {
                z28 = false;
                composableLambdaImplB3 = null;
            } else {
                z28 = false;
                composableLambdaImplB3 = null;
            }
            c1086gP.T(z28);
            if (!z14) {
                j16 = textFieldColors2.f12342P;
            } else if (z15) {
                j16 = textFieldColors2.f12343Q;
            } else if (z22) {
                j16 = textFieldColors2.f12340N;
            } else {
                j16 = textFieldColors2.f12341O;
            }
            c1086gP.L(-156921964);
            if (pVar21 == null) {
                z29 = false;
                composableLambdaImplB4 = null;
            } else {
                z29 = false;
                composableLambdaImplB4 = null;
            }
            c1086gP.T(z29);
            if (!z14) {
                j17 = textFieldColors2.f12360r;
            } else if (z15) {
                j17 = textFieldColors2.f12361s;
            } else if (z22) {
                j17 = textFieldColors2.f12358p;
            } else {
                j17 = textFieldColors2.f12359q;
            }
            c1086gP.L(-156902962);
            if (pVar17 == null) {
                pVar22 = pVar17;
                z30 = false;
                composableLambdaImplB5 = null;
            } else {
                pVar22 = pVar17;
                composableLambdaImplB5 = androidx.compose.runtime.internal.a.b(-130107406, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            TextFieldImplKt.c(j17, pVar22, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
                z30 = false;
            }
            c1086gP.T(z30);
            if (!z14) {
                j18 = textFieldColors2.f12364v;
            } else if (z15) {
                j18 = textFieldColors2.f12365w;
            } else if (z22) {
                j18 = textFieldColors2.f12362t;
            } else {
                j18 = textFieldColors2.f12363u;
            }
            c1086gP.L(-156893937);
            if (pVar18 == null) {
                pVar23 = pVar18;
                z31 = false;
                composableLambdaImplB6 = null;
            } else {
                pVar23 = pVar18;
                composableLambdaImplB6 = androidx.compose.runtime.internal.a.b(2079816678, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            TextFieldImplKt.c(j18, pVar23, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
                z31 = false;
            }
            c1086gP.T(z31);
            if (!z14) {
                j19 = textFieldColors2.f12334H;
            } else if (z15) {
                j19 = textFieldColors2.f12335I;
            } else if (z22) {
                j19 = textFieldColors2.f12332F;
            } else {
                j19 = textFieldColors2.f12333G;
            }
            c1086gP.L(-156884470);
            if (pVar16 == null) {
                pVar24 = pVar16;
                composableLambdaImplB7 = null;
            } else {
                pVar24 = pVar16;
                composableLambdaImplB7 = androidx.compose.runtime.internal.a.b(1263707005, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            TextFieldImplKt.b(j19, f11, pVar24, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
            }
            c1086gP.T(false);
            iOrdinal7 = textFieldType.ordinal();
            if (iOrdinal7 != 0) {
                c1086gP.L(-568105095);
                TextFieldKt.b(androidx.compose.ui.h.a.f13984b, pVar, composableLambdaImplB, composableLambdaImplB2, composableLambdaImplB5, composableLambdaImplB6, composableLambdaImplB3, composableLambdaImplB4, z13, fFloatValue, androidx.compose.runtime.internal.a.b(1750327932, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h hVarB = C1171q.b(androidx.compose.ui.h.a.f13984b, "Container");
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar9;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar4);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar32 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar32);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar31, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), composableLambdaImplB7, l10, c1086gP, ((i39 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | ((i38 << 21) & 234881024), ((i38 >> 9) & 896) | 6);
                c1086gP.T(false);
                p293xa.r rVar10 = p293xa.r.f47939a;
            } else if (iOrdinal7 != 1) {
                c1086gP.L(-565271199);
                c1086gP.T(false);
                p293xa.r rVar11 = p293xa.r.f47939a;
            } else {
                c1086gP.L(-567018607);
                objF5 = c1086gP.f();
                if (objF5 == c0153a) {
                    objF5 = J0.f(new I.h(0L));
                    c1086gP.E(objF5);
                }
                x10 = (X) objF5;
                ComposableLambdaImpl composableLambdaImplB11 = androidx.compose.runtime.internal.a.b(157291737, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1

                    /* JADX INFO: renamed from: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: TextFieldImpl.kt */
                    final /* synthetic */ class AnonymousClass1 extends MutablePropertyReference0Impl {
                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, Oa.i
                        public final Object get() {
                            return ((X) this.receiver).getValue();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h hVarE = OutlinedTextFieldKt.e(C1171q.b(androidx.compose.ui.h.a.f13984b, "Container"), new AnonymousClass1(x10, X.class, "value", "getValue()Ljava/lang/Object;", 0), l10);
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar9;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarE);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar4);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar32 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar32);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar31, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
                androidx.compose.ui.h.a aVar4 = androidx.compose.ui.h.a.f13984b;
                zG = c1086gP.g(fFloatValue);
                objF6 = c1086gP.f();
                if (zG) {
                    objF6 = new Ia.l<I.h, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(I.h hVar) {
                            long j25 = hVar.f3769a;
                            float fD = I.h.d(j25) * fFloatValue;
                            float fB = I.h.b(j25) * fFloatValue;
                            if (I.h.d(x10.getValue().f3769a) != fD || I.h.b(x10.getValue().f3769a) != fB) {
                                x10.setValue(new I.h(Cb.a.b(fD, fB)));
                            }
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF6);
                } else {
                    objF6 = new Ia.l<I.h, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(I.h hVar) {
                            long j25 = hVar.f3769a;
                            float fD = I.h.d(j25) * fFloatValue;
                            float fB = I.h.b(j25) * fFloatValue;
                            if (I.h.d(x10.getValue().f3769a) != fD || I.h.b(x10.getValue().f3769a) != fB) {
                                x10.setValue(new I.h(Cb.a.b(fD, fB)));
                            }
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF6);
                }
                OutlinedTextFieldKt.b(aVar4, pVar, composableLambdaImplB2, composableLambdaImplB, composableLambdaImplB5, composableLambdaImplB6, composableLambdaImplB3, composableLambdaImplB4, z13, fFloatValue, (Ia.l) objF6, composableLambdaImplB11, composableLambdaImplB7, l10, c1086gP, ((i39 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | ((i38 << 21) & 234881024), ((i38 >> 6) & 7168) | 48);
                c1086gP.T(false);
                p293xa.r rVar12 = p293xa.r.f47939a;
            }
            pVar25 = pVar24;
            pVar26 = pVar19;
            pVar27 = pVar21;
            pVar28 = pVar23;
            pVar29 = pVar22;
            pVar30 = pVar20;
        } else {
            if (i16 != 0) {
                pVar10 = null;
            } else {
                pVar10 = pVar3;
            }
            if (i18 != 0) {
                pVar11 = null;
            } else {
                pVar11 = pVar4;
            }
            if (i20 != 0) {
                pVar12 = null;
            } else {
                pVar12 = pVar5;
            }
            if (i22 != 0) {
                pVar13 = null;
            } else {
                pVar13 = pVar6;
            }
            if (i24 != 0) {
                pVar14 = null;
            } else {
                pVar14 = pVar7;
            }
            if (i26 != 0) {
                pVar15 = null;
            } else {
                pVar15 = pVar8;
            }
            if (i28 != 0) {
                z13 = false;
            } else {
                z13 = z10;
            }
            if (i31 != 0) {
                z14 = true;
            } else {
                z14 = z11;
            }
            if (i33 != 0) {
                z15 = false;
            } else {
                z15 = z12;
            }
            if ((i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((i39 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z16 | z17;
            Object objF9 = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (z18) {
                objE = e10.e(new C1260a(6, str, null));
                c1086gP.E(objE);
            } else {
                objE = e10.e(new C1260a(6, str, null));
                c1086gP.E(objE);
            }
            str2 = ((D) objE).f15484a.f15408c;
            zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(jVar, c1086gP, (i29 >> 12) & 14).getValue()).booleanValue();
            if (zBooleanValue) {
                inputPhase = InputPhase.f12493b;
            } else if (str2.length() == 0) {
                inputPhase = InputPhase.f12494c;
            } else {
                inputPhase = InputPhase.f12495d;
            }
            InputPhase inputPhase117 = inputPhase;
            if (!z14) {
                j = textFieldColors.f12368z;
            } else if (z15) {
                j = textFieldColors.f12327A;
            } else if (zBooleanValue) {
                j = textFieldColors.f12366x;
            } else {
                j = textFieldColors.f12367y;
            }
            q0 q0Var3 = (q0) c1086gP.x(TypographyKt.f12404a);
            i38 = i29;
            f10 = q0Var3.j;
            pVar16 = pVar15;
            pVar17 = pVar11;
            long jB5 = f10.b();
            pVar18 = pVar12;
            pVar19 = pVar13;
            long j25 = H.f13504l;
            boolean zC3 = H.c(jB5, j25);
            f11 = q0Var3.f12698l;
            pVar20 = pVar10;
            if (zC3) {
            }
            jB = f11.b();
            if (z19) {
                jB = j;
            }
            jB2 = f10.b();
            if (z19) {
                jB2 = j;
            }
            j10 = jB;
            if (pVar2 != null) {
                z20 = true;
            } else {
                z20 = false;
            }
            pVar21 = pVar14;
            Transition transitionF3 = TransitionKt.f(inputPhase117, "TextFieldInputState", c1086gP, 48, 0);
            e0 e0Var3 = VectorConvertersKt.f9477a;
            b0<S> b0Var3 = transitionF3.f9429a;
            InputPhase inputPhase118 = (InputPhase) b0Var3.a();
            c1086gP.L(-2036730335);
            iOrdinal = inputPhase118.ordinal();
            f12 = 1.0f;
            if (iOrdinal == 0) {
                f13 = 1.0f;
                z21 = false;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f13 = 1.0f;
                z21 = false;
            } else {
                z21 = false;
                f13 = 0.0f;
            }
            c1086gP.T(z21);
            Float fValueOf11 = Float.valueOf(f13);
            C1085f0 c1085f2 = transitionF3.f9432d;
            InputPhase inputPhase119 = (InputPhase) c1085f2.getValue();
            c1086gP.L(-2036730335);
            iOrdinal2 = inputPhase119.ordinal();
            if (iOrdinal2 != 0) {
                z22 = zBooleanValue;
                if (iOrdinal2 == 1) {
                    r10 = 0;
                    f14 = 0.0f;
                } else if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c1086gP.T(r10);
                z23 = z19;
                Transition.d dVarD9 = TransitionKt.d(transitionF3, fValueOf11, Float.valueOf(f14), TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.f12507h.invoke(transitionF3.f(), c1086gP, Integer.valueOf((int) r10)), e0Var3, c1086gP, 196608);
                InputPhase inputPhase1110 = (InputPhase) b0Var3.a();
                c1086gP.L(1435837472);
                iOrdinal3 = inputPhase1110.ordinal();
                if (iOrdinal3 == 0) {
                    f15 = 1.0f;
                    z24 = false;
                } else {
                    if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z20) {
                        f15 = 1.0f;
                        z24 = false;
                    }
                    z24 = false;
                    f15 = 0.0f;
                }
                c1086gP.T(z24);
                Float fValueOf12 = Float.valueOf(f15);
                InputPhase inputPhase1111 = (InputPhase) c1085f2.getValue();
                c1086gP.L(1435837472);
                iOrdinal4 = inputPhase1111.ordinal();
                if (iOrdinal4 == 0) {
                    f16 = 1.0f;
                    r12 = 0;
                } else {
                    if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z20) {
                        f16 = 1.0f;
                        r12 = 0;
                    }
                    r12 = 0;
                    f16 = 0.0f;
                }
                c1086gP.T(r12);
                dVarD = TransitionKt.d(transitionF3, fValueOf12, Float.valueOf(f16), TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.f12509h.invoke(transitionF3.f(), c1086gP, Integer.valueOf((int) r12)), e0Var3, c1086gP, 196608);
                InputPhase inputPhase1112 = (InputPhase) b0Var3.a();
                c1086gP.L(1128033978);
                iOrdinal5 = inputPhase1112.ordinal();
                if (iOrdinal5 == 0) {
                    f17 = 1.0f;
                    z25 = false;
                } else {
                    if (iOrdinal5 != 1) {
                        if (iOrdinal5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z20) {
                        z25 = false;
                        f17 = 0.0f;
                    }
                    f17 = 1.0f;
                    z25 = false;
                }
                c1086gP.T(z25);
                Float fValueOf13 = Float.valueOf(f17);
                InputPhase inputPhase1113 = (InputPhase) c1085f2.getValue();
                c1086gP.L(1128033978);
                iOrdinal6 = inputPhase1113.ordinal();
                if (iOrdinal6 == 0) {
                    r11 = 0;
                } else {
                    if (iOrdinal6 != 1) {
                        if (iOrdinal6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z20) {
                        r11 = 0;
                        f12 = 0.0f;
                    }
                    r11 = 0;
                }
                c1086gP.T(r11);
                dVarD2 = TransitionKt.d(transitionF3, fValueOf13, Float.valueOf(f12), TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.f12510h.invoke(transitionF3.f(), c1086gP, Integer.valueOf((int) r11)), e0Var3, c1086gP, 196608);
                inputPhase2 = (InputPhase) c1085f2.getValue();
                c1086gP.L(-107432127);
                iArr = a.f12511a;
                if (iArr[inputPhase2.ordinal()] == 1) {
                    j11 = j10;
                } else {
                    j11 = jB2;
                }
                c1086gP.T(false);
                cVarF = H.f(j11);
                zK = c1086gP.K(cVarF);
                objF = c1086gP.f();
                if (zK) {
                    objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                    c1086gP.E(objF);
                } else {
                    objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                    c1086gP.E(objF);
                }
                d0 d0Var9 = (d0) objF;
                inputPhase3 = (InputPhase) b0Var3.a();
                c1086gP.L(-107432127);
                if (iArr[inputPhase3.ordinal()] == 1) {
                    z26 = false;
                    j12 = j10;
                } else {
                    j12 = jB2;
                    z26 = false;
                }
                c1086gP.T(z26);
                H h17 = new H(j12);
                inputPhase4 = (InputPhase) c1085f2.getValue();
                c1086gP.L(-107432127);
                if (iArr[inputPhase4.ordinal()] == 1) {
                    j13 = j10;
                } else {
                    j13 = jB2;
                }
                c1086gP.T(false);
                dVarD3 = TransitionKt.d(transitionF3, h17, new H(j13), TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.f12508h.invoke(transitionF3.f(), c1086gP, 0), d0Var9, c1086gP, 196608);
                c1086gP.L(1023351670);
                c1086gP.T(false);
                cVarF2 = H.f(j);
                zK2 = c1086gP.K(cVarF2);
                objF2 = c1086gP.f();
                if (zK2) {
                    objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                    c1086gP.E(objF2);
                } else {
                    objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                    c1086gP.E(objF2);
                }
                d0 d0Var10 = (d0) objF2;
                c1086gP.L(1023351670);
                c1086gP.T(false);
                H h18 = new H(j);
                c1086gP.L(1023351670);
                c1086gP.T(false);
                dVarD4 = TransitionKt.d(transitionF3, h18, new H(j), TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.f12506h.invoke(transitionF3.f(), c1086gP, 0), d0Var10, c1086gP, 196608);
                fFloatValue = ((Number) dVarD9.f9457k.getValue()).floatValue();
                c1086gP.L(-156998101);
                if (pVar2 == null) {
                    composableLambdaImplB = null;
                } else {
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1236585568, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                F fA = G.a(f10, f11, fFloatValue);
                                TextFieldImplKt.b(dVarD4.getValue().f13506a, z23 ? F.a(fA, dVarD3.getValue().f13506a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214) : fA, pVar2, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                }
                c1086gP.T(false);
                if (z14) {
                    textFieldColors2 = textFieldColors;
                    j14 = textFieldColors2.f12330D;
                } else {
                    textFieldColors2 = textFieldColors;
                    if (z15) {
                        j14 = textFieldColors2.f12331E;
                    } else if (z22) {
                        j14 = textFieldColors2.f12328B;
                    } else {
                        j14 = textFieldColors2.f12329C;
                    }
                }
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = J0.e(new Ia.a<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Boolean invoke() {
                            return Boolean.valueOf(dVarD.getValue().floatValue() > 0.0f);
                        }
                    }, Q0.f12888a);
                    c1086gP.E(objF3);
                }
                N0 n18 = (N0) objF3;
                c1086gP.L(-156965270);
                if (pVar20 == null) {
                    z27 = false;
                    composableLambdaImplB2 = null;
                } else {
                    z27 = false;
                    composableLambdaImplB2 = null;
                }
                c1086gP.T(z27);
                if (!z14) {
                    j15 = textFieldColors2.f12338L;
                } else if (z15) {
                    j15 = textFieldColors2.f12339M;
                } else if (z22) {
                    j15 = textFieldColors2.f12336J;
                } else {
                    j15 = textFieldColors2.f12337K;
                }
                objF4 = c1086gP.f();
                if (objF4 == c0153a) {
                    dVar = dVarD2;
                    objF4 = J0.e(new Ia.a<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Boolean invoke() {
                            return Boolean.valueOf(dVar.getValue().floatValue() > 0.0f);
                        }
                    }, Q0.f12888a);
                    c1086gP.E(objF4);
                } else {
                    dVar = dVarD2;
                }
                N0 n19 = (N0) objF4;
                c1086gP.L(-156940524);
                if (pVar19 == null) {
                    z28 = false;
                    composableLambdaImplB3 = null;
                } else {
                    z28 = false;
                    composableLambdaImplB3 = null;
                }
                c1086gP.T(z28);
                if (!z14) {
                    j16 = textFieldColors2.f12342P;
                } else if (z15) {
                    j16 = textFieldColors2.f12343Q;
                } else if (z22) {
                    j16 = textFieldColors2.f12340N;
                } else {
                    j16 = textFieldColors2.f12341O;
                }
                c1086gP.L(-156921964);
                if (pVar21 == null) {
                    z29 = false;
                    composableLambdaImplB4 = null;
                } else {
                    z29 = false;
                    composableLambdaImplB4 = null;
                }
                c1086gP.T(z29);
                if (!z14) {
                    j17 = textFieldColors2.f12360r;
                } else if (z15) {
                    j17 = textFieldColors2.f12361s;
                } else if (z22) {
                    j17 = textFieldColors2.f12358p;
                } else {
                    j17 = textFieldColors2.f12359q;
                }
                c1086gP.L(-156902962);
                if (pVar17 == null) {
                    pVar22 = pVar17;
                    z30 = false;
                    composableLambdaImplB5 = null;
                } else {
                    pVar22 = pVar17;
                    composableLambdaImplB5 = androidx.compose.runtime.internal.a.b(-130107406, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                TextFieldImplKt.c(j17, pVar22, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    z30 = false;
                }
                c1086gP.T(z30);
                if (!z14) {
                    j18 = textFieldColors2.f12364v;
                } else if (z15) {
                    j18 = textFieldColors2.f12365w;
                } else if (z22) {
                    j18 = textFieldColors2.f12362t;
                } else {
                    j18 = textFieldColors2.f12363u;
                }
                c1086gP.L(-156893937);
                if (pVar18 == null) {
                    pVar23 = pVar18;
                    z31 = false;
                    composableLambdaImplB6 = null;
                } else {
                    pVar23 = pVar18;
                    composableLambdaImplB6 = androidx.compose.runtime.internal.a.b(2079816678, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                TextFieldImplKt.c(j18, pVar23, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    z31 = false;
                }
                c1086gP.T(z31);
                if (!z14) {
                    j19 = textFieldColors2.f12334H;
                } else if (z15) {
                    j19 = textFieldColors2.f12335I;
                } else if (z22) {
                    j19 = textFieldColors2.f12332F;
                } else {
                    j19 = textFieldColors2.f12333G;
                }
                c1086gP.L(-156884470);
                if (pVar16 == null) {
                    pVar24 = pVar16;
                    composableLambdaImplB7 = null;
                } else {
                    pVar24 = pVar16;
                    composableLambdaImplB7 = androidx.compose.runtime.internal.a.b(1263707005, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                TextFieldImplKt.b(j19, f11, pVar24, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                }
                c1086gP.T(false);
                iOrdinal7 = textFieldType.ordinal();
                if (iOrdinal7 != 0) {
                    c1086gP.L(-568105095);
                    TextFieldKt.b(androidx.compose.ui.h.a.f13984b, pVar, composableLambdaImplB, composableLambdaImplB2, composableLambdaImplB5, composableLambdaImplB6, composableLambdaImplB3, composableLambdaImplB4, z13, fFloatValue, androidx.compose.runtime.internal.a.b(1750327932, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarB = C1171q.b(androidx.compose.ui.h.a.f13984b, "Container");
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar9;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar5);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar32 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar32);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar31, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), composableLambdaImplB7, l10, c1086gP, ((i39 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | ((i38 << 21) & 234881024), ((i38 >> 9) & 896) | 6);
                    c1086gP.T(false);
                    p293xa.r rVar13 = p293xa.r.f47939a;
                } else if (iOrdinal7 != 1) {
                    c1086gP.L(-565271199);
                    c1086gP.T(false);
                    p293xa.r rVar14 = p293xa.r.f47939a;
                } else {
                    c1086gP.L(-567018607);
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = J0.f(new I.h(0L));
                        c1086gP.E(objF5);
                    }
                    x10 = (X) objF5;
                    ComposableLambdaImpl composableLambdaImplB12 = androidx.compose.runtime.internal.a.b(157291737, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1

                        /* JADX INFO: renamed from: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: TextFieldImpl.kt */
                        final /* synthetic */ class AnonymousClass1 extends MutablePropertyReference0Impl {
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, Oa.i
                            public final Object get() {
                                return ((X) this.receiver).getValue();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarE = OutlinedTextFieldKt.e(C1171q.b(androidx.compose.ui.h.a.f13984b, "Container"), new AnonymousClass1(x10, X.class, "value", "getValue()Ljava/lang/Object;", 0), l10);
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar9;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarE);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar5);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar32 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar32);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar31, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    androidx.compose.ui.h.a aVar5 = androidx.compose.ui.h.a.f13984b;
                    zG = c1086gP.g(fFloatValue);
                    objF6 = c1086gP.f();
                    if (zG) {
                        objF6 = new Ia.l<I.h, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(I.h hVar) {
                                long j26 = hVar.f3769a;
                                float fD = I.h.d(j26) * fFloatValue;
                                float fB = I.h.b(j26) * fFloatValue;
                                if (I.h.d(x10.getValue().f3769a) != fD || I.h.b(x10.getValue().f3769a) != fB) {
                                    x10.setValue(new I.h(Cb.a.b(fD, fB)));
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF6);
                    } else {
                        objF6 = new Ia.l<I.h, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(I.h hVar) {
                                long j26 = hVar.f3769a;
                                float fD = I.h.d(j26) * fFloatValue;
                                float fB = I.h.b(j26) * fFloatValue;
                                if (I.h.d(x10.getValue().f3769a) != fD || I.h.b(x10.getValue().f3769a) != fB) {
                                    x10.setValue(new I.h(Cb.a.b(fD, fB)));
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF6);
                    }
                    OutlinedTextFieldKt.b(aVar5, pVar, composableLambdaImplB2, composableLambdaImplB, composableLambdaImplB5, composableLambdaImplB6, composableLambdaImplB3, composableLambdaImplB4, z13, fFloatValue, (Ia.l) objF6, composableLambdaImplB12, composableLambdaImplB7, l10, c1086gP, ((i39 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | ((i38 << 21) & 234881024), ((i38 >> 6) & 7168) | 48);
                    c1086gP.T(false);
                    p293xa.r rVar15 = p293xa.r.f47939a;
                }
                pVar25 = pVar24;
                pVar26 = pVar19;
                pVar27 = pVar21;
                pVar28 = pVar23;
                pVar29 = pVar22;
                pVar30 = pVar20;
            } else {
                z22 = zBooleanValue;
            }
            f14 = 1.0f;
            r10 = 0;
            c1086gP.T(r10);
            z23 = z19;
            Transition.d dVarD10 = TransitionKt.d(transitionF3, fValueOf11, Float.valueOf(f14), TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.f12507h.invoke(transitionF3.f(), c1086gP, Integer.valueOf((int) r10)), e0Var3, c1086gP, 196608);
            InputPhase inputPhase1114 = (InputPhase) b0Var3.a();
            c1086gP.L(1435837472);
            iOrdinal3 = inputPhase1114.ordinal();
            if (iOrdinal3 == 0) {
                f15 = 1.0f;
                z24 = false;
            } else {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z20) {
                    f15 = 1.0f;
                    z24 = false;
                }
                z24 = false;
                f15 = 0.0f;
            }
            c1086gP.T(z24);
            Float fValueOf14 = Float.valueOf(f15);
            InputPhase inputPhase1115 = (InputPhase) c1085f2.getValue();
            c1086gP.L(1435837472);
            iOrdinal4 = inputPhase1115.ordinal();
            if (iOrdinal4 == 0) {
                f16 = 1.0f;
                r12 = 0;
            } else {
                if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z20) {
                    f16 = 1.0f;
                    r12 = 0;
                }
                r12 = 0;
                f16 = 0.0f;
            }
            c1086gP.T(r12);
            dVarD = TransitionKt.d(transitionF3, fValueOf14, Float.valueOf(f16), TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.f12509h.invoke(transitionF3.f(), c1086gP, Integer.valueOf((int) r12)), e0Var3, c1086gP, 196608);
            InputPhase inputPhase1116 = (InputPhase) b0Var3.a();
            c1086gP.L(1128033978);
            iOrdinal5 = inputPhase1116.ordinal();
            if (iOrdinal5 == 0) {
                f17 = 1.0f;
                z25 = false;
            } else {
                if (iOrdinal5 != 1) {
                    if (iOrdinal5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z20) {
                    z25 = false;
                    f17 = 0.0f;
                }
                f17 = 1.0f;
                z25 = false;
            }
            c1086gP.T(z25);
            Float fValueOf15 = Float.valueOf(f17);
            InputPhase inputPhase1117 = (InputPhase) c1085f2.getValue();
            c1086gP.L(1128033978);
            iOrdinal6 = inputPhase1117.ordinal();
            if (iOrdinal6 == 0) {
                r11 = 0;
            } else {
                if (iOrdinal6 != 1) {
                    if (iOrdinal6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z20) {
                    r11 = 0;
                    f12 = 0.0f;
                }
                r11 = 0;
            }
            c1086gP.T(r11);
            dVarD2 = TransitionKt.d(transitionF3, fValueOf15, Float.valueOf(f12), TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.f12510h.invoke(transitionF3.f(), c1086gP, Integer.valueOf((int) r11)), e0Var3, c1086gP, 196608);
            inputPhase2 = (InputPhase) c1085f2.getValue();
            c1086gP.L(-107432127);
            iArr = a.f12511a;
            if (iArr[inputPhase2.ordinal()] == 1) {
                j11 = j10;
            } else {
                j11 = jB2;
            }
            c1086gP.T(false);
            cVarF = H.f(j11);
            zK = c1086gP.K(cVarF);
            objF = c1086gP.f();
            if (zK) {
                objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                c1086gP.E(objF);
            } else {
                objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                c1086gP.E(objF);
            }
            d0 d0Var11 = (d0) objF;
            inputPhase3 = (InputPhase) b0Var3.a();
            c1086gP.L(-107432127);
            if (iArr[inputPhase3.ordinal()] == 1) {
                z26 = false;
                j12 = j10;
            } else {
                j12 = jB2;
                z26 = false;
            }
            c1086gP.T(z26);
            H h19 = new H(j12);
            inputPhase4 = (InputPhase) c1085f2.getValue();
            c1086gP.L(-107432127);
            if (iArr[inputPhase4.ordinal()] == 1) {
                j13 = j10;
            } else {
                j13 = jB2;
            }
            c1086gP.T(false);
            dVarD3 = TransitionKt.d(transitionF3, h19, new H(j13), TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.f12508h.invoke(transitionF3.f(), c1086gP, 0), d0Var11, c1086gP, 196608);
            c1086gP.L(1023351670);
            c1086gP.T(false);
            cVarF2 = H.f(j);
            zK2 = c1086gP.K(cVarF2);
            objF2 = c1086gP.f();
            if (zK2) {
                objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                c1086gP.E(objF2);
            } else {
                objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                c1086gP.E(objF2);
            }
            d0 d0Var12 = (d0) objF2;
            c1086gP.L(1023351670);
            c1086gP.T(false);
            H h110 = new H(j);
            c1086gP.L(1023351670);
            c1086gP.T(false);
            dVarD4 = TransitionKt.d(transitionF3, h110, new H(j), TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.f12506h.invoke(transitionF3.f(), c1086gP, 0), d0Var12, c1086gP, 196608);
            fFloatValue = ((Number) dVarD10.f9457k.getValue()).floatValue();
            c1086gP.L(-156998101);
            if (pVar2 == null) {
                composableLambdaImplB = null;
            } else {
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1236585568, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            F fA = G.a(f10, f11, fFloatValue);
                            TextFieldImplKt.b(dVarD4.getValue().f13506a, z23 ? F.a(fA, dVarD3.getValue().f13506a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214) : fA, pVar2, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
            }
            c1086gP.T(false);
            if (z14) {
                textFieldColors2 = textFieldColors;
                j14 = textFieldColors2.f12330D;
            } else {
                textFieldColors2 = textFieldColors;
                if (z15) {
                    j14 = textFieldColors2.f12331E;
                } else if (z22) {
                    j14 = textFieldColors2.f12328B;
                } else {
                    j14 = textFieldColors2.f12329C;
                }
            }
            objF3 = c1086gP.f();
            if (objF3 == c0153a) {
                objF3 = J0.e(new Ia.a<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Boolean invoke() {
                        return Boolean.valueOf(dVarD.getValue().floatValue() > 0.0f);
                    }
                }, Q0.f12888a);
                c1086gP.E(objF3);
            }
            N0 n110 = (N0) objF3;
            c1086gP.L(-156965270);
            if (pVar20 == null) {
                z27 = false;
                composableLambdaImplB2 = null;
            } else {
                z27 = false;
                composableLambdaImplB2 = null;
            }
            c1086gP.T(z27);
            if (!z14) {
                j15 = textFieldColors2.f12338L;
            } else if (z15) {
                j15 = textFieldColors2.f12339M;
            } else if (z22) {
                j15 = textFieldColors2.f12336J;
            } else {
                j15 = textFieldColors2.f12337K;
            }
            objF4 = c1086gP.f();
            if (objF4 == c0153a) {
                dVar = dVarD2;
                objF4 = J0.e(new Ia.a<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Boolean invoke() {
                        return Boolean.valueOf(dVar.getValue().floatValue() > 0.0f);
                    }
                }, Q0.f12888a);
                c1086gP.E(objF4);
            } else {
                dVar = dVarD2;
            }
            N0 n111 = (N0) objF4;
            c1086gP.L(-156940524);
            if (pVar19 == null) {
                z28 = false;
                composableLambdaImplB3 = null;
            } else {
                z28 = false;
                composableLambdaImplB3 = null;
            }
            c1086gP.T(z28);
            if (!z14) {
                j16 = textFieldColors2.f12342P;
            } else if (z15) {
                j16 = textFieldColors2.f12343Q;
            } else if (z22) {
                j16 = textFieldColors2.f12340N;
            } else {
                j16 = textFieldColors2.f12341O;
            }
            c1086gP.L(-156921964);
            if (pVar21 == null) {
                z29 = false;
                composableLambdaImplB4 = null;
            } else {
                z29 = false;
                composableLambdaImplB4 = null;
            }
            c1086gP.T(z29);
            if (!z14) {
                j17 = textFieldColors2.f12360r;
            } else if (z15) {
                j17 = textFieldColors2.f12361s;
            } else if (z22) {
                j17 = textFieldColors2.f12358p;
            } else {
                j17 = textFieldColors2.f12359q;
            }
            c1086gP.L(-156902962);
            if (pVar17 == null) {
                pVar22 = pVar17;
                z30 = false;
                composableLambdaImplB5 = null;
            } else {
                pVar22 = pVar17;
                composableLambdaImplB5 = androidx.compose.runtime.internal.a.b(-130107406, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            TextFieldImplKt.c(j17, pVar22, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
                z30 = false;
            }
            c1086gP.T(z30);
            if (!z14) {
                j18 = textFieldColors2.f12364v;
            } else if (z15) {
                j18 = textFieldColors2.f12365w;
            } else if (z22) {
                j18 = textFieldColors2.f12362t;
            } else {
                j18 = textFieldColors2.f12363u;
            }
            c1086gP.L(-156893937);
            if (pVar18 == null) {
                pVar23 = pVar18;
                z31 = false;
                composableLambdaImplB6 = null;
            } else {
                pVar23 = pVar18;
                composableLambdaImplB6 = androidx.compose.runtime.internal.a.b(2079816678, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            TextFieldImplKt.c(j18, pVar23, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
                z31 = false;
            }
            c1086gP.T(z31);
            if (!z14) {
                j19 = textFieldColors2.f12334H;
            } else if (z15) {
                j19 = textFieldColors2.f12335I;
            } else if (z22) {
                j19 = textFieldColors2.f12332F;
            } else {
                j19 = textFieldColors2.f12333G;
            }
            c1086gP.L(-156884470);
            if (pVar16 == null) {
                pVar24 = pVar16;
                composableLambdaImplB7 = null;
            } else {
                pVar24 = pVar16;
                composableLambdaImplB7 = androidx.compose.runtime.internal.a.b(1263707005, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            TextFieldImplKt.b(j19, f11, pVar24, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
            }
            c1086gP.T(false);
            iOrdinal7 = textFieldType.ordinal();
            if (iOrdinal7 != 0) {
                c1086gP.L(-568105095);
                TextFieldKt.b(androidx.compose.ui.h.a.f13984b, pVar, composableLambdaImplB, composableLambdaImplB2, composableLambdaImplB5, composableLambdaImplB6, composableLambdaImplB3, composableLambdaImplB4, z13, fFloatValue, androidx.compose.runtime.internal.a.b(1750327932, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h hVarB = C1171q.b(androidx.compose.ui.h.a.f13984b, "Container");
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar9;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar6);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar32 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar32);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar31, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), composableLambdaImplB7, l10, c1086gP, ((i39 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | ((i38 << 21) & 234881024), ((i38 >> 9) & 896) | 6);
                c1086gP.T(false);
                p293xa.r rVar16 = p293xa.r.f47939a;
            } else if (iOrdinal7 != 1) {
                c1086gP.L(-565271199);
                c1086gP.T(false);
                p293xa.r rVar17 = p293xa.r.f47939a;
            } else {
                c1086gP.L(-567018607);
                objF5 = c1086gP.f();
                if (objF5 == c0153a) {
                    objF5 = J0.f(new I.h(0L));
                    c1086gP.E(objF5);
                }
                x10 = (X) objF5;
                ComposableLambdaImpl composableLambdaImplB13 = androidx.compose.runtime.internal.a.b(157291737, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1

                    /* JADX INFO: renamed from: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: TextFieldImpl.kt */
                    final /* synthetic */ class AnonymousClass1 extends MutablePropertyReference0Impl {
                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, Oa.i
                        public final Object get() {
                            return ((X) this.receiver).getValue();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h hVarE = OutlinedTextFieldKt.e(C1171q.b(androidx.compose.ui.h.a.f13984b, "Container"), new AnonymousClass1(x10, X.class, "value", "getValue()Ljava/lang/Object;", 0), l10);
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar9;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarE);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar6);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar32 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar32);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar31, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
                androidx.compose.ui.h.a aVar6 = androidx.compose.ui.h.a.f13984b;
                zG = c1086gP.g(fFloatValue);
                objF6 = c1086gP.f();
                if (zG) {
                    objF6 = new Ia.l<I.h, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(I.h hVar) {
                            long j26 = hVar.f3769a;
                            float fD = I.h.d(j26) * fFloatValue;
                            float fB = I.h.b(j26) * fFloatValue;
                            if (I.h.d(x10.getValue().f3769a) != fD || I.h.b(x10.getValue().f3769a) != fB) {
                                x10.setValue(new I.h(Cb.a.b(fD, fB)));
                            }
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF6);
                } else {
                    objF6 = new Ia.l<I.h, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(I.h hVar) {
                            long j26 = hVar.f3769a;
                            float fD = I.h.d(j26) * fFloatValue;
                            float fB = I.h.b(j26) * fFloatValue;
                            if (I.h.d(x10.getValue().f3769a) != fD || I.h.b(x10.getValue().f3769a) != fB) {
                                x10.setValue(new I.h(Cb.a.b(fD, fB)));
                            }
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF6);
                }
                OutlinedTextFieldKt.b(aVar6, pVar, composableLambdaImplB2, composableLambdaImplB, composableLambdaImplB5, composableLambdaImplB6, composableLambdaImplB3, composableLambdaImplB4, z13, fFloatValue, (Ia.l) objF6, composableLambdaImplB13, composableLambdaImplB7, l10, c1086gP, ((i39 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | ((i38 << 21) & 234881024), ((i38 >> 6) & 7168) | 48);
                c1086gP.T(false);
                p293xa.r rVar18 = p293xa.r.f47939a;
            }
            pVar25 = pVar24;
            pVar26 = pVar19;
            pVar27 = pVar21;
            pVar28 = pVar23;
            pVar29 = pVar22;
            pVar30 = pVar20;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final boolean z35 = z13;
            final boolean z36 = z14;
            final boolean z37 = z15;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TextFieldImplKt.a(textFieldType, str, pVar, e10, pVar2, pVar30, pVar29, pVar28, pVar26, pVar27, pVar25, z35, z36, z37, jVar, l10, textFieldColors, pVar9, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void b(final long j, final F f10, final Ia.p pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(1208685580);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.i(j) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(f10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(pVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            ProvideContentColorTextStyleKt.a(j, f10, pVar, c1086gP, i11 & 1022);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TextFieldImplKt.b(j, f10, pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void c(final long j, final Ia.p pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(660142980);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.i(j) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            CompositionLocalKt.a(B7.b.b(j, ContentColorKt.f12125a), pVar, c1086gP, (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TextFieldImplKt.c(j, pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final X d(boolean z10, boolean z11, boolean z12, TextFieldColors textFieldColors, float f10, float f11, InterfaceC1084f interfaceC1084f, int i10) {
        long j;
        N0 n0I;
        N0 n0I2;
        if (!z10) {
            j = textFieldColors.f12356n;
        } else if (z11) {
            j = textFieldColors.f12357o;
        } else {
            j = z12 ? textFieldColors.f12354l : textFieldColors.f12355m;
        }
        if (z10) {
            interfaceC1084f.L(1023053998);
            n0I = androidx.compose.animation.x.a(j, C0907g.d(150, 0, null, 6), null, interfaceC1084f, 48, 12);
            interfaceC1084f.D();
        } else {
            interfaceC1084f.L(1023165505);
            n0I = J0.i(new H(j), interfaceC1084f);
            interfaceC1084f.D();
        }
        if (z10) {
            interfaceC1084f.L(1023269417);
            n0I2 = C0902b.a(z12 ? f10 : f11, C0907g.d(150, 0, null, 6), interfaceC1084f, 48, 12);
            interfaceC1084f.D();
        } else {
            interfaceC1084f.L(1023478388);
            n0I2 = J0.i(new p013b0.f(f11), interfaceC1084f);
            interfaceC1084f.D();
        }
        return J0.i(C1787c0.a(((p013b0.f) n0I2.getValue()).f20481b, ((H) n0I.getValue()).f13506a), interfaceC1084f);
    }

    public static final androidx.compose.ui.h e(androidx.compose.ui.h hVar, boolean z10, final String str) {
        return z10 ? androidx.compose.ui.semantics.p.b(hVar, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$defaultErrorSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                String str2 = str;
                Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                wVar.e(SemanticsProperties.f15144J, str2);
                return p293xa.r.f47939a;
            }
        }) : hVar;
    }

    public static final Object f(InterfaceC1166l interfaceC1166l) {
        Object objQ = interfaceC1166l.q();
        InterfaceC1172s interfaceC1172s = objQ instanceof InterfaceC1172s ? (InterfaceC1172s) objQ : null;
        if (interfaceC1172s != null) {
            return interfaceC1172s.Z();
        }
        return null;
    }

    public static final int g(Y y10) {
        if (y10 != null) {
            return y10.f14221c;
        }
        return 0;
    }

    public static final androidx.compose.ui.h h(androidx.compose.ui.h hVar, final TextFieldDefaults.a aVar, final l0 l0Var) {
        return androidx.compose.ui.draw.f.b(hVar, new Ia.l<CacheDrawScope, androidx.compose.ui.draw.g>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$textFieldBackground$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final androidx.compose.ui.draw.g invoke(CacheDrawScope cacheDrawScope) {
                CacheDrawScope cacheDrawScope2 = cacheDrawScope;
                final androidx.compose.ui.graphics.b0 b0VarMo0createOutlinePq9zytI = l0Var.mo0createOutlinePq9zytI(cacheDrawScope2.f13369b.j(), cacheDrawScope2.f13369b.getLayoutDirection(), cacheDrawScope2);
                final androidx.compose.ui.graphics.L l10 = aVar;
                return cacheDrawScope2.c(new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$textFieldBackground$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        c0.c(eVar, b0VarMo0createOutlinePq9zytI, l10.a());
                        return p293xa.r.f47939a;
                    }
                });
            }
        });
    }

    public static final int i(Y y10) {
        if (y10 != null) {
            return y10.f14220b;
        }
        return 0;
    }
}
