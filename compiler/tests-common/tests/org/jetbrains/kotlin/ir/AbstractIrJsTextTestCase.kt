/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir

import org.jetbrains.kotlin.ir.declarations.*
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi2ir.Psi2IrTranslator

abstract class AbstractIrJsTextTestCase : AbstractIrTextTestCase() {
    override fun doGenerateIrModule(
        psi2IrTranslator: Psi2IrTranslator,
        shouldGenerate: (KtFile) -> Boolean
    ): IrModuleFragment =
        generateIrModuleWithJsResolve(myFiles.psiFiles, myEnvironment, psi2IrTranslator, shouldGenerate)
}
