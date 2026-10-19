package io.intercom.android.sdk.blocks.lib;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum BlockAlignment {
    LEFT { // from class: io.intercom.android.sdk.blocks.lib.BlockAlignment.1
        @Override // io.intercom.android.sdk.blocks.lib.BlockAlignment
        public int getGravity() {
            return 8388611;
        }
    },
    CENTER { // from class: io.intercom.android.sdk.blocks.lib.BlockAlignment.2
        @Override // io.intercom.android.sdk.blocks.lib.BlockAlignment
        public int getGravity() {
            return 1;
        }
    },
    RIGHT { // from class: io.intercom.android.sdk.blocks.lib.BlockAlignment.3
        @Override // io.intercom.android.sdk.blocks.lib.BlockAlignment
        public int getGravity() {
            return 8388613;
        }
    };

    public static BlockAlignment alignValueOf(String str) {
        BlockAlignment blockAlignment = LEFT;
        try {
            return valueOf(str.toUpperCase(Locale.ENGLISH));
        } catch (IllegalArgumentException | NullPointerException unused) {
            return blockAlignment;
        }
    }

    public abstract int getGravity();
}
