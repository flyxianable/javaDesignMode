package com.lyb.designmode.single_instance.kotlin

class SingleCheckSafeLazyInstanceKotlin private constructor() {
    companion object {
        val instance: SingleCheckSafeLazyInstanceKotlin
        by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) { SingleCheckSafeLazyInstanceKotlin() }

    }

}