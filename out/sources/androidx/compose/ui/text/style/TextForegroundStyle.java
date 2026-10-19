package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.H;

/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes.dex */
public interface TextForegroundStyle {

    /* JADX INFO: compiled from: TextForegroundStyle.kt */
    public static final class a implements TextForegroundStyle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15653a = new a();

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public final float a() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public final long c() {
            int i10 = H.f13505m;
            return H.f13504l;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public final C e() {
            return null;
        }
    }

    float a();

    default TextForegroundStyle b(Ia.a<? extends TextForegroundStyle> aVar) {
        return !equals(a.f15653a) ? this : aVar.invoke();
    }

    long c();

    default TextForegroundStyle d(TextForegroundStyle textForegroundStyle) {
        boolean z10 = textForegroundStyle instanceof b;
        if (!z10 || !(this instanceof b)) {
            if (!z10 || (this instanceof b)) {
                return (z10 || !(this instanceof b)) ? textForegroundStyle.b(new Ia.a<TextForegroundStyle>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$2
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final TextForegroundStyle invoke() {
                        return this.this$0;
                    }
                }) : this;
            }
            return textForegroundStyle;
        }
        b bVar = (b) textForegroundStyle;
        Ia.a<Float> aVar = new Ia.a<Float>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$1
            {
                super(0);
            }

            @Override // Ia.a
            public final Float invoke() {
                return Float.valueOf(this.this$0.a());
            }
        };
        float fFloatValue = ((b) textForegroundStyle).f15656b;
        if (Float.isNaN(fFloatValue)) {
            fFloatValue = ((Number) aVar.invoke()).floatValue();
        }
        return new b(bVar.f15655a, fFloatValue);
    }

    C e();
}
