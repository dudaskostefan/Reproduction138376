import { createElement } from "react";
const React = { createElement };

import { ActionProperty } from "mendix/ActionProperty";
import { ExpressionProperty } from "mendix/ExpressionProperty";
import { StyleProperty } from "mendix/StyleProperty";

import { Button } from "mendix/Button";
import { addEnumerations, asPluginWidgets, t } from "mendix/native";

import { mainContent, sidebar } from "C:/Mendix/Reproduction138376-main/deployment/native/layouts/Atlas_Core.NativePhone_FullPage.js";

import * as styles from "../styles.js";

const { $Button } = asPluginWidgets({ Button });

const placeholder$Main = () => [
    <$Button key="p2.BERT.Home_Native_2.actionButton1"
        $widgetId="p2.BERT.Home_Native_2.actionButton1"
        style={StyleProperty({
            "styles": [ styles.ActionButton ]
        })}
        caption={t([
            ExpressionProperty({
                "expression": { "expr": { "type": "literal", "value": "Call models" }, "args": {} }
            })
        ])}
        icon={undefined}
        onClick={ActionProperty({
            "action": { "type": "callNanoflow", "argMap": {}, "config": { "nanoflow": () => require("C:/Mendix/Reproduction138376-main/deployment/native/nanoflows/BERT.ACT_User_Question_Submitted").ACT_User_Question_Submitted }, "disabledDuringExecution": true }
        })}
        screenReaderCaption={t([
            ExpressionProperty({
                "expression": { "expr": { "type": "literal", "value": "" }, "args": {} }
            })
        ])}
        screenReaderHint={t([
            ExpressionProperty({
                "expression": { "expr": { "type": "literal", "value": "" }, "args": {} }
            })
        ])}
        accessible={true} />
];

export const $$title = t([
    "Home Native"
]);

export const $$style = [ styles.Layout, styles.Page ];

export const $$parameters = [];
export const $$page = () => mainContent(placeholder$Main);

export const $$sidebar = () => sidebar(placeholder$Main);

