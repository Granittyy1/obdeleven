package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", l = {347}, m = "invokeSuspend")
public final class CoreTextFieldKt$CoreTextField$2$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.ui.text.input.l $imeOptions;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ LegacyTextFieldState $state;
    final /* synthetic */ androidx.compose.ui.text.input.y $textInputService;
    final /* synthetic */ N0<Boolean> $writeable$delegate;
    int label;

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LegacyTextFieldState f11079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.input.y f11080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f11081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.input.l f11082e;

        public a(LegacyTextFieldState legacyTextFieldState, androidx.compose.ui.text.input.y yVar, TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.l lVar) {
            this.f11079b = legacyTextFieldState;
            this.f11080c = yVar;
            this.f11081d = textFieldSelectionManager;
            this.f11082e = lVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            LegacyTextFieldState legacyTextFieldState = this.f11079b;
            if (zBooleanValue && legacyTextFieldState.b()) {
                TextFieldSelectionManager textFieldSelectionManager = this.f11081d;
                CoreTextFieldKt.f(this.f11080c, legacyTextFieldState, textFieldSelectionManager.l(), this.f11082e, textFieldSelectionManager.f11553b);
            } else {
                CoreTextFieldKt.e(legacyTextFieldState);
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$2$1(LegacyTextFieldState legacyTextFieldState, N0<Boolean> n10, androidx.compose.ui.text.input.y yVar, TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.l lVar, kotlin.coroutines.c<? super CoreTextFieldKt$CoreTextField$2$1> cVar) {
        super(2, cVar);
        this.$state = legacyTextFieldState;
        this.$writeable$delegate = n10;
        this.$textInputService = yVar;
        this.$manager = textFieldSelectionManager;
        this.$imeOptions = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CoreTextFieldKt$CoreTextField$2$1(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((CoreTextFieldKt$CoreTextField$2$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.b.b(obj);
                final N0<Boolean> n10 = this.$writeable$delegate;
                kotlinx.coroutines.flow.t tVarJ = J0.j(new Ia.a<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Boolean invoke() {
                        Boolean value = n10.getValue();
                        value.booleanValue();
                        return value;
                    }
                });
                a aVar = new a(this.$state, this.$textInputService, this.$manager, this.$imeOptions);
                this.label = 1;
                if (tVarJ.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            CoreTextFieldKt.e(this.$state);
            return p293xa.r.f47939a;
        } catch (Throwable th) {
            CoreTextFieldKt.e(this.$state);
            throw th;
        }
    }
}
