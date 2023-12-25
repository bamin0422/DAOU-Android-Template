package com.daou.android

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import com.daou.android.emptyactivity.projectTemplate

class DaouProjectTemplatesProvider : WizardTemplateProvider() {

  override fun getTemplates(): List<Template> {
    return listOf(projectTemplate)
  }
}
